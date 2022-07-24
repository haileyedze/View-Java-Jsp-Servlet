package users;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UsersDAO {
	//쿼리문 실행기능을 가진 클래스 SqlSessionTemplate
	public static SqlSession sql;
	static {
		String resource = "mybatis/config.xml";
		try {
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build( Resources.getResourceAsStream(resource) );
			sql = factory.openSession(true);	//autocommit 해주는 기능임
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//CRUD(Create, Read, Update, Delete)
	//전체회원정보보기
	public List<UsersDTO> user_list(){
		return null;
		
	}
	
	//회원가입
	public int join(UsersDTO dto) {
		return 0;
		
	}
	
	//아이디 중복확인
	public int id_check(String userid) {
		return 0;
		
	}
	
	//로그인
	public UsersDTO login(String userid, String userpw) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("userid", userid);
		map.put("userpw", userpw);
		return sql.selectOne("users.login", map);
	}
	
	//아이디에 해당하는 salt 조회하기
	public String user_salt(String userid) {
		return null;
	}
	
	//내 정보 보기
	public UsersDTO my_info(String userid) {
		return null;
	}
	
	//내 정보 변경
	public int user_update(UsersDTO dto) {
		return 0;
	}
	
	//회원탈퇴
	public int user_delete(String userid) {
		return 0;
	}
	
}
