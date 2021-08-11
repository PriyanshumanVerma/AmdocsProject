package com.amd.trainings;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocslearn.dao.AdminDao;
import com.amdocs.learn.model.AdminM;

/**
 * Servlet implementation class AdminServelet
 */
@WebServlet("/AdminService")
public class AdminService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private AdminDao adminDao=new AdminDao();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher=request.getRequestDispatcher("Hello.html");
		dispatcher.forward(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("Admin_id"));
		String name=request.getParameter("ad_name");
		String email=request.getParameter("ad_email");
		String password=request.getParameter("ad_password");
		AdminM admin=new AdminM();
		admin.setAdmin_id(id);
		admin.setName(name);
		admin.setEmail(email);
		admin.setPassword(password);
		
		adminDao.insert(admin);
		/*RequestDispatcher dispatcher=request.getRequestDispatcher("Admin.jsp");
		dispatcher.forward(request, response);*/
		
		
	}

}