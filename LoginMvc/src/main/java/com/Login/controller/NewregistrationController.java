package com.Login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.StudentaApp.model.DaoService;
import com.StudentaApp.model.DaoServiceImpl;


@WebServlet("/newData")
public class NewregistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public NewregistrationController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/registration.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		DaoService  Service  = new DaoServiceImpl();
		Service.connectionDB();
		Service.saveReg(name,city,email,mobile);
		
		request.setAttribute("msg", "Your Record is saved into Database");
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/registration.jsp");
		rd.forward(request, response);
	
		}
	

}
