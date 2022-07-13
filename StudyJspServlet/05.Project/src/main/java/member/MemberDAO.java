package member;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAO {
	//쿼리문 실행기능을 가진 클래스 : SqlSessionTemplate
	public static SqlSession sql;
	static {
		String resource = "mybatis/config.xml";
		try {
			SqlSessionFactory factory
			= new SqlSessionFactoryBuilder().build( Resources.getResourceAsStream(resource) );
			sql = factory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}//try
	}//static
	
	//CRUD(Create, Read, Update, Delete) //SQL에서 반환해주는 데이터가 숫자이므로 int
	//회원가입
	public int member_join(MemberDTO dto){
		
		return 0;
	}//member_join()
	
	//내정보 보기
	public MemberDTO member_myinfo(String userid) {
		return null;
	}//member_myinfo()
	
	//아이디 중복확인
	public int member_id_check(String userid) {
		return 0;
	}
	
	//내정보 변경
	public int member_update(MemberDTO dto) {
		return 0;
	}//member_update()
	
	//회원탈퇴
	public int member_delete(String userid) {
		return 0;
	}//member_delete()
	
	
}//class
