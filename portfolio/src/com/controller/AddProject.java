package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.dao.DeleteDaoImp;
import com.dao.InsertDaoImp;
import com.validation.ProjectValidation;

@MultipartConfig
public class AddProject extends HttpServlet {
	private Object result;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String check = request.getParameter("check");
		HttpSession session = request.getSession();
		if(check!=null) {
			if(check.equals("deleteproject")) {
				//delete Project
				String sn = request.getParameter("sn");
				String filename = request.getParameter("filename");
				request.getSession();				
				//dao
				this.result = new DeleteDaoImp().deleteProject(Integer.parseInt(sn), filename);
			    if(result.equals("deleted"))
			    {
			    	session.setAttribute("msg", "project deleted successfully");
			    	response.sendRedirect("deleteproject.jsp");
			    }
			    else  {
			    	session.setAttribute("msg", "someething went wrong");
			    	response.sendRedirect("deleteproject.jsp");
			    }
			}
		}
		else
		{
		
		
		
		
		Part part = request.getPart("project");
		String filename = part.getSubmittedFileName();
		
		//validation
		
		String result = new ProjectValidation().validate(part);
		
		if(result.equals("valid"))
		{
		
		String res = new InsertDaoImp().saveProject(filename);
		
		if (res.equals("saved")) {
			InputStream is = part.getInputStream();
			byte[] b = is.readAllBytes();
			String path ="C:\\Users\\Admin\\Desktop\\advjava\\portfolio\\WebContent\\mydata\\project\\"+ filename;
					
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(b);
			session.setAttribute("msg", "project added successfully");
			response.sendRedirect("addproject.jsp");
		} else {
			session.setAttribute("msg", "something went wrong");
			response.sendRedirect("addproject.jsp");
		}
		}
	
		else
		{
			session.setAttribute("msg", result);
			response.sendRedirect("addproject.jsp");
		}
}

		}
}

