package com.kuntal.fronendcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Danech Kuntal
 * Servlet implementation class FrontEndServlet
 * 
 */
@WebServlet("/*")
public class FrontEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FrontEndController contoller = FrontEndController.getFrontEndController();
    /**
     * Default constructor. 
     */
    public FrontEndServlet() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	System.out.println("*********************Servlet Frontend Controller's Framework V1.0*********************");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		contoller.setDoGet(true);
		contoller.setDoHead(false);
		contoller.setDoPost(false);
		contoller.setDoDelete(false);
		contoller.setDoOptions(false);
		contoller.setDoPut(false);
		contoller.setDoTrace(false);
		contoller.dispatchRequest(request,response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		contoller.setDoPost(true);
		contoller.setDoHead(false);
		contoller.setDoGet(false);
		contoller.setDoPut(false);
		contoller.setDoDelete(false);
		contoller.setDoOptions(false);
		contoller.setDoTrace(false);
		contoller.dispatchRequest(request,response);
	}
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		contoller.setDoDelete(true);
		contoller.setDoHead(false);
		contoller.setDoGet(false);
		contoller.setDoPost(false);
		contoller.setDoOptions(false);
		contoller.setDoPut(false);
		contoller.setDoTrace(false);
		contoller.dispatchRequest(request,response);
	}
	@Override
	protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		contoller.setDoHead(true);
		contoller.setDoGet(false);
		contoller.setDoPost(false);
		contoller.setDoDelete(false);
		contoller.setDoOptions(false);
		contoller.setDoPut(false);
		contoller.setDoTrace(false);
		contoller.dispatchRequest(request,response);
	}
	@Override
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		contoller.setDoOptions(true);
		contoller.setDoHead(false);
		contoller.setDoGet(false);
		contoller.setDoPost(false);
		contoller.setDoDelete(false);
		contoller.setDoPut(false);
		contoller.setDoTrace(false);
		contoller.dispatchRequest(request,response);
	}
	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		contoller.setDoPut(true);
		contoller.setDoHead(false);
		contoller.setDoGet(false);
		contoller.setDoDelete(false);
		contoller.setDoOptions(false);
		contoller.setDoPost(false);
		contoller.setDoTrace(false);
		contoller.dispatchRequest(request,response);
	}
	@Override
	protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		contoller.setDoTrace(true);
		contoller.setDoHead(false);
		contoller.setDoGet(false);
		contoller.setDoPost(false);
		contoller.setDoDelete(false);
		contoller.setDoOptions(false);
		contoller.setDoPut(false);
		contoller.dispatchRequest(request,response);
	}
}