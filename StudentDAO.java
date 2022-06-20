package pack05.ojdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentDAO {
	//예시 보여주려고 만든
	//public static void main(String[] args) {
	//	System.out.println(args.length);
	//}
	
	//데이터 베이스 연결
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	//1.학생 정보를 전체 조회할수있는 메소드 형태를 만드세요. getStudentList();
	// ( 전체 정보를 어떤 클래스에서 호출하든 사용가능해야함 )
	// DTO = (변수) 변수<= 한가지값만 가짐 [ 번호 , 이름 ]  Collection ArrayList
	
	//Connection 만들기 - 연결
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@221.144.89.105:3301:XE";
		String user = "hanul";
		String password = "0000";
		//Class를 불러오는 방법의 차이, 객체생성 방법도 있는거고 forname도 있는거임
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getConn Error !");
		}
		return conn;
	}//Connection getConnection()
	
	//데이터 베이스를 닫아줘야 한다
	public void dbClose() {
		// 통신을 열때랑 역순으로 닫아주면 된다. 
		try { // == < 참조를 시작했는지를 알수있는
			if (rs != null) {
				rs.close();// 3 ?
			}
			if (ps != null) {
				ps.close();// 2
			}
			if (conn != null) {
				conn.close();// 1
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//dbClose()
	

	public ArrayList<StudentDTO> getStudentList(){
		// Connection객체 등등을 이용해서 DB에서 정보를 가지고옴 그결과를 리턴
		// 출력은 메인클래스 또는 DAO에 viewList라는 메소드를 통해서 작업 
		
		//connection 연결하기
		conn = getConnection();
		
		//선언
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>(); 
		
		//명령 넣기
		String sql = "SELECT * FROM student";
		
		//조회하고 집어넣기, 마지막에 db 닫기
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				//확인용
				//System.out.println(rs.getInt("STUDENT_NO"));
				//System.out.println(rs.getString("STUDENT_NAME"));
				
				//밑에가 어렵게 느껴진다면
				//list.add(new StudentDTO(rs.getInt("STUDENT_NO"), rs.getString("STUDENT_NAME")));
				
				StudentDTO dto = new StudentDTO(rs.getInt("STUDENT_NO"), rs.getString("STUDENT_NAME"));
				list.add(dto);
				
			}//while
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류");
		}finally {
			dbClose();
		}//try

		//조회한 내용을 리턴하기
		return list;	
		
	}// ArrayList<StudentDTO> getStudentList()
	
	// viewList 라는 메소드는 조회 된 결과를 전체 콘솔창에 출력하는 메소드임.
//	public void viewList() {		
//		ArrayList<StudentDTO> dtoList = getStudentList();
//		for (int i = 0; i < dtoList.size(); i++) {
//			System.out.println(dtoList.get(i).getStudent_name());			
//		}//for
//	}
	
	public void viewList(ArrayList<StudentDTO> list) { // <=
		if(list == null || list.size() == 0) {
			System.out.println("보여줄 목록이 없습니다.");
			return ;
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getStudent_no() + "." + list.get(i).getStudent_name());
		}
	}//viewList(ArrayList<StudentDTO> list)
	
	
	//2.로그인 처리를 위한 메소드를 만들기 loginUser(); // 파라메터가 필요할까?
	// ( ↑ ) , true false를 이용해서 true가 나오면 로그인 됨 <-이것만정답 x
	//        , -1은 확실히 실패 그외에는 성공 ( jdbc) ..
	public boolean loginUser(HashMap<String, String> userInfo) { // 네이버 : 아이디 입력 , 비밀번호 입력
	//public boolean loginUser(String id, String password) {
		return false;
		//로그인 처리를 위해서 스캐너로 입력받기
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("로그인을 위해 아이디와 비밀번호를 입력하시오");
		//System.out.print("아이디 : ");
		//String id = scanner.nextLine();
		//System.out.print("비밀번호 : ");
		//String pw = scanner.nextLine();
		
		
		//if(id.equals("") && pw.equals("")) {
		//	System.out.println("로그인 됩니다.");
		//}else {
		//	System.out.println();
		//}
		
		//
		
		
	}
	
	
	
	
	
	
	
	// JDBC 통해서 연결과 연결해제 등등의 기능이 필요하다면 가지고 와야함
	// API의 경우 내가 직접 코딩하는게 적음(→ 이미 만들어진 기능을 호출해서 사용)
	// 따라서 어떤게 필요한지를 외우고 빠지면 복붙해도 상관 없음
	// 규칙 : 연결, 전송, 결과
	
	// public , protected , default(생략) , private = ( 접근 제한자 )
	// 멤버의 구분 ( static 이 붙었는지 안붙었는지 ) = 인스턴스화 해야 사용, 안해도 사용가능
	// 리턴 타입   (  void 이 붙었는지 안붙었는지) = 리턴을 하는지 안하는지 구분
	// 메소드 이름 ( 소문자로 시작해서 그 기능을 구별할수있는 단어가 좋다) aaa() X , getUserInfo()
	// 파라메터부( 메소드가 실행될때 필요한 매개변수(파라메터)가 있다면 넘겨주는 부분)
		
	
	// 내가 알고있는 어떤 것이든 메소드의 리턴타입이 될 수 있으니 한계를 두고 생각을 닫지 말자.
	public ArrayList<String> getListString(){
		return null;
	}
	public ArrayList<Integer> getListInteger(){
		return null;
	}
	public String getString() {
		return null;
	}
	public void voidMethod() {
		//return new ArrayList<String>() ;
	}
	
}//class
