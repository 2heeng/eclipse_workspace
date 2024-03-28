package com.spring.account;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

public class AccountDAO {

	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	//돈 보내기
	void updateBalance1() throws DataAccessException {
		System.out.println("DAO의 updateBalance1");
		sqlSession.update("mapper.account.updateBalance1");
	}

	//돈 받기
	void updateBalance2() throws DataAccessException {
		System.out.println("DAO의 updateBalance2");
		sqlSession.update("mapper.account.updateBalance2");
	}

}
