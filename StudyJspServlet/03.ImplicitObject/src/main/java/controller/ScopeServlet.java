package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ScopeServlet")
public class ScopeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// JSP페이지에서 (View) 요청할때 보내준 데이터를 Servlet(Controller)에서 사용하는 방법
		// PageContext<= 페이지 내에서만 사용할수있게 되어있어서 Controller에서는 접근이 불가능함
		System.out.println(" Request에 있는 Attr " + request.getAttribute("req") );
		
		HttpSession session = request.getSession();
		System.out.println(" Session에 있는 Attr " + session.getAttribute("session"));
		
		System.out.println(" Application(ServletContext)에 있는 Attr " + getServletContext().getAttribute("app") );
		
		// Controller에서 페이지를 전환하는 방식 (Forward)
		//요청자원을 넘기는 방식 ( Forward , redirect )
		// RequestDispatcher <= ↑포워드를 해주는 객체 ( View=>(a,form..java) Controller=>forward , redirect
		//request.setAttribute("attr", "ServletsendData");
		request.setAttribute("attr", "사랑이와효은신향");
		//먼저 요청을 하고 주소를 쓰면 된다고 함 와우...
		
		RequestDispatcher rd = request.getRequestDispatcher("Ex01_Request/ScopeServletRes.jsp");
		
		// excute(실행)※
		rd.forward(request, response);// 실제 페이지를 요청하는 로직
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
