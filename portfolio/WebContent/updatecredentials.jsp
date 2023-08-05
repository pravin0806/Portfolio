
<%@page import="com.model.ReadCredentialPojo"%>
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
	     ReadDaoImp r=new ReadDaoImp();
	     ReadCredentialPojo rc=r. readCreadential();
	%>

    <form action="UpdateCredential" method="post">
         Enter Username:<br>
        <input type="text" name="username" value="<%=rc.getUsername()%>"><br>
         Enter Password:<br>
         <input type="text" name="password"  value="<%=rc.getPassword()%>" ><br>
         <button>update</button>
    </form>
    
    <br><br>
    <a href="admin.jsp">home</a>

</body>
</html>