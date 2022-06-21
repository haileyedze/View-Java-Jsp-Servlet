package pack05.ojdbc2;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInfoDAO extends StudentDAO {	
	//현 StudentDAO를 상속받아서 썼다면 나중에는 접속객체를 초기화 접속객체 닫기등등을
	//하나의 공통 클래스로 몰아 넣기 (재사용이 편하다)
	//공통으로 사용되는 로직은 commons, common 등등 공통이라는 패키지를 별도로 두고
	//프로젝트 인원들이 같이 사요하도록 유도함 (디비접속, 숫자를 리턴하는 메소드 등등)
	
	//2.로그인 처리를 위한 메소드를 만들기 loginUser(); // 파라메터가 필요할까?
		// ( ↑ ) , true false를 이용해서 true가 나오면 로그인 됨 <-이것만정답 x
		//        , -1은 확실히 실패 그외에는 성공 ( jdbc) ..
		//public boolean loginUser(HashMap<String, String> userInfo) { // 네이버 : 아이디 입력 , 비밀번호 입력
//		public boolean loginUser(String id, String pw) {
//			
//			//연결 → 전송 → 결과
//			conn = getConnection();
//			String sql = " select * from USER_INFO WHERE user_id = ? and user_pw = ? ";
//			//물음표 갯수 <=> ps.set갯수 맞춰줌
//			try {
//				ps = conn.prepareStatement(sql);
//				ps.setString(1, id); //왼쪽을 기준을 ㅗ첫번째 물음표를 찾고 그 물음표에 어떤 값을 넣음
//				ps.setString(2, pw); //
//				rs = ps.executeQuery();//순서 중요함
//				while(rs.next()) {
//					System.out.println("정보 얻어옴");
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			
//			return false;
//
//			//로그인 처리를 위해서 스캐너로 입력받기
//			//Scanner scanner = new Scanner(System.in);
//			//System.out.println("로그인을 위해 아이디와 비밀번호를 입력하시오");
//			//System.out.print("아이디 : ");
//			//String id = scanner.nextLine();
//			//System.out.print("비밀번호 : ");
//			//String pw = scanner.nextLine();
//
//			//if(id.equals("") && pw.equals("")) {
//			//	System.out.println("로그인 됩니다.");
//			//}else {
//			//	System.out.println();
//			//}
//
//		}
	
		public UserInfoDTO loginUser(String id , String pw) { // 네이버 : 아이디 입력 , 비밀번호 입력
			//연결 -> 전송 -> 결과
			UserInfoDTO dto = new UserInfoDTO();
			conn = getConnection();
			String sql = " select * from USER_INFO WHERE user_id = ? and user_pw = ? ";
			// 물음표 갯수 <=> ps.set갯수 맞춰줌
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, id); // 왼쪽을기준으로 첫번째 물음표를 찾고 그물음표에 어떤값을넣음
				ps.setString(2, pw); //
				rs = ps.executeQuery();
				while(rs.next()) {
					dto.setStudent_no(rs.getInt("student_no"));
					dto.setUser_id(rs.getString("user_id"));
					dto.setUser_pw(rs.getString("user_pw"));
					dto.setFirst_name(rs.getString("first_name"));
					dto.setLast_name(rs.getString("last_name"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return dto;
		}
		
		//회원정보수정 - 키 값은 수정 되면 안됨
		public void userUpdate(UserInfoDTO joinDto) {
			conn = getConnection();//커넥션 객체 초기화(연결)
			String sql = "UPDATE user_info SET user_pw = ? WHERE user_id = ?";
			
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, joinDto.getUser_pw());
				ps.setString(2, joinDto.getUser_id());
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
	
		}
		
		
		//회원가입
		public boolean joinUser(UserInfoDTO dto) {
			// 1.SQLD <- 되는 INSERT 쿼리를 만든다. ROLLBACK , COMMIT을 꼭함
			// 2.JAVA 작업 ( dto에 사용자가 입력한 정보들을 묶어서 저장 )
			// 3.JAVA 작업 ( dto를 메소드에 넘기고 출력 해보기 )
			// 4.JDBC 작업 
			
			//메인 회원정보를 입력받고 입력받은 결과로 회원가입처리
			//회원 가입 처리 ( CREATE_YMD, sysdate )
			
			//연결
			conn = getConnection();
			
//			//입력
//			String sql = "INSERT INTO user_info (student_no, user_id, user_pw, first_name, last_name, create_ymd, update_ymd)"
//					+ "VALUES ('" 
//					+ dto.getStudent_no() + "', '" 
//					+ dto.getUser_id() + "', '" 
//					+ dto.getUser_pw() + "', '" 
//					+ dto.getFirst_name() + "', '"
//					+ dto.getLast_name() + "', "
//					+ dto.getCreate_ymd() + ", "
//					+ dto.getUpdate_ymd() + ")";
//			//전송하기
//			try {
//				ps = conn.prepareStatement(sql); //전송객체 초기화
//				ps.executeUpdate();
			
			String sql = "INSERT INTO user_info values(6,?,?,?,?,sysdate,sysdate)";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, dto.getUser_id());
				ps.setString(2, dto.getUser_pw());
				ps.setString(3, dto.getFirst_name());
				ps.setString(4, dto.getLast_name());
				System.out.println(ps.executeUpdate());
			} catch (Exception e) {
				e.printStackTrace();
			}	
			return false;
		}
	
		//사용자에게 어떤 메세지를 보여줌과 동시에 스캐너로 값을 입력받음.
		public String rtnStrMsg(Scanner sc , String msg) {
			System.out.println(msg);
			return sc.nextLine();
		}
		
}//class
