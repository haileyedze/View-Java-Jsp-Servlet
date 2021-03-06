package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import users.UsersDAO;
import users.UsersDTO;

@WebServlet("*.us")
public class UsersController extends HttpServlet {
	//혹시 구글, 페이스북 소셜 로그인
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//페이지 전환 방식인 forward와 redirect방법 보다 간편하게
		String uri = request.getServletPath();
		String view = "";
		boolean redirect = false;
		UsersDAO dao = new UsersDAO();
		
		
		if(uri.equals("/join.us")) {
			//회원가입화면 요청
			//응답화면연결-회원가입화면
			view = "/users/join.jsp";
		}else if(uri.equals("/member_join.us")){			
			//회원가입처리 요청
			
			//비밀번호 암호화를 위한 salt 생성
			
			//화면에서 입력한 회원정보를 데이터객체(DTO)에 담는다
			UsersDTO dto = new UsersDTO();
			
			dto.setName( request.getParameter("name") );
			
			

			
		}else if( uri.equals("/id_check.us")) {
			//아이디 중복확인 요청
			
			
			
		}else if(uri.equals("/login.us")){
			//로그인화면 요청
			view = "/users/login.jsp";			
			
		}else if(uri.equals("/iotlogin.us")){
			//로그인처리 요청
			//화면에서 입력한 아이디와 비밀번호가 일치하는
			//회원정보를 DB에서 조회해와서
			//ajax 이용해서 데이터 확인
			UsersDTO dto = dao.login(request.getParameter("userid"), request.getParameter("userpw"));
			request.getSession().setAttribute("userInfo", dto);
			response.getWriter().print(dto == null ? false : true);
			return;
			
		}//if
		
		
		
		
		if(redirect) {
			response.sendRedirect(view);
		}else {
			request.getRequestDispatcher(view).forward(request, response);
		}
		
		
	}
}
