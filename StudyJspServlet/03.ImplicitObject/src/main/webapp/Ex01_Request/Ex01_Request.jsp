<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전송 연결</title>
<style>
	body{
		display: table;
		margin: 50px auto;
	}

	form{
		display: table;
		margin: 0px auto;
		/%text-align: center;%/
	}
	
	input{
		display: block;
		margin: 0px auto;
	}
	
	
	
</style>
</head>
<body>
	<!-- 요청방식은 크게 두가지 ( GET / POST )
		GET: URL에 보낸 파라메터가 그대로 찍힘(보안x)
		POST: URL에 보낸 파라메터가 공개가 안됨(보안o) 테스트x
		요청 → URL로 함(Servlet) → servlet → jsp(M View Controller)
			 → URL로 함(jsp페이지로 이동) → jsp
	-->
	
	<!-- Ex01_Request라는 서블릿을 만들고 요청해보기. -->
	<fieldset>
		<legend>GET 방식 요청</legend>
		<form action="../Ex01_Request" method="get">
			<label for="name">이름</label>
			<input type="text" id="name" name="name"/>
			
			<label for="id">아이디</label>
			<input type="text" id="id" name="id"/>
			
			<label for="pw">비밀번호</label>
			<input type="password" id="pw" name="pw"/>
			
			<input type="submit" value="get">
		</form>
	</fieldset>
	<br><br>
	<fieldset>
		<legend>POST 방식 요청</legend>
		<form action="../Request" method="post">
			<label for="name">이름</label>
			<input type="text" id="name" name="name"/>
			
			<label for="id">아이디</label>
			<input type="text" id="id" name="id"/>
			
			<label for="pw">비밀번호</label>
			<input type="password" id="pw" name="pw"/>
			
			<input type="submit" value="post">
		</form>
	</fieldset>
	<br><br>
	<fieldset>
		<legend>page to page</legend>
		<form action="Ex01_RequestResult.jsp" method="get">
			<label for="name">이름</label>
			<input type="text" id="name" name="name"/>
			
			<label for="id">아이디</label>
			<input type="text" id="id" name="id"/>
			
			<label for="pw">비밀번호</label>
			<input type="password" id="pw" name="pw"/>
			
			<input type="submit" value="page">
		</form>
	</fieldset>
</body>
</html>