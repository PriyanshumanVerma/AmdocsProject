package com.amd.trainings;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocslearn.dao.FeedbackDao;
import com.amdocs.learn.model.Feedback;

/**
 * Servlet implementation class FeedbackControl
 */
@WebServlet("/FeedbackControl")
public class FeedbackControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FeedbackDao FeedDao=new FeedbackDao();  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackControl() {
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
		String name=request.getParameter("user_id");
		String email=request.getParameter("f_email");
		String feedba =request.getParameter("feedback");
		
		Feedback feed=new Feedback();
		feed.setU_id(id);
		feed.setName(name);
		feed.setEmail(email);
	    feed.setFeedback(feedba);
	   
		
		FeedDao.insert(feed);
	}

}
