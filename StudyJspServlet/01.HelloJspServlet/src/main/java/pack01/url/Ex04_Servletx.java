package pack01.url;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//web.xml에 가서 url 이름을 추가한 상태임
//e4라는 이름으로 추가했으니 확인해볼 수 있음
@WebServlet("/Ex04_Servletx")
public class Ex04_Servletx extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Ex04_Servletx() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("GET");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		System.out.println("POST");
	}

}
