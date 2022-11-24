<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href = "GRPDStest?data1=100&data2=21&data3=elogio&data3=mi"> GRPDStest</a>
	<br/>
	<form action = "PRPDStest" method = "POST">
		data1 - <input type = "text" name = "data1" placeholder = "data1"/>
		data2 - <input type = "text" name = "data2" placeholder = "data2"/>
		data3 - <input type = "checkbox" name = "data3" value = "elogio"/>
		data3 - <input type = "checkbox" name = "data3" value = "mi"/>
		<input type = "submit" value = "PRPDStest"/>
	</form>
	<br/>
	<a href = "GMAtest?data1=100&data2=200&data3=elogio&data3=mi&data3=good">GMAtest</a>
	<br/>
	<form action = "PMAtest" method = "POST">
		data1 - <input type = "text" name = "data1" placeholder = "data1"/>
		data2 - <input type = "text" name = "data2" placeholder = "data2"/>
		data3 - <input type = "checkbox" name = "data3" value = "elogio"/>
		data3 - <input type = "checkbox" name = "data3" value = "mi"/>
		<input type = "submit" value = "PMAtest"/>
	</form>
</body>
</html>