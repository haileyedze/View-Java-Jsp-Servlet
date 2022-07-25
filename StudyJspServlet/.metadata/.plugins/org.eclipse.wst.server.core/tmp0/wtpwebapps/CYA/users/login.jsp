<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>	
	<%@ include file="/include/layout.jsp" %>
	<div class="container">
		<h3>로그인</h3>
		<div class="deco">
			<ul>
				<li><input type="text" id="userid" name="userid" placeholder="아이디"></li>			
				<li><input type="password" id="userpw" name="userpw" placeholder="비밀번호"></li>			
				<li><input type="button" value="로그인" onclick="login()"></li>			
				<li><hr></li>			
				<li><input type="button" id="naver" value="네이버" onclick="location='naver_login.us'"></li>			
				<li><input type="button" id="kakao" value="카카오" onclick="location='kakao_login.us'"></li>			
			</ul>		
		</div>
	</div>

	<script>
	$('#userpw').keypress(function(e){
		if( e.keyCode==13 ) login();
	});
	function login(){
		if( ! emptyCheck() ) return;
		
		$.ajax({
			url: 'iotlogin.us',
			data: { id:$('#userid').val(), pw:$('#userpw').val() },
			success: function( response ){
				if( JSON.parse(response) ){
					location = '<c:url value="/"/>';
				}else{
					alert('아이디나 비밀번호가 일치하지 않습니다!');
					$('#userid').focus();
				}			
			},error: function(req, text){
				alert(text+':'+req.status);
			}
		});
	}
	
	</script>
	
	<%@ include file="/include/footer.jsp" %>
</body>
</html>