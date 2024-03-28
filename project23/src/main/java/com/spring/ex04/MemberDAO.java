package com.spring.ex04;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAO {
	// 연결이나 DataSource에서 SqlSession을 생성합니다.
	public static SqlSessionFactory sqlMapper = null;
	
	private static SqlSessionFactory getInstance() {
		
		if(sqlMapper==null) {
			try {
				//DB연동 설정 정보 파일 불러오기
				String resource = "mybatis/SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				
				// SqlSessionFactoryBuilder 객체 만들기
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				
			}catch(Exception e ) {
				System.out.println("객체 생성 중 예외 발생");
				e.getStackTrace();
			}
		}
		System.out.println(sqlMapper);
		return sqlMapper;
	}
	
	//회원전체목록
	public List<Map<String, String>> selectAllMemberList() {
		sqlMapper = getInstance();
		System.out.println("sqlMapper 객체 : " + sqlMapper);
		
		// SqlSession
		// MyBatis 작업을 위한 기본 Java 인터페이스입니다. 이 인터페이스를 통해 명령을 실행하고, 매퍼를 가져오고, 트랜잭션을 관리
		// SqlSession(DB 연결 객체)
		SqlSession session = sqlMapper.openSession();
		//sql문이 있는 곳에서 sql 실행 결과를 list 로 받기
		List<Map<String, String>> memlist = session.selectList("mapper.member.selectAllMemberList");
		return memlist;
	}
	


		
	//회원 추가
	public void insertMember(MemberVO memberVO) {
		sqlMapper = getInstance();
		System.out.println("sqlMapper 객체 : " + sqlMapper);
		SqlSession session = sqlMapper.openSession();
		
		session.insert("mapper.member.insertMember", memberVO);
		session.commit();
	}
	
	
	//동적 sql문을 이용한 조회
	//매개변수는 MemberVO 리턴값은 List<MemberVO>
	List<Map<String, String>> searchMember(MemberVO memberVO){
		System.out.println(memberVO.getName()+memberVO.getEmail());
		System.out.println(sqlMapper);
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		
		List<Map<String, String>> memberList = session.selectList("mapper.member.searchMember",memberVO);
		return memberList;
	}
	
}
