package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DeleteDaoImp;
import com.dao.InsertDaoImp;

public class Education extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//validation
		
		//dao
		String check=request.getParameter("check");
		HttpSession session = request.getSession();
		if(check!=null)
		{
			if(check.equals("deleteeducation"))
			{
				String sn=request.getParameter("sn");
				String year = request.getParameter("year");
				String title = request.getParameter("title");
				String subtitle = request.getParameter("subtitle");
				String desc = request.getParameter("description");
				
				String result=new DeleteDaoImp().deleteEducation(Integer.parseInt(sn),year,title,subtitle,desc);
				if(result.equals("deleted"))
				{
					session.setAttribute("msg", "Education deleteted successfully");
					response.sendRedirect("deleteeducation.jsp");
				}
				else
				{
					session.setAttribute("msg", "something went wrong");
					response.sendRedirect("deleteeducation.jsp");
				}
			}
			else
			{

				String year = request.getParameter("year");
				String title = request.getParameter("title");
				String subtitle = request.getParameter("subtitle");
				String desc = request.getParameter("description");
				
				String res = new InsertDaoImp().saveEducation(year,title,subtitle,desc);
				
				if(res.equals("saved"))
				{
					session.setAttribute("msg", "education added successfully");
					response.sendRedirect("addedu.jsp");
				}
				else
				{
					session.setAttribute("msg", "something went wrong");
					response.sendRedirect("addedu.jsp");
				}
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
		
	


