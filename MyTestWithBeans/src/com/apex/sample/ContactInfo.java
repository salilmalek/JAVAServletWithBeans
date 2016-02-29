package com.apex.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apex.sample.beans.*;

/**
 * Servlet implementation class ContactInfo
 */
public class ContactInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		JavaBeans javaBeans = (JavaBeans) request.getSession().getAttribute(
				"javaBeans");

		javaBeans.setAddress(request.getParameter("address"));
		javaBeans.setCity(request.getParameter("city"));
		javaBeans.setState(request.getParameter("state"));
		javaBeans.setCountry(request.getParameter("country"));
		javaBeans.setPhone(request.getParameter("phone"));
		
		response.sendRedirect("html/bankinfo.html");
	}
}
