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



<form action="AdminLogin" method="post">
       <input type="text" name="username" placeholder="enter username"><br>
        <input type="password" name="password" placeholder="enter passsword"><br>
          <button>login</button>
</form>
</body>
</html>