It is basically Front End Controller design pattern,It dispatches servlet request to controller's class(@CONTROLLER) which is defined by programmer in the servlet project.  
  
It is Highly recommanded for servlet developers.  
  
It is light weight module, don't require to add any plugins and don't require to add servlet implementation for each and every request.(Yes you can do this with the help of @WebServlet("/first","/second") but it is not recommanded to do in industries, as make code easier to understand)  
  
Purpose of these small framework is to seperate out request's dispatch process in controller as it is difficult in only servlet and if we dont want to use spring or other heavy weighted framework in small projects then we can make use of it or else we can make our own framework as per the requirement of project.  
  
Steps to start making controller.  
---------------------------------  
1. Import the given project.  
2.Under controller package make top level class using @CONTROLLER annotations and method name will be considered as a request name.  
  
eg:  
  
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
	@DELETE  
	public void deleteRequest(HttpServletRequest request, HttpServletResponse response) {  
		try {  
			response.getWriter().println("<h1>Index method is called</h1>");  
		} catch (IOException e) {  
			// TODO Auto-generated catch block  
			e.printStackTrace();  
		}  
	}  
}  

NOTE : Make method parameters same as servlet's doGet(HttpServletRequest request, HttpServletResponse response) and doPost(HttpServletRequest request, HttpServletResponse response) method, so that each and every method acts as seperate servlet and it will be not difficult for us to understand and we can do anything with this parameters as we have been doing in servlets.  

It supports seven HTTP requests Get, Post, Delete, Options, Trace, Head, Put, by using following annotations @GET, @POST, @DELETE, @OPTION, @TRACE, @HEAD, @PUT.  

HomeController class acts as a Controller, and index acts as request name.  

URL :   
http://localhost:8080/DesingPatternFronEndController/index  

Output:  
-------  
"Index method is called" will be printed in browser.    

Pre-conditions:  
---------------  
	1. Method name should not be duplicated in whole project as it will be considered as request name.  
	2. You should not include method of Object's class in @CONTROLLER annotation's class(Simply do not use toString, wait, notify etc. methods in controller class).  
