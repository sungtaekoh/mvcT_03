package com.care.root;

import org.springframework.stereotype.Repository;

//DB
@Repository
public class MemberDAO {
	public MemberDAO() {
		System.out.println("DAO ������ ����");
	}
	public int insert() {
		System.out.println("��� �� ���� �Ǿ����ϴ�!!!");
		return 1;
	}
}
