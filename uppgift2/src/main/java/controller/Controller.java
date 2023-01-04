package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserBean;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean userBean = new UserBean();
		String user = request.getParameter("username");
		String password = request.getParameter("password");
		int userIndex  = userBean.findUserIndex(user);
		if(userIndex == -1) {
			response.sendRedirect("views/FailedLogin.jsp");
		}else {
			if(!userBean.getPasswordArray()[userIndex].equals(password)) {
				response.sendRedirect("views/FailedLogin.jsp");
			}else {
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("isLoggedIn", "My session");
				RequestDispatcher rd = request.getRequestDispatcher("views/userHome.jsp");
				rd.forward(request, response);
			}
		}
	}

}
