package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.InsertDao;
import com.dao.InsertDaoImp;
import com.validation.Validation;

public class SaveMessage extends HttpServlet {
	private  String result;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String message=request.getParameter("message");
		Validation v=new Validation();
		String Validation=v.Checkdata(name, email, message);
		if(Validation.equals("validinformation"))
		{
			InsertDao i=new InsertDaoImp();
			 result=i.SaveMessage(name,email,message);
		}
		System.out.println(result);
		HttpSession se =request.getSession();
		if(result.equals("saved"))
		{
			se.setAttribute("msg", "message sent sucessfully");
			response.sendRedirect("index.jsp");
		}
		else
		{

			se.setAttribute("msg", "something went wrong");
			response.sendRedirect("index.jsp");
		}
		
		
		

		
	}

	}


