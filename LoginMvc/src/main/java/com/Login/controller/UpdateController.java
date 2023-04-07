package com.Login.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.StudentaApp.model.DaoService;
import com.StudentaApp.model.DaoServiceImpl;


@WebServlet("/Update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
	
		request.setAttribute("email", email);	
		request.setAttribute("mobile", mobile);
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/Update.jsp");
	rd.forward(request, response);
	
	        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	DaoService  service =new DaoServiceImpl();
    service.connectionDB();
    service.updateReg(email, mobile);
    ResultSet result = service.ListRegistration();
	request.setAttribute("result", result);
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/List.jsp");
	rd.forward(request, response);
		
	}

}