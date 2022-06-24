<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>For if 사용</title>
</head>
<body>
	<% int odd = 0;%>
	<% int even = 0;%>
	<% for(int i=1; i<=100; i++) { %>
		<% if(i % 2 == 0) { %>
		<p style="color:red">짝수는 빨간(<%= even += i %>)</p>
		<% } else{ %>
		<p style="color:blue">홀수는 파란(<%= odd +=i %>)</p>
		<% } }%>
		
	<p style="color:red; font-weight:bold;"> 짝수합 : <%= even %></p>	
	<p style="color:blue; font-weight:bold;"> 홀수합 : <%= odd %></p>
</body>
</html>