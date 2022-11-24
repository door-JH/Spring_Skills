<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action = "FFCTresult" method = "POST">
		회원번호 - <input type = "text" name = "num" 
				value = '${requestScope.dataBean.num }' />
				<br/>
		아이디 - <input type = "text" name = "id" 
				value = '${requestScope.dataBean.id }' />
				<br/>
		비밀번호 - <input type = "text" name = "pw" 
				value = '${requestScope.dataBean.pw }' />
				<br/>
		주소 - <input type = "text" name = "address" 
				value = '${requestScope.dataBean.address }' />
				<br/>
		<input type = "submit" value = "FFCTresult"/>
	</form>
	
</body>
</html>