package _08_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletEx04")
public class ServletEx04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		 * 
		 *  # PrintWriter
		 *
		 *  response.getWriter(); 메서드를 이용하여 PrintWriter 객체를 생성한다.
		 *  PrintWriter 클래스는 Springframework의 @ResponseBody , ResponseEntity , @RestController와 같은 기능을 한다.
		 *  PrintWriter 클래스의 print()메서드로 새로운 html을 표시한다.
		 *  
		 * */
		
		// 반환되는 데이터의 encoding지정
		
		
		response.setContentType("text/html; charset=UTF-8");
		
		
		PrintWriter pw = response.getWriter();
		pw.print("<h1>로그인하기</h1>");
		pw.print("<p><a herf='servletEx03'>이동하기</a></p>");
		
		String 	jsScript = " <script>";
				jsScript += " alert('확인되었습니다.');";
				jsScript += " location.href='servletEx03';";
				jsScript +=" </script>";
				
		pw.print(jsScript);
		
	}

	
	

}
