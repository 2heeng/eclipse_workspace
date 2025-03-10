package com.spring.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.member.vo.MemberVO;

@Repository("/memberDAO")
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	
//	public void setSqlSession(SqlSession sqlSession) {
//		this.sqlSession = sqlSession;
//	}


	@Override
	public List<MemberVO> listMembers() throws DataAccessException {
		List<MemberVO> list = sqlSession.selectList("mapper.member.selectAllMemberList");
		return list;
	}


	@Override
	public void addMember(MemberVO memberVO) throws DataAccessException {
		
		sqlSession.insert("mapper.member.insertMember",memberVO);
		
	}

//	@Override
//	public int addMember(MemberVO memberVO) throws DataAccessException {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
