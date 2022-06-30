<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Implicit Object</title>
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
	
	ul{
		display: table;
		margin:0px auto;
	}
	
	li {
		list-style : none;
		/%list-style : decimal;%/
		transition: 1s ease;
	}
	
	p{
		display: none;
		transition: 1s ease;
	}
	
	li:hover p {
		display: block;
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
	<h1>Request 요청</h1>
	<ul>
		<li><a href="Ex01_Request/Ex00_infoRequest.jsp">▶ 관련된 정보들을 살펴보기</a></li>
		<li><a href="Ex01_Request/Ex01_Request.jsp">▶ 요청해보기</a></li>
		<li><a href="Ex01_Request/Test01_Request.jsp">▶ 테스트 문제1</a></li>
		<li><a href="Ex01_Request/Test02_Request.jsp">▶ 테스트 문제2</a></li>
		<!-- Requset(요청)가 받을 수 있는 파라메터 -->
		<li><a href="Ex01_Request/Scope.jsp">▶ Scope(데이터의 전달 범위)</a></li>
		<li><a href="Ex01_Request/ScopeServlet.jsp">▶ Scope(서블릿에서 사용)</a> </li>
		<li><a href="TestServlet">▶ TestServlet</a> </li>
		<li><a href="Ex01_Response">▶ Response 관련</a> </li>
		<li><a href="Ex02_Response/Ex01_Redirect.jsp">▶ Response 파라메타 URL은 JSP에 입력</a> </li>
		<li><a href="Ex02_Response/Ex02_ResLogin.jsp">▶ ResLogin</a> </li>
		<li><a href="Ex02_ResLogin">▶ Response 아이디 비번 Servlet</a> </li>
		<li><a href="AllMapping">▶ Mapping 해보기</a> </li>
		<!--  
			Scope <= Zoom 망원경
			데이터의 전달범위는 각각의 스코프마다 차이가 있음
			많은 데이터를 사용하지 않는데 계속 전달을 하려면 유지를 해야함.(Memory)
			많은 데이터를 사용하지 않는데 어떠한 key값으로 저장을 해두면 나중에 혼동이생김
			 
			PageContext ( jsp 페이지 내에서만 데이터를 전달한다.(<=java변수,js변수) 사용빈도낮음
			
			forward라는 규칙으로 이동했을 때만 넘겨줌, 그냥 넘기면 안됨
			Request 	( 요청이나 Forward(페이지 전환)시에 한번만 데이터를 전송한다) 사용빈도높음※1
					    (ex=> login.jsp에서 로그인할때 요청=>Servlet에서받음 =>페이지 전환(Request x)
					 	(모든 데이터의 페이지 이동시 사용함)
					 
			Session		(브라우저 내에서는 계속 유지되는 정보)
						(크롬을 실행시킴<둘은 세션이 다름>크롬창을 시크릿으로 킴)
						(크롬을 실행시킴< 세션이 같음>크롬 탭을 추가함) 사용빈도높음※2
						(주로 로그인 정보나 유지가 되어야하는 정보들을 담을 용도로 사용함)
			ApplicationContext	( 어플리케이션이 완전히 종료되지 않는한 유지됨 =>주로 버전등으로만사용)사용빈도낮음
		-->
	</ul>
</body>
</html>