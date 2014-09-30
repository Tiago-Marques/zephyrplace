package br.com.zephyrplace.bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(value = "/logout")
public class LogoutSession extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		request.getSession().invalidate();
		response.sendRedirect(request.getContextPath() + "/paginas/index.xhtml");
	}

}
