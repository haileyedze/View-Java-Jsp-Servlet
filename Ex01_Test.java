package pack04.odjbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex01_Test {
	//Oracle Java Database Connection
	//DAO, DTO

	//Connection ← 연결로를 만드는 객체 ( 연결 객체 )
	//PreparedStatement ← 어떤 데이터를 전송하기 위한 객체 ( 연결된 연결 객체를 통해서 전송함 )
	//ResultSet ← 전송하고 나서 응답을 받으면 그 결과를 담는 객체 ( 결과 객체 )
	public static void main(String[] args) {
		Ex01_Test et = new Ex01_Test();
		//et.connTest();
		//et.connTest2();
		et.connTest3();
	}//main()
	
	//Connection 연결 객체 사용해서 통신 되는지 체크
//	public boolean connTest() {// url, user, password, Ojdbc Class ( 동적 로딩 = 자주 안씀)
		
//		//oracle.jdbc.driver.OracleDriver
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//		String user = "hanul";
//		String password = "0000";
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");//필요한 드라이버를 동적으로 로딩함.
//			Connection conn = DriverManager.getConnection(url, user, password);
//			if(conn.isClosed()) {// is <= boolean을 리턴하는 네이밍룰
//				System.out.println("닫힘");
//			}else {
//				System.out.println("열림");
//				
//				PreparedStatement ps =
//						conn.prepareStatement("select 1 num from dual");//인터페이스임
//				ResultSet rs = ps.executeQuery();
//				while(rs.next()) {
//					System.out.println(rs.getInt("num"));//밑에보다는 안전한 방법 이름은 변하지 않으니 이름으로 가져오는게 중요함
//					System.out.println(rs.getInt(1)); //0행은 오라클이 쓰고 있다, 1은 쓸 수 있다
//					//하지만 위험한 방법임
//				}//while
//				conn.close();//통신을 닫아줘야 함 ※동시에 접속할 수 있는 숫자가 정해져있음 
//				if(conn.isClosed()) System.out.println("닫힘(내가 닫음)");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}//try
//		
//		return false;
//	}//coonTest()
	
//	public boolean connTest2() {// url, user, password, Ojdbc Class ( 동적 로딩 = 자주 안씀)
//		
//		//oracle.jdbc.driver.OracleDriver
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//		String user = "hanul";
//		String password = "0000";
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");//필요한 드라이버를 동적으로 로딩함.
//			Connection conn = DriverManager.getConnection(url, user, password);
//			if(conn.isClosed()) {// is <= boolean을 리턴하는 네이밍룰
//				System.out.println("닫힘");
//			}else {
//				System.out.println("열림");
//				
//				PreparedStatement ps =
//						conn.prepareStatement("select 'AHE' name from dual");//인터페이스임
//				ResultSet rs = ps.executeQuery();
//				while(rs.next()) {
//					System.out.println(rs.getString("name"));//밑에보다는 안전한 방법 이름은 변하지 않으니 이름으로 가져오는게 중요함
//					//System.out.println(rs.getString(1)); //0행은 오라클이 쓰고 있다, 1은 쓸 수 있다
//					//하지만 위험한 방법임
//				}//while
//				conn.close();//통신을 닫아줘야 함 ※동시에 접속할 수 있는 숫자가 정해져있음 
//				if(conn.isClosed()) System.out.println("닫힘(내가 닫음)");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}//try
//		
//		return false;
//	}//coonTest2()
	
	public boolean connTest3() {// url, user, password, Ojdbc Class ( 동적 로딩 = 자주 안씀)
		
		//oracle.jdbc.driver.OracleDriver
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hanul";
		String password = "0000";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("sql문을 입력하세요 ▶ ");
		String str = sc.nextLine();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//필요한 드라이버를 동적으로 로딩함.
			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn.isClosed()) {// is <= boolean을 리턴하는 네이밍룰
				System.out.println("닫힘");
			}else {
				System.out.println("열림");
				
				PreparedStatement ps =
					conn.prepareStatement(str);//인터페이스임
					//conn.prepareStatement("select '" + str + "'as result from DUAL");	
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					//System.out.println(rs.getString("result"));//밑에보다는 안전한 방법 이름은 변하지 않으니 이름으로 가져오는게 중요함
					System.out.println(rs.getString(1)); //0행은 오라클이 쓰고 있다, 1은 쓸 수 있다
					//하지만 위험한 방법임
				}//while
				conn.close();//통신을 닫아줘야 함 ※동시에 접속할 수 있는 숫자가 정해져있음 
				if(conn.isClosed()) System.out.println("닫힘(내가 닫음)");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}//try
		
		return false;
	}//coonTest3()
	
	
	//예시
	public class EmpDTO{
		String EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID;
	}//EmpDTO
	
}//class
