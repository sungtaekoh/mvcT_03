package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//�������ִ� ��Ȱ
@Service("mmm")
public class MemberService {
	@Autowired MemberDAO dao;
	
	public MemberService() {
		System.out.println("���� ������ ����");
	}
	public int insert() {
		dao = new MemberDAO();
		return dao.insert();
	}
}
