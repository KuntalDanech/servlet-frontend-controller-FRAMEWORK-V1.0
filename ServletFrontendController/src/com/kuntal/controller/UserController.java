package com.kuntal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kuntal.annotations.Annotations.CONTROLLER;
import com.kuntal.annotations.Annotations.GET;

@CONTROLLER
public class UserController {
	@GET
	public void userIndexPage(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.getWriter().println("<h1>This is UserController class's method</h1>");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
