package com.kuntal.utilities;

import org.reflections.Reflections;

/**
 * 
 * @author Danech Kuntal
 *
 */
public class UtilityMethods {

	private UtilityMethods() {}
	
	private static Reflections reflections;
	/**
	 * Singleton design pattern by using static block
	 */
	static {
		reflections = new Reflections("");
	}
	public static Reflections getReflections() {
		return reflections;
	}
}
