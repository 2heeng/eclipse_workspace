package sec01.ex02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.do")
public class FileDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		PrintWriter pw = response.getWriter();
//		pw.write("이미지"+"<br>");
		
		String file_repo= "C:\\file_repo";
		//pw.write(request.getParameter("fileName"));
		String fileName = (String) request.getParameter("fileName");
		String downFile = file_repo+"\\"+fileName;
		System.out.println("서버에 있는 다운파일경로: "+downFile);
		
		
		//파일 내려받기 위한 OutputStream 객체
		OutputStream out= response.getOutputStream();
		response.setHeader("Cache-Control", "no-cache");
		response.addHeader("Content-disposition", "attachment; fileName="+downFile);
		
		File f = new File(downFile);
		
		//파일에 들어갈 인풋 객체 생성
		FileInputStream in = new FileInputStream(f);
		
		byte[] buffer = new byte[1024*8];
		
		while(true) {
			int count = in.read(buffer);
			if(count==-1) {
				break;
				
			}out.write(buffer,0,count);
			
		} 
		in.close();
		out.close();
	}

}
