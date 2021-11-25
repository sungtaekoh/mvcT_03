package com.care.get_post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	public MyController() {
		System.out.println("Mycontroller ������ ����");
	}
	
	@RequestMapping(value="my/index", method = RequestMethod.GET)//get���
	public String index() {
		return "/get_post/index";
	}
	
	@GetMapping("my/result")
	public String result_get() {
		System.out.println("get������� ���Խ��ϴ�");
		return "/get_post/result";
	}
//	@PostMapping("my/result")
	
	@RequestMapping(value="my/result", method = RequestMethod.POST)//get���
	public String result_post() {
		System.out.println("post������� ���Խ��ϴ�");
		return "/get_post/result";
	}
}


