<%@page import="student.StudentDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 보기</title>
<style>
	body {
		display: table;
		margin: 0px auto;
	}
	
	h1 {
		text-align: center;
	}

	table {
		margin: 20px auto;
		border: 2px solid #000;
		border-collapse: collapse;
		text-align: center;
	}
	
	th, td{
		border: 2px solid #000;
		width : 60px;
	}
	
	th {
		background-color: #000;
		color: #fff;
	}
</style>
</head>
<body>
	<%@ include file = "/include/header.jsp" %>

	<h1>학생정보를 보여 줍니다</h1>

	<%
		ArrayList<StudentDTO> list =( ArrayList<StudentDTO> ) request.getAttribute("list");
	%>
	<table class="styled-table">
		<tr>
			<th>학생번호</th>
			<th>학생이름</th>
			<th>아이디</th>
			<th>성</th>
			<th>이름</th>
			<th>요청</th>
		</tr>
	<% 
		for(int i = 0 ;  i<list.size(); i ++){
	%>	<tr>
			<!-- forward 방식이 아님 -->
			<td><a href="detail.st?student_no=<%=list.get(i).getStudent_no() %>&user_id=<%=list.get(i).getUser_id() %>"><%=list.get(i).getStudent_no() %></a></td>
			<td><a href="detail.st?student_no=<%=list.get(i).getStudent_no() %>&user_id=<%=list.get(i).getUser_id() %>"><%=list.get(i).getStudent_name() %></a></td>
			<td><%=list.get(i).getUser_id() %></td>
			<td><%=list.get(i).getFirst_name() %></td>
			<td><%=list.get(i).getLast_name() %></td>
			<td>
			<!-- 위와 완전 똑같은 방법임 -->
				<form action="detail.st" method="get">
					<input type="hidden" name="student_no" value="<%=list.get(i).getStudent_no() %>">
					<input type="hidden" name="user_id" value="<%=list.get(i).getUser_id() %>">
					<input type="submit" value="detail.st로 요청">
				</form>
			</td>
		</tr>

	<%} %>
	</table>
	<%@ include file = "/include/footer.jsp" %>
</body>
</html>