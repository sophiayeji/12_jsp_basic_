package _06_file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		
		String saveDirectory = "C:\\Users\\19_web_syj\\eclipse-workspace\\12_jsp_basic_\\WebContent\\chapter06_file\\file_repository";
		String deletefileName = request.getParameter("deleteFileName");
		
		// new File(saveDirectory + "\\" + deletefileName).delete();
		
		File file = new File(saveDirectory + "\\" + deletefileName);
		
		String jsScript = "";
		if(file.exists()) {
			file.delete();
				   jsScript  = "<script>";
			       jsScript += "alert('파일을 삭제하였습니다.');";
		  	       jsScript += "location.href='fileMain';";
			       jsScript += "</script>";						
		}
		else {
				   jsScript = "<script>";
				   jsScript += "alert('존재하지 않는 파일입니다.');";
			       jsScript += "history.go(-1);";
			       jsScript += "</script>";
		}
		
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print(jsScript);
		
		
	}

}
