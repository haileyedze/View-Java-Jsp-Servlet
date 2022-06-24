<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ForFor구구단만들기</title>
<style>
	body{
		display: table;
		margin:0px auto;
		background-color: orange
	}
	
	h1 {
		text-align: center;
		color: grey;
	}

	table{
		border: 3px solid grey;
		border-collapse: collapse;
		text-align: center;
		margin: 50px auto;
		background-color: #fff;
	}
	
	td{
		border: 3px solid grey;
	}

</style>
</head>
<body>
	
	<h1>구구단 출력 1</h1>
	<table>
		<% for(int i=2; i<=9; i++) {%>
			<tr>
			<% for(int j=1; j<=9; j++){ %>
				<td><%= i %> * <%= j %> = <%= i*j %></td>
			<% } %>
			</tr>
		<% } %>
	</table>
	
	<h1>구구단 출력 2</h1>
		<table>
		<% for(int i=1; i<=9; i++) {%>
			<tr>
			<% for(int j=2; j<=9; j++){ %>
				<td><%= j %> * <%= i %> = <%= j*i %></td>
			<% } %>
			</tr>
		<% } %>
	</table>
	
		<h1>구구단 출력 3</h1>
	<table>
		<% for(int i=2; i<=9; i++) {%>
			<tr>
			<% for(int j=1; j<=9; j++){ %>
				<% if(i%2 == 0) { %>
					<td style="background-color : lightblue"><%= i %> * <%= j %> = <%= i*j %></td>
				<% }else{ %>
					<td style="background-color : pink"><%= i %> * <%= j %> = <%= i*j %></td>
				<% } %>
			<% } %>
			</tr>
		<% } %>
	</table>
	
</body>
</html>