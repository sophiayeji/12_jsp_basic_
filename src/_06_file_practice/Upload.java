package _06_file_practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/upload")
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String saveDirectory ="C:\\Users\\19_web_syj\\eclipse-workspace\\12_jsp_basic_\\WebContent\\file_practice\\save_rep"; // 저장디렉토리 
		MultipartRequest multipartRequest = new MultipartRequest(request, saveDirectory, 1024 * 1024 * 100,"utf-8",new DefaultFileRenamePolicy());
	
		String uploader = multipartRequest.getParameter("uploader"); // upload 
	
		Enumeration<?> files = multipartRequest.getFileNames(); // next upload 
		
		if(files.hasMoreElements() ) { // 다음정보가 있으면 
			
			String element = (String)files.nextElement(); // file 1개 반환 
			
			String filesystemName = multipartRequest.getFilesystemName(element); // 파일명반환
			long length = multipartRequest.getFile(element).length(); // 파일의크기 반환 
			
			filesystemName +="(추가)" + UUID.randomUUID(); // 파일명= 고유넘버부여함
					
		}
	
	response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			String jsScript = "<script>";
					jsScript += "alert('파일을 업로드 하였습니다.');";
					jsScript += "location.href='fileMain';";
					jsScript += "</script>";
			out.print(jsScript);		
		
	}

}
