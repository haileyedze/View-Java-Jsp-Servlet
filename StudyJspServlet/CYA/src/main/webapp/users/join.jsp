<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body class="bg-gradient-primary">	
	<%@ include file="/include/layout.jsp" %>
	<div class="container">
		<h3>회원가입</h3>
		<form method="post" action="member_join.us">
			<table class="table">
				<tr>
					<th>* 아이디</th>
					<td>
						<input type="text" name="userid" class="ck">
						<a class="btn-fill" id="id_check">아이디 중복확인</a>
						<div class="valid">아이디를 입력하세요()</div>
					</td>
				</tr>
				<tr>
					<th>* 비밀번호</th>
					<td>
						<input type="password" name="userpw" class="ck">
					</td>
				</tr>
				<tr>
					<th>* 비밀번호확인</th>
					<td>
						<input type="text" name="userpw_ck" class="ck">
					</td>
				</tr>
				<tr>
					<th>* 이름</th>
					<td>
						<input type="text" name="name">
					</td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td>
						<input type="text" name="name">
					</td>
				</tr>
				<tr>
					<th>성별</th>
					<td>
						<input type="text" name="name">
					</td>
				</tr>
				<tr>
					<th>이메일</th>
					<td>
						<input type="text" name="name">
					</td>
				</tr>				
				<tr>
					<th>전화번호</th>
					<td>
						<input type="text" name="name">
					</td>
				</tr>
			</table>
		
		</form>
	</div>	
	<%@ include file="/include/footer.jsp" %>
</body>
</html>