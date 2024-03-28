package com.spring.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.member.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {
	
	private SqlSession sqlSession;
	
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}


	@Override
	public List<MemberVO> listMembers() throws DataAccessException {
		List<MemberVO> list = sqlSession.selectList("mapper.member.selectAllMemberList");
		return list;
	}

//	@Override
//	public int addMember(MemberVO memberVO) throws DataAccessException {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
