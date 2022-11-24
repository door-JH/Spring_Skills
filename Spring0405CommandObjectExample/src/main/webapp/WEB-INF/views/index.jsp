<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "GMADtest" method = "GET">
		id - <input type = "text" name = "id" placeholder ="id"/>
		name - <input type = "text" name = "name" placeholder ="name"/>
		<input type = "submit" value = "GMADtest" />
	</form>
	<br/>
	<form action = "PMADtest" method = "POST">
		id - <input type = "text" name = "id" placeholder ="id"/>
		name - <input type = "text" name = "name" placeholder ="name"/>
		<input type = "submit" value = "PMADtest" />
	</form>
</body>
</html>