package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test02_Request
 */
@WebServlet("/Test02_Request")
public class Test02_Request extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Test02_Request() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		for(int i = 1; i<=cnt ; i ++) {
			System.out.println(request.getParameter("param"+i));			
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
