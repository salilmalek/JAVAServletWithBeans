package com.apex.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.apex.sample.beans.*;

public class PersonalInfo extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		
		Validate validate = new Validate();

		String errors;

		errors = validate.isFirstNameValid(req.getParameter("firstName"));
		errors += validate.isLastNameValid(req.getParameter("lastName"));

		if (validate.isEmpty(errors)) {
			JavaBeans javaBeans = new JavaBeans();
			javaBeans.setFirstName(req.getParameter("firstName"));
			javaBeans.setLastName(req.getParameter("lastName"));
			javaBeans.setMiddleName(req.getParameter("middleName"));
			javaBeans.setGender(req.getParameter("gender"));

			req.getSession().setAttribute("javaBeans", javaBeans);
			resp.sendRedirect("html/contactinfo.html");
		} else {
			req.setAttribute("errors", errors);
			req.getRequestDispatcher("jsp/personalinfo.jsp").forward(req, resp);
		}
	}
}