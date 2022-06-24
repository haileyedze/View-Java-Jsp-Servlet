<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전역변수와 지역변수</title>
</head>
<body>
	<!-- 전역변수 만들어보기 (String 변수, double 변수, String[] 배열 4개 이상 (배열 내용 T, E, S, T))-->
	<%! int vInt = 99;
		String vStr = "hi";
		double vDouble = 1.142;
		String[] stA = new String[] {"T", "E", "S", "T"};
	%>
	
	<!-- 지역 변수 (느낌표가 없다.) -->
	<% int lvInt = 10;
		vInt ++;
		lvInt ++;
	%>
	
	<!-- 전역변수 표현해보기 -->
	<p>vInt 값 : <%=vInt %> lvInt 값 : <%=lvInt %></p>
	<p>vStr 값 : <%=vStr %></p>
	<p>vDouble 값 : <%=vDouble %></p>
	<p>stA 값 : <%=stA[0] %><%=stA[1] %><%=stA[2] %><%=stA[3] %></p>
	

</body>
</html>