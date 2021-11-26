package com.care.get_post;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String result_get(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println("get������� ���Խ��ϴ�");
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		
		model.addAttribute("method", request.getMethod());
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "/get_post/result";
	}
//	@PostMapping("my/result")
	
	@RequestMapping(value="my/result", method = RequestMethod.POST)//get���
	public String result_post(HttpServletRequest request, Model model,
									@RequestParam("name") String name,//���� �����ͼ� �����Ѵ�
									@RequestParam("age") String age) {
		System.out.println("post������� ���Խ��ϴ�");
		
		model.addAttribute("method", request.getMethod());
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		
		return "/get_post/result";
	}
}


