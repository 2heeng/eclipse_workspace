package sec01.ex01;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;




@WebServlet("/upload.do")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("FileUpload초기화됨");
	}

	public void destroy() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		File serverRepo = new File("C:\\file_repo"); //업로드할 파일 경로를 지정
		System.out.println(serverRepo);
		
		DiskFileItemFactory factory=new DiskFileItemFactory();
		//파일용량 크기 설정(제한)
		factory.setRepository(serverRepo);
		factory.setSizeThreshold(1024*1024);
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		//System.out.println("upload 객체: "+upload);
		
		try {
			List<FileItem> fileItemList=upload.parseRequest(request);
			System.out.println("파일 아이템 객체: "+fileItemList);
			System.out.println("item크기: "+fileItemList.size());
			
			for(int i=0;i<fileItemList.size();i++) {
				//System.out.println(fileItemList.get(i));
				FileItem fileItem=fileItemList.get(i);
				//System.out.println("각 파일의 사이즈는: "+fileItem.getSize());
				
				//사이즈가 0이면 파일이 없다는 뜻이니까 0보다 클때만 파일을 가져온다!
				if(fileItem.getSize()>0) {
				if(fileItem.isFormField()) {
					System.out.println("여기는 폼필드");
					System.out.println(fileItem.getFieldName()+"="+fileItem.getString("utf-8"));
				}else {
					System.out.println("여기는 폼필드가아님");
					System.out.println("파일명: "+fileItem.getName());
					String uploadFileName = fileItem.getName();
					
					System.out.println("업로할 파일명: "+uploadFileName);
					int idx=uploadFileName.lastIndexOf("\\");
					System.out.println(idx);
					
					File uploadFile = new File(serverRepo+"\\"+uploadFileName);
					System.out.println("서버에 올라갈 경로: "+ uploadFile);
					fileItem.write(uploadFile);
				}
				}
			}
		} catch (Exception e) {
			System.out.println("파일 업로드시 예외 발생");
		}
		
		
	}

}
