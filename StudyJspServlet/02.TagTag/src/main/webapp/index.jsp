<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>태그</title>
<style>
	body {
		background-color: pink;
		display: table;
		margin:5px auto;
	}
	h1 {
		border: 5px solid yellow;
		border-radius: 40px;
		padding: 20px;
		color : yellow;
		text-align: center;
	}
	
	li {
		list-style : none;
		/%list-style : decimal%/
	}
	
	a {	
		text-decoration: none;
		color : grey;
		font-size: 24px;
	}	
	
	a:hover {
		color: aqua;
	}

</style>
</head>
<body>
	<h1>스크립트 태그( Script Tag )</h1>
	<ul>
		<li><a href="01.Script/Ex00into.jsp">▶ 태그 처음 사용</a></li>
		<li><a href="01.Script/Ex01Var.jsp">▶ 변수 사용</a></li>
		<li><a href="01.Script/Ex02If.jsp">▶ 제어문 if 사용</a></li>
		<li><a href="01.Script/Ex03For.jsp">▶ 제어문 for문</a></li>
		<li><a href="01.Script/Ex04Method.jsp">▶ 메소드 사용</a></li>
		<!-- for문과 if문을 중첩시키기
			1~100까지의 수중 짝수의 합 홀수의 합을 출력
			짝수도 출력(빨간), 홀수도 출력(파란) -->
		<li><a href="01.Script/Test01ForIf.jsp">▶ Test : 제어문 for if문 사용</a></li>
		
		<!--  구구단을 출력한다.  ※Table태그를 이용해서 출력할것(ppt)-->
		<li><a href="01.Script/Test02ForFor.jsp">▶ Test : 제어문 ForFor(중첩) 테스트</a></li>
	</ul>
	
	<h1>디렉티브 태그( Directive Tag )</h1>
	<ul>
		<li><a href="02.Directive/Ex00_intoDirective.jsp">▶ 태그 처음 사용</a></li>
		<li><a href="02.Directive/Ex01_Import.jsp">▶ 기능 추가(클래스)</a></li>
		<li><a href="02.Directive/Ex02_ErrorPageMain.jsp">▶ 에러페이지 처리(에러발생하면 이동)</a></li>
		<li><a href="02.Directive/Ex03_Include.jsp">▶ 인클루드(페이지 붙이기 또는 외부 페이지 처리)</a></li>
	</ul>
	
</body>
</html>