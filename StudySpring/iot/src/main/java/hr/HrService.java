package hr;

import java.util.List;

public interface HrService {
	int employee_insert(EmployeeVO vo);//�űԻ�����-�ű�����
	List<EmployeeVO> employee_list(); //��������ȸ
	EmployeeVO employee_detail(int employee_id); //�������ȸ
	int employee_update(EmployeeVO vo); //���������������
	int employee_delete(int employee_id);//�����������
}
