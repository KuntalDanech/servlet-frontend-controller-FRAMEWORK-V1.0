package com.kuntal.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.kuntal.annotations.Annotations.CONTROLLER;
import com.kuntal.annotations.Annotations.DELETE;
import com.kuntal.annotations.Annotations.GET;
import com.kuntal.annotations.Annotations.OPTION;
import com.kuntal.annotations.Annotations.POST;

@CONTROLLER
public class HomeController {
	@GET	
	public void index(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.getWriter().println("<h1>Index method is called</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@POST
	public void home(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.getWriter().println("<h1>Home method is called</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@DELETE
	public void deleteMethod(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.getWriter().println("<h1>Delete request method</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@OPTION
	public void optionMethod(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.getWriter().println("<h1>Option request method</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}