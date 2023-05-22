package _06_file;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

@WebServlet("/download")
public class Download extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String fileName = request.getParameter("fileName");
		String downloadFile = "C:\\Users\\19_web_syj\\eclipse-workspace\\12_jsp_basic_\\WebContent\\chapter06_file\\file_repository\\" +fileName; 
		
		// 파일을 읽어 스트림에 담기
		File file = new File(downloadFile);
	    FileInputStream in = new FileInputStream(downloadFile);
		
	    // 한글명 파일 처리 명령어
	    fileName = new String(fileName.getBytes("utf-8"), "8859_1");   
	    
	    // 파일다운로드 헤더지정
	    response.setContentType("application/octet-stream");							
	    response.setHeader("Content-Disposition", "attachment; filename=" + fileName ); 
	    
	    // 다운로드 명령어
	    OutputStream os = response.getOutputStream();
	    
	    int length;
	    byte[] b = new byte[(int)file.length()];

	    while ((length = in.read(b)) > 0) {
	    	os.write(b,0,length);
	    }
	    
	    os.flush();
	    
	    os.close();
	    in.close();
	}

}
