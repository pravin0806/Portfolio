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
 MAX SIZE:1mb<br>
 Format:jpeg<br>
<form action="AddProject" method="post" enctype="multipart/form-data">
      <input type="file" name="project"><br>
      <button>upload</button>
   </form>







</body>
</html>