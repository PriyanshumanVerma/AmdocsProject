package com.amd.trainings;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.learn.model.User;
import com.amdocslearn.dao.UserDao;

/**
 * Servlet implementation class UserConrol
 */
@WebServlet("/UserConrol")
public class UserConrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao useDao=new UserDao();  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserConrol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int uid=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("username");
		String Email=request.getParameter("email");
		int phonen=Integer.parseInt(request.getParameter("phone"));
		String addr =request.getParameter("address");
		String password =request.getParameter("password");
		Long dat=Long.parseLong(request.getParameter("date"));
		User use = new User();
		use.setId1(uid);
		use.setName(name);
		use.setEmail(Email);
		use.setPhone_number(phonen);
		use.setAddresss(addr);
		use.setPassword(password);
		use.setDate(dat);
		
		useDao.insert(use);
	}
}
