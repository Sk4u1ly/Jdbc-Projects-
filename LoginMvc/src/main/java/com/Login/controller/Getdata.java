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


@WebServlet("/List")
public class Getdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Getdata() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	DaoService service = new DaoServiceImpl();
	service.connectionDB();
	ResultSet result = service.ListRegistration();
	request.setAttribute("result", result);
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/List.jsp");
	rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
