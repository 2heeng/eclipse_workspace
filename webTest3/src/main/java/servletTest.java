

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlettest2")
public class servletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public servletTest() {
        System.out.println("서비스가 초기화됨");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 요청이 들어옴");
	}

	
	@Override
	public void destroy() {
	System.out.println("서버가 종료됩니다.");
	}

}
