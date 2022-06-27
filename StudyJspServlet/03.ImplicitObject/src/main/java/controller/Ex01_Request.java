package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex01_Request")
public class Ex01_Request extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex01_Request() {
        super();
    }
    
    //JSP 컨테이너 ( WAS + JSP 기능을 모아놓은 상자 )
    //요청(크롬) → JSP → JAVA → Class → Excute → 결과보여줌 //밑에 request, response 이름 바꿔줘도 된다
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("pw"));
		//while문 이용한 거 다 html 통해서 할 수 있음
		//입력한 id, pw를 통해서 회원가입처리(JDBC) 로그인처리(JDBC)
		
		System.out.println( request.getRemoteAddr() );	//json(String key, )
		System.out.println( request.getRemoteHost() );
		System.out.println( request.getContextPath() );
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}

}
