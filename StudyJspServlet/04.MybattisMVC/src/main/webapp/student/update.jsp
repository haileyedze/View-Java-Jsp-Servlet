<%@page import="Controller.StudentCotroller"%>
<%@page import="student.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업데이트</title>
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
		width: 500px;
	}
	
	th, td{
		border: 2px solid #000;
	}
	
	th {
		width: 100px;
		background-color: #999999;
		color: #fff;
	}
	td {
		width: 400px;
	}
	 {
		width: 250px;
	}
	
	a {
		color:black;
	}
	
</style>
</head>
<body>
	<%@include file = "/include/header.jsp" %>
	<!-- new 인스턴스화 하는 거 아님, 이미 있는 정보 빼오면 됨, 캐스팅 꼭 할 것 -->
	<% StudentDTO dto = (StudentDTO) request.getAttribute("dto"); %>
	<h1>학생정보 디테일</h1>
	
	<table>
		<tr>
			<th>학생번호</th>
			<td><input type="text" name="no" id="no" readonly="readonly" value="<%=dto.getStudent_no() %> "></td>		
		</tr>
		<tr>
			<th>학생이름</th>
			<td><input type="text" name="name" id="name" value="<%=dto.getStudent_name() %> "></td>
		</tr>
		<tr>
			<th>아이디</th>
			<td><input type="text" name="id" id="id" disabled="disabled" value="<%=dto.getUser_id() %> "></td>
		</tr>
		<tr>
			<th>성</th>
			<td><input type="text" name="lN" id="lN" value="<%=dto.getLast_name() %>"></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="fN" id="fN" value="<%=dto.getFirst_name() %>"></td>
		</tr>
		<tr id="cg">
			<th>추가</th>
			<td>
				<form action="update.js" method="get">
					<input type="submit" value="완료">
					<input type="reset" value="리셋">
				</form>
			</td>
		</tr>
	</table>
	
	<%@include file = "/include/footer.jsp" %>
</body>
</html>