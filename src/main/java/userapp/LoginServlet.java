package userapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		PrintWriter pw=res.getWriter();
		pw.write("<html style='background:cyan;'>"
				+ "<h1 style='text-align:center;'>"
				+username+" is from "+password+" </h1></html>");
		pw.close();
	}
	

}
