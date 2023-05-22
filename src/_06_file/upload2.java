package _06_file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class upload2
 */
@WebServlet("/upload2")
public class upload2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String saveDirectory = "C:\\Users\\19_web_syj\\eclipse-workspace\\12_jsp_basic_\\WebContent\\chapter06_file\\file_repository"; 
		
		MultipartRequest multipartRequest= new MultipartRequest(request,saveDirectory,1024 * 1024 * 100,"utf-8",new  DefaultFileRenamePolicy());
		
		String uploader = multipartRequest.getParameter("uploader");
		
		Enumeration<?> files = multipartRequest.getFileNames();
		//nextElement
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		while (files.hasMoreElements()) { // 다음정보가 있으면 
			String element = (String)files.nextElement();
		
			String OriginalFileName= multipartRequest.getOriginalFileName(element); // 업로드한 파일명을 반환함
			
			UUID uuid = UUID.randomUUID(); // UUID.randomUUID(); 해쉬 생성 메서드
			String date = sdf.format(new Date()); // 현재시간을 반환 
			String renameFileName = date + "_" + uuid +"_" + OriginalFileName; // 새로운 파일명 생성  
			
			//System.out.println("originalFileName" +OriginalFileName );
			//System.out.println("renameFileName" + renameFileName);
			
			File file = new File(saveDirectory + "\\" +OriginalFileName); // 기존에 업로드된 파일명을 반환 
			File renameFile = new File(saveDirectory + "\\" +renameFileName); // 새로운 파일명으로 새로운 파일 생성
			file.renameTo(renameFile); // 기존에 업로드한 파일을 변환된 파일명으로 이름변경(원본 파일을 rename파일로 바꿔줌)
			
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

















