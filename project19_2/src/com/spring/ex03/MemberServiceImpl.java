package com.spring.ex03;

public class MemberServiceImpl implements MemberService {

	MemberDAO dao;
	
	
	
	public MemberDAO getDao() {
		return dao;
	}



	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}



	@Override
	public void listMembers() {
		MemberDAO dao = new MemberDAOImpl();
		System.out.println("회원목록 나옴");
		dao.listMembers();
		
	}

	
	
}
