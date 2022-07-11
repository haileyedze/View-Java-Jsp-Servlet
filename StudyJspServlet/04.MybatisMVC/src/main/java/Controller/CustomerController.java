package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.CustomerDAO;
import customer.CustomerDTO;

@WebServlet("*.cu")
public class CustomerController extends HttpServlet {
	RequestDispatcher rd;
	CustomerDAO dao = new CustomerDAO();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("고객관리 모듈 ");
		rd = req.getRequestDispatcher("error/404.jsp"); // 나중에 추가 예정(2022.06.30 KYM)
		if (req.getServletPath().equals("/list.cu")) {
			req.setAttribute("list", dao.getList());// jsp에서 사용할수있게 담음(저장)
			rd = req.getRequestDispatcher("customer/listjstl.jsp");
		}else if (req.getServletPath().equals("/insert.cu")) {
			CustomerDTO dto = new CustomerDTO();
			dto.setName(req.getParameter("name"));
			dto.setPhone(req.getParameter("phone"));
			dto.setEmail(req.getParameter("email"));
			dto.setGender(req.getParameter("gender"));
			int result = dao.insert(dto);
			return ;
		}else if(req.getServletPath().equals("/update.cu")) {
			System.out.println("업데이트");
			CustomerDTO dto = new CustomerDTO();
			dto.setId(Integer.parseInt(req.getParameter("id")));
			dto.setName(req.getParameter("name"));
			dto.setPhone(req.getParameter("phone"));
			dto.setEmail(req.getParameter("email"));
			dto.setGender(req.getParameter("gender"));
			int result = dao.update(dto);
			PrintWriter out = resp.getWriter();//응답
			out.println(result);
			return ;
		}
		rd.forward(req, resp);
	}
}
