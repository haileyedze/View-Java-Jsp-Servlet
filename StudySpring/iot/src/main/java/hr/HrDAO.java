package hr;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

//@Repository : db�� �����ϴ°Ű�
//���񽺴� Ŀ�ǵ� ������(����)
//���� ���ÿ��� ����
//@Service : ����
//@Autowired �� �� �������ִ� �Ű� 
//�Ϳ�!

@Repository
public class HrDAO implements HrService {
	@Autowired @Qualifier("hr") private SqlSession sql;

	@Override
	public int employee_insert(EmployeeVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EmployeeVO> employee_list() {
		return sql.selectList("employee.list");
	}

	@Override
	public EmployeeVO employee_detail(int employee_id) {
		return sql.selectOne("employee.detail", employee_id);
	}

	@Override
	public int employee_update(EmployeeVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int employee_delete(int employee_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}