<%
   String getlogin=(String)session.getAttribute("login");
   if(getlogin==null)
   {
	   response.sendRedirect("adminlogin.jsp");
   }

%>
<%@page import="com.model.ProjectPojo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.ReadDaoImp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="MessageBox/message.jsp" %>

      <% 
         ArrayList<ProjectPojo> al= new ReadDaoImp().readProject();
         for(ProjectPojo p:al)
         {
      %>  
           <img style="height: 100px;" alt="" src="mydata/project/<%=p.getFilename()%>">
           <br>
           <form action="AddProject" method="post" >
               <input type="hidden" name="sn" value="<%=p.getSn()%>">
                <input type="hidden" name="filename" value="<%=p.getFilename()%>">
               <input type="hidden" name="check" value="deleteproject" >
              <button>delete</button>
           </form> <br><br>
             
   
  
      <%} %>
</body>
</html>