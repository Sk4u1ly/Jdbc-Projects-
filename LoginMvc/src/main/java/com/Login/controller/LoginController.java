package com.Login.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.StudentaApp.model.DaoService;
import com.StudentaApp.model.DaoServiceImpl;


@WebServlet("/save")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
      
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String Userid = request.getParameter("userid");
		String Passwd= request.getParameter("password");
		
		
		DaoService service =new DaoServiceImpl();
		service.connectionDB();
		
		
		boolean status = service.verifyCredentials(Userid, Passwd);
		if (status==true) {
			HttpSession session = request.getSession(true);
			session.getAttribute(Userid);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/registration.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("error", "Invalid userid/password");
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

}
