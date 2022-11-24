<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href = "test1">test1.jsp</a>
	<br/>
	<a href = "sub2/test2">test2.jsp</a>
	<br/>
	<a href = "sub2/test3">test3.jsp - GET</a>
	<br/>
	<form action = "sub2/test3" method = POST>
		<input type = "submit" value = "test3"/>
	</form>
</body>
</html>