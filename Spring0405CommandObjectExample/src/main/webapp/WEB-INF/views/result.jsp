<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> ${requestScope.dataBean.id } </h1>
	<h1> ${requestScope.dataBean.name } </h1>
	<h1> ${requestScope.testBean.id } </h1>
	<h1> ${requestScope.testBean.name } </h1>
</body>
</html>