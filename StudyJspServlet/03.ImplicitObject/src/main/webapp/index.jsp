<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Implicit Object</title>
<style>
	body {
		background-color: pink;
		display: table;
		margin:5px auto;
	}
	h1 {
		border: 5px solid yellow;
		border-radius: 40px;
		padding: 20px;
		color : yellow;
		text-align: center;
	}
	
	ul{
		display: table;
		margin:0px auto;
	}
	
	li {
		list-style : none;
		/%list-style : decimal;%/
		transition: 1s ease;
	}
	
	p{
		display: none;
		transition: 1s ease;
	}
	
	li:hover p {
		display: block;
	}
	
	a {	
		text-decoration: none;
		color : grey;
		font-size: 24px;
	}	
	
	a:hover {
		color: aqua;
	}

</style>
</head>
<body>
	<h1>Request 요청</h1>
	<ul>
		<li><a href="Ex01_Request/Ex00_infoRequest.jsp">▶ 관련된 정보들을 살펴보기</a></li>
		<li><a href="Ex01_Request/Ex01_Request.jsp">▶ 요청해보기</a></li>
		<li><a href="Ex01_Request/Test01_Request.jsp">▶ 테스트 문제</a></li>
		
	</ul>
	
	
	
</body>
</html>