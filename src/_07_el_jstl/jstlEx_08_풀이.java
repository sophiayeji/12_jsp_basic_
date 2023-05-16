package _07_el_jstl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/jstlEx_08_풀이")
public class jstlEx_08_풀이 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("id", "1234");
		request.setAttribute("pw", "1234");
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter07_el_jstl/jstlEx08_풀이.jsp");
		dis.forward(request, response);
	}

	

}
