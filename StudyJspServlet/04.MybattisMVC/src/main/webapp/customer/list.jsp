<%@page import="customer.CustomerDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객정보보기</title>
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
	<h1>고객 정보 조회</h1>
	<% List<CustomerDTO> list = (List<CustomerDTO>)request.getAttribute("list"); %>
	<%=list.size() %><!-- size 확인으로 list가 넘어왔는지 간단히 확인 -->
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>GENDER</th>
			<th>EMAIL</th>
			<th>PHONE</th>
		</tr>	
		<%for(int i=0; i< list.size(); i++) {%>	
		<tr>
			<td><%=list.get(i).getId() %></td>
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getGender() %></td>
			<td><%=list.get(i).getEmail() %></td>
			<td><%=list.get(i).getPhone() %></td>
		</tr>
		<%} %>
	</table>
	<%@ include file = "/include/footer.jsp" %>
</body>
</html>