package com.apex.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class MyChat extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession se = request.getSession();
		se.setAttribute("chatText", request.getParameter("chatArea")+"&#13;&#10"+ request.getParameter("messageToSend"));
		//System.out.println(request.getParameter("chatArea")+"/n"+ request.getParameter("messageToSend"));
		response.sendRedirect("jsp/chat.jsp");
	}

}
