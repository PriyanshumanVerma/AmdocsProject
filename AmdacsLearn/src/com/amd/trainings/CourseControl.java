package com.amd.trainings;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocslearn.dao.CourseDao;
import com.amdocs.learn.model.Course;
/**
 * Servlet implementation class CourseControl
 */
@WebServlet("/CourseControl")
public class CourseControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CourseDao couDao=new CourseDao();  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseControl() {
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
		int id=Integer.parseInt(request.getParameter("c_id"));
		String name=request.getParameter("c_name");
		String desp=request.getParameter("c_desp");
		int fees=Integer.parseInt(request.getParameter("c_fees"));
		String resourse =request.getParameter("c_resource");
		
		Course cou=new Course();
		cou.setCourse_id(id);
		cou.setName(name);
		cou.setDescription (desp);
	    cou.setResource(resourse);
	    cou.setFees(fees);
		
		couDao.insert(cou);
	}

}
