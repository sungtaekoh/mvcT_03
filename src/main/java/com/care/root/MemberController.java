package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//연결해주는 역활

@Controller
public class MemberController {
	
//	@Autowired //컨테이너에 있는 bean을 집어넣어줌
	@Inject
//	@Autowired, @Inject 중 어느걸 써도 상관없다
	
	@Qualifier("mmm") //여러개의 빈 중 mmm을 ms에 가져오겠다
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
