package com.apex.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apex.sample.beans.*;

/**
 * Servlet implementation class BankInfo
 */
public class BankInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		JavaBeans javaBeans = (JavaBeans) request.getSession().getAttribute(
				"javaBeans");

		javaBeans.setBankName(request.getParameter("bankName"));
		javaBeans.setAccount(request.getParameter("account"));
		javaBeans.setSsn(request.getParameter("SSN"));

		
		 try { DbAccess.insert(javaBeans); } catch (Exception e) {
		  e.printStackTrace(); }
		 

		response.sendRedirect("jsp/congratulation.jsp");

	}
}