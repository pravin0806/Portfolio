<%
String getlogin=(String)session.getAttribute("login");
if(getlogin==null)
{
	response.sendRedirect("adminlogin.jsp");
}
%>

<%@page import="com.model.MessagePojo"%>
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
  <h1 style="text-align: center; color: red;">Read Message Section</h1>
  
  <%@include file="MessageBox/message.jsp" %>
  <% 
      //////////////////////////////////////////
      ReadDaoImp read=new ReadDaoImp();
      ArrayList<MessagePojo> al =read.readMessage();
      for(MessagePojo m:al)
      {
  %>
      SN: <%=m.getSn() %><br>
      Name:<%=m.getName() %><br>
      Email:<%=m.getEmail() %><br>
      Message:<%=m.getMessage()%><br>
      Date:<%=m.getDate() %><br>
      <form action="DeleteMessage" method="post">
         <input type="hidden" name="sn" value="<%=m.getSn() %>">
         <button>delete</button>
      </form><br><br>
       <a href="admin.jsp">home</a>
  <%
      }
  %>
  
  
  
  
  
  
  
  
  
  
  
</body>
</html>