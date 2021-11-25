package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//연산해주는 역활
@Service("mmm") //빈을 지정
public class MemberService {
	@Autowired MemberDAO dao;//빈의 값을 집어넣는다
	
	public MemberService() {
		System.out.println("서비스 생성자 실행");
	}
	public int insert() {
//		dao = new MemberDAO();
		System.out.println("dao : "+dao);
		return dao.insert();
	}
}
