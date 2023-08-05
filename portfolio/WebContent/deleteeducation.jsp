<%@page import="com.model.EducationPojo"%>
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
           ArrayList<EducationPojo> al=new ReadDaoImp().readEdcation();
           for(EducationPojo p:al)
           {
        %>
        	   <form action="Education" method="post">
        	   <input type="hidden" name="sn" value="<%=p.getSn()%>">
        	   <input type="hidden" name="year" value="<%=p.getYear()%>">
        	   <input type="hidden" name="title" value="<%=p.getTitle() %>">
        	   <input type="hidden" name="subtitle" value="<%=p.getSubtitle()%>">
        	   <input type="hidden" name="description" value="<%=p.getDesc()%>">
        	    <input type="hidden" name="check" value="deleteeducation">
        	    <button>delete</button><br><br>
        	    </form>
        	   
           <%} %>


</body>
</html>