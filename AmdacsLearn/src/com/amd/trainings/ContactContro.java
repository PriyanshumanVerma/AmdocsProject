package com.amd.trainings;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.learn.model.Contact;
import com.amdocslearn.dao.ContactDao;

/**
 * Servlet implementation class ContactContro
 */
@WebServlet("/ContactContro")
public class ContactContro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ContactDao contactdao=new ContactDao();  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactContro() {
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
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		int phonen=Integer.parseInt(request.getParameter("phone"));
		String mess =request.getParameter("message");
		int c_id=Integer.parseInt(request.getParameter("c_id"));
		Contact cont=new Contact();
		cont.setUid(id);
		cont.setName(name);
		cont.setEmail(email);
	    cont.setPhoneNo(phonen);
	    cont.setMessage(mess);
		
		contactdao.insert(cont);
	}

}
