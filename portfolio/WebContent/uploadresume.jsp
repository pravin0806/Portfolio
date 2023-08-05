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

<form action="UploadResume" method="post" enctype="multipart/form-data">
 <input type="file" name="resume"><br>
 <button>upload</button>

</form>
</body>
</html>