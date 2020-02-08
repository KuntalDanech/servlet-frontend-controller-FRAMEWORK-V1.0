package com.kuntal.fronendcontroller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.reflections.Reflections;

import com.kuntal.annotations.Annotations.CONTROLLER;
import com.kuntal.annotations.Annotations.DELETE;
import com.kuntal.exceptions.DuplicateMethodNameException;
import com.kuntal.utilities.UtilityMethods;

/**
 * 
 * @author Danech Kuntal
 *
 */
public class DELETEDispatch implements IDispatch {

	private static final Logger LOGGER = Logger.getLogger(DELETEDispatch.class.getName());

	/**
	 * Sigleton class
	 */
	private DELETEDispatch() {
	}
	
	private static DELETEDispatch dispatch;
	/**
	 * Singleton design pattern using static block
	 */
	static {
		dispatch = new DELETEDispatch();
	}

	public static DELETEDispatch getDELETEDispatcher() {
		return dispatch;
	}

	public void dispatchRequest(HttpServletRequest request, HttpServletResponse response) {

		Reflections reflections = UtilityMethods.getReflections();
		Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(CONTROLLER.class);
		List<String> methodNames = new ArrayList<>();
		Set<String> duplicateMethodNames = new HashSet<>();
		for (Class cls : annotated) {
			Method[] methods = cls.getMethods();
			for (Method method : methods) {
				methodNames.add(method.getName());
			}
		}
		for (int i = 0; i < methodNames.size(); i++) {
			for (int j = i + 1; j < methodNames.size(); j++) {
				if (methodNames.get(i).equals(methodNames.get(j))) {
					duplicateMethodNames.add(methodNames.get(i));
				}
			}
		}
		if (duplicateMethodNames.size() <= 7) {
			for (Class cls : annotated) {
				Method[] methods = cls.getMethods();
				for (Method method : methods) {
					String name = method.getName();
					
					if (request.getPathInfo().equalsIgnoreCase("/" + method.getName())) {
						try {
							if (method.isAnnotationPresent(DELETE.class)) {

								if (!name.equalsIgnoreCase("wait") && !name.equalsIgnoreCase("equals")
										&& !name.equalsIgnoreCase("toString") && !name.equalsIgnoreCase("notify")
										&& !name.equalsIgnoreCase("notifyAll") && !name.equalsIgnoreCase("getClass")
										&& !name.equalsIgnoreCase("hashCode")) {

									method.invoke(Class.forName(cls.getName()).newInstance(), request, response);
									return;
								}else {
									LOGGER.log(Level.WARNING, "Please do not use Object class methods as request");
								}
							}
						} catch (Exception e) {
							response.setStatus(500);
							LOGGER.log(Level.SEVERE, e.getMessage());
							e.printStackTrace();
						}
					}
				}
				response.setStatus(404);
			}
		} else {
			for (String method : duplicateMethodNames) {
				if (!method.equalsIgnoreCase("wait") && !method.equalsIgnoreCase("equals")
						&& !method.equalsIgnoreCase("toString") && !method.equalsIgnoreCase("notify")
						&& !method.equalsIgnoreCase("notifyAll") && !method.equalsIgnoreCase("getClass")
						&& !method.equalsIgnoreCase("hashCode")) {
					response.setStatus(404);
					throw new DuplicateMethodNameException(
							method + " - method is duplicated, please check controller's calss methods");
				}
			}
		}
	}
}