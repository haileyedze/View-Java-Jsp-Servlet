<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아웃</title>
</head>
<body>
	<!-- 자바코드에서 HTML로 출력을 보낼 수 있는 Stream
		System.out ← 콘솔(OutputStream)
		Out.println ← HTML Body
	-->
	
	
	<!-- 공공데이터 쓸 때 사용, 글자만 나오게 할 때 -->
	<%
		out.println("HELLO");
		out.println("<h1>HI</h1>");
	%>
</body>
</html>