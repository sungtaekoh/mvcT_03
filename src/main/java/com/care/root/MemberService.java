package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//연산해주는 역활
@Service("mmm")
public class MemberService {
	@Autowired MemberDAO dao;
	
	public MemberService() {
		System.out.println("서비스 생성자 실행");
	}
	public int insert() {
		dao = new MemberDAO();
		return dao.insert();
	}
}
