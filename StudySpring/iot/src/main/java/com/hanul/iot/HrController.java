package com.hanul.iot;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.EmployeeVO;
import hr.HrServiceImpl;

@Controller
public class HrController {
	@Autowired private HrServiceImpl service;
	
	//�����ȭ�� ��û
	@RequestMapping("/detail.hr")
	public String detail(int employee_id, Model model) {
		//ȭ�鿡�� ������ ������ ������ DB���� ��ȸ�� �� : �����Ͻ� ����
		EmployeeVO vo = service.employee_detail(employee_id);
		//ȭ�鿡�� ����� �� �ֵ��� Model�� ��´�
		model.addAttribute("vo", vo);
		//����ȭ�� ����
		return "employee/detail";
	}
	
	//������ȭ�� ��û
	@RequestMapping("/list.hr")
	public String list(Model model, HttpSession session) {
		session.setAttribute("category", "hr");
		//DB���� �������� ��ȸ�ؿ� : �����Ͻ�����
		List<EmployeeVO> list = service.employee_list();
		//ȭ�鿡�� ����� �� �ֵ��� Model�� ��´�
		model.addAttribute("list", list);
		//����ȭ�鿬��
		return "employee/list";
	}
}