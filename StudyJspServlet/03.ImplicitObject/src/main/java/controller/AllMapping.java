package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.te")
public class AllMapping extends HttpServlet {
	// doGet , doPost 어떤 요청이 들어오는지에 따라서 로직을 분리해두는것은 
	//보안상 좋으나 코딩에 불편함이 많음
	
	//Webapp에서 어떤 경로를 내가 폴더로 만들고 Servlet에 요청을 하려고하면 햇갈림.
	// ../ , / , ../../ ==x 불편함.
	// *<-전체를 맵핑을 받을수있게도 할수가있음. Servlet을 Controller(Spring)와 유사한 구조로 만들기
	
	// * 전체를 입력받겠다. 
	// .구분자
	// adodofjofjof.구분자 ↑  ,  .do (servlet) ,  
	// 고객관리(Customer) *.cu
	// Hr(계정) *.hr
	// Student *.st
	
	//모든 요청을 받는 Service라는 메소드를 활용한다.
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd;

		String uri = req.getRequestURI();
		String servletPath = req.getServletPath();
		System.out.println(uri);
		System.out.println(servletPath);
		System.out.println(req.getMethod());
		
		if(servletPath.toUpperCase().equals("/header.te")) { //대소문자 구분 원하면 toUpperCase() 쓰기
			rd = req.getRequestDispatcher("Ex02_Response/Ex03_ResHeader.jsp");
		}else if(servletPath.equals("/out.te")){
			rd = req.getRequestDispatcher("Ex03_Out/Ex01_Out.jsp");
		}else if(servletPath.equals("/out2.te")){
			PrintWriter out = resp.getWriter();
			//매번 HTML태그 싸주고 태그를 주면 불편함
			// contentType을 줄수가있음(응답하는 스트림이 어떤형태의 파일인지)
			//out.println("<html>");
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html; charset=UTF-8");
			out.println("HELLO");
			out.println("<h1>안녕하세요</h1>");
			out.println("<script>alert('됨');</script>");
			// Gson <= Lib(Api) 를 이용 처리 
			//out.println("</html>");
			//@Response(응답) 응답을 JSP나 다른 뷰단을 통해서 하는게 아니라 URL(Controller,Servlet)
			//자체에서 하고싶을때 씀 (out)
			//JSP ( JSP파일한테 바로 객체생성해서 공개된 영역)
			//JAVA( 직접 변수에 담아서 쓰게끔 만든 영역)
			//@ResponseBody<-어노테이션을 달면 바로 응답을하게되어있음(Spring)
		}else {
			rd = req.getRequestDispatcher("/Ex02_Response/Ex02_Failed.jsp");
		}//if
		
		//rd.forward(req, resp);
		//System.out.println("여기 서비스까지옴 ");
	}//service()
}//class
