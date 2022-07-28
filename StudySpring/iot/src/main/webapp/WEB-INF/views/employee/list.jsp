<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>사원목록</h3>
<table class="w-px1000">
<colgroup>
	<col width="80px">
	<col width="200px">
	<col width="250px">
	<col>
	<col width="140px">
</colgroup>
	<tr>
		<th>사번</th>
		<th>성명</th>
		<th>부서명</th>
		<th>업무제목</th>
		<th>입사일자</th>
	</tr>
	
	<c:forEach items='${list}' var="vo">
		<tr>
			<td><a href="detail.hr?id=${vo.employee_id}">${vo.employee_id}</td>
			<td>${vo.name}</td>
			<td>${vo.department_id}</td>
			<td>${vo.job_title}</td>
			<td>${vo.hire_date}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>