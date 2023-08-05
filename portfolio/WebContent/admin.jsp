<%
String getlogin=(String)session.getAttribute("login");
if(getlogin==null)
{
	response.sendRedirect("adminlogin.jsp");
}
%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><a href="readmessage.jsp">READ MESSAGES</a></h3> 
<h3><a href="updatecredentials.jsp">UPDATE CREDENTIALS</a></h3>
<h3><a href="addproject.jsp">ADD PROJECT</a></h3>
<h3><a href="deleteproject.jsp">DELETE PROJECT</a></h3>
<h3><a href="addedu.jsp">ADD EDUCATION</a></h3>
<h3><a href="deleteeducation.jsp">DELETE EDUCATION</a></h3>
<h3><a href="uploadresume.jsp">UPLOAD RESUME</a></h3>


<form action="Logout" method="post">

 <button>logout</button>
</form>
</body>
</html>