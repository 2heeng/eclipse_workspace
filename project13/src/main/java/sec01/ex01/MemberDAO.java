package sec01.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {

	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;
	
	public MemberDAO() {
	
		//MemberDAO 객체 초기화(생성)시에 위 정보를 불러오게 해라.  -JNDI
		//그러기 위해서는 서블릿안에 MemberDAO객체가 있어야 함.
		try {
			// InitialContext를 생성하여 JNDI에 연결
			Context ctx	=new InitialContext();
			//java:/comp/env은 일반적으로 JNDI 네임스페이스에서 컨텍스트에 대한 일반적인 경로
			Context evnctx = (Context) ctx.lookup("java:/comp/env");
			//context에서 resource 찾아감. 
			dataFactory=(DataSource) evnctx.lookup("jdbc/oracle");
			
			
		} catch (Exception e) {
			System.out.println("MemberDAO객체에서 DB 연결 관련 에러");
		}
	}
		
		//회원목록 가져옴(목록 가져오기 전에 연결함)
	public List<MemberVO> listMembers() {
			
			List<MemberVO> list = new ArrayList<MemberVO>();
			
			try {
			conn=dataFactory.getConnection();
			String query="select * from t_member";
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				
				MemberVO vo =new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				
				list.add(vo);
				
			}
			rs.close();
			pstmt.close();
			conn.close();
			
			} catch(Exception e) {
				
				System.out.println("연결시 에러");
			}
			
			return list;
		}

	public void addMember(MemberVO memberVO) {
		try {
			conn=dataFactory.getConnection();
			
			String id=memberVO.getId();
			String pwd=memberVO.getPwd();
			String name=memberVO.getName();
			String email=memberVO.getEmail();
			
			String query="insert into t_member (id,pwd,name,email) values(?,?,?,?)";
			
			pstmt=conn.prepareStatement(query);
			
			pstmt.setString(1,id);
			pstmt.setString(2,pwd);
			pstmt.setString(3,name);
			pstmt.setString(4,email);
			
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("데이터 추가시 에러");
		}
	}
		
	public void delMember(String id) {
		
		try {
			conn = dataFactory.getConnection();
			String query = "delete from t_member where id=?";
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("삭제시 에러");
			e.printStackTrace();
		}
	}
		
	}
	

