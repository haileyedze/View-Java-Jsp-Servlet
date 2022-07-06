package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.CustomerDAO;
import customer.CustomerDTO;
import student.StudentDAO;


@WebServlet("*.cu")
public class CustomerController extends HttpServlet {
	RequestDispatcher rd;
	CustomerDAO dao = new CustomerDAO();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		rd = req.getRequestDispatcher("error/404.jsp");
		if(req.getServletPath().equals("/list.cu")) {
			System.out.println("고객관리 눌림");
			//dao.test();
			//List<CustomerDTO> list = dao.getList();
			//req.setAttribute("list",list);
			req.setAttribute("list",dao.getList());
			rd = req.getRequestDispatcher("customer/listjstl.jsp");
		}//if
		rd.forward(req, resp);
	}//service()
}//class
