package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02_ResLogin")	//다르게 줄여써도 된다
public class Ex02_ResLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Ex02_Response/Ex02_ResLogin.jsp");
		
		request.setAttribute("id", "admin");
		request.setAttribute("pw", "admin1234"); // ↑ 지정해놓은 JSP까지 전송이 됨
		
		rd.forward(request, response);
	}
}
