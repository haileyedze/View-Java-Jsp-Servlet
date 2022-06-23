package pack01.url;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어노테이션
@WebServlet("/Happy")//Servlet의 클래스 이름이 아니라 Webservlet 어노테이션 안에 있는 String 값을 변경 가능 → 짧게
public class Ex03_ServletTest_Happiness extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex03_ServletTest_Happiness() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("GET");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("POST");
	}

}
