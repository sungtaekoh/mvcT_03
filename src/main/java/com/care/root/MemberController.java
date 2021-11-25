package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//�������ִ� ��Ȱ

@Controller
public class MemberController {
	
//	@Autowired //�����̳ʿ� �ִ� bean�� ����־���
	@Inject
//	@Autowired, @Inject �� ����� �ᵵ �������
	
	@Qualifier("mmm") //�������� �� �� mmm�� ms�� �������ڴ�
	MemberService ms;
	
	@RequestMapping("insert")//http://localhost:8081/root/insert
	public String insert(Model model) {
//		ms = new MemberService();
		int result = ms.insert();
		System.out.println("ms : "+ms);
		model.addAttribute("result", result);
		
		return "di/index";
	}
}
