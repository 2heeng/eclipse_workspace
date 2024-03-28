package com.spring.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.member.vo.MemberVO;

public interface MemberDAO {
	public List<MemberVO> listMembers() throws DataAccessException ;
	//public int addMember(MemberVO memberVO) throws DataAccessException ;
}
