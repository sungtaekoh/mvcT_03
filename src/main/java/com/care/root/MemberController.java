package com.care.root;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//연결해주는 역활
@Controller
@Qualifier("mmm")
public class MemberController {
	@Inject
	MemberService ms;
	
	@RequestMapping("insert")//http://localhost:8081/root/insert
	public String insert(Model model) {
//		ms = new MemberService();
		int result = ms.insert();
		model.addAttribute("result",result);
		
		return "di/index";
	}
}
