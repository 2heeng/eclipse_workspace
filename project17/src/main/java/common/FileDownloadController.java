package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/download.do")
public class FileDownloadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String ARTICLE_IMAGE_REPO="C:\\board\\article_image";
	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파일명 가져오기
		String imageFileName = (String) request.getParameter("imageFileName");
		String articleNO = request.getParameter("articleNO");
		System.out.println("imageFileName= "+imageFileName);
		System.out.println("articleNO: "+articleNO);
		//output스트림에다가 파일객체 써야함
		OutputStream out = response.getOutputStream();
		
		//String path = ARTICLE_IMAGE_REPO+"\\"+articleNO+"\\"+imageFileName;
		String path = ARTICLE_IMAGE_REPO+"\\"+imageFileName;
		File imageFile = new File(path);
		
		response.setHeader("Cache-Control", "no-cache");
		response.addHeader("Content-disposition", "attachment; fileName="+imageFileName);
		
		FileInputStream in = new FileInputStream(imageFile);
		
		byte[] buffer=new byte[1024*8];
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
