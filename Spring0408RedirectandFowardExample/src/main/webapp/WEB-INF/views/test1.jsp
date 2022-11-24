<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form:form modelAttribute = "dataBean" action = "result">
		
		hidden - <form:hidden path="b1"/> <br/>
		text - <form:input path="b2"/> <br/>
		password - <form:password path="b3" showPassword ="true"/> <br/>
		textarea - <form:textarea path="b4" /> <br/>
		
		<hr/>
		
		<form:select path = "b5">
			<form:options items="${requestScope.data_list1 }" />
		</form:select>
		<br/>
		<form:select path = "b6">
			<form:options items="${requestScope.data_list2 }"  itemLabel ="key" itemValue ="value"/>
		</form:select>
		<br/>
		<br/>
		
		<form:checkboxes items="${requestScope.data_list1 }" path = "b7"/>
		<br/>		
		<form:checkboxes items="${requestScope.data_list2 }" path = "b8"  itemLabel ="key" itemValue ="value"/>
		<br/>
		<br/>
		<form:radiobuttons items="${requestScope.data_list1 }" path = "b9"/>
		<br/>
		<form:radiobuttons items="${requestScope.data_list2 }" path = "b10"  itemLabel ="key" itemValue ="value"/>
		
		<br/>
		<br/>
		<form:button disabled = "true">확인 버튼</form:button>
	</form:form>
	
</body>
</html>