<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/include/header.jsp" />
<div id='container'>
	<h3>고객정보수정</h3>
	<form method="post" action="update.cu">
		<table class="w-px600">
			<tr>
				<th>고객명</th>
				<td></td>		
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<label><input type="radio" name="gender" checked value="남">남</label>
					<label><input type="radio" name="gender" value="여">여</label>
				</td>		
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email" ></td>		
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="phone" maxlength="13"></td>		
			</tr>
		</table>
	</form>
	<div class="btnSet">
		<a class="btn-fill">저장</a>
		<a class="btn-empty">취소</a>
	</div>
</div>
<jsp:include page="/WEB-INF/views/include/footer.jsp" />
</body>
</html>