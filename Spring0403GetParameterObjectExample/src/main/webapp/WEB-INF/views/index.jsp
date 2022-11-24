<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href = "Gtest1"> test1</a>
	<br/>
	<form action = "Ptest1" method = "POST">
		<input type = "submit" value = "test1"/>
	</form>
	<br/>
	<a href ="GHSRtest?data1=100">GHSRtest</a>
	<br/>
	<form action ="PHSRtest" method = "POST">
		<input type = "text" name = "data1" placeholder = "data1"/>
		<input type = "submit" value = "test1"/>
	</form>
	<br />
	<a href = "GPVtest/101/202/303">GPVtest</a>
	<form action ="PPVtest/101/202/303" method = "POST">
		<input type = "submit" value = "PPVtest"/>
	</form>
	<br />
	<a href="GRPtest?data1=100&data2=200&data3=elogio&data3=mi"> GRPtest</a>
	<br/>
	<form action ="PRPtest" method = "POST">
		data1 - <input type = "text" placeholder = "data1" name = "data1"/>
		data2 - <input type = "text" placeholder = "data2" name = "data2"/>
		data3 - <input type = checkbox value = "elogio" name = "data3"/>
		data3 - <input type = checkbox value = "mi" name = "data3"/>
		<input type = "submit" value = "PRPtest"/>
	</form>
	<br/>
	<a href="GRPOPtest?value1=100"> GRPOPtest</a>
	<br/>
	<form action="PRPOPtest" method = "POST">
		data1 - <input type = "text" name = "value1" placeholder ="value1"/>
		data2 - <input type = "text" name = "data2" placeholder ="data2 - required"/>
		data3 - <input type = "checkbox" name = "data3" value = "323"/>
		<input type = "submit" value ="PRPOPtest" />
	</form>
	
</body>
</html>