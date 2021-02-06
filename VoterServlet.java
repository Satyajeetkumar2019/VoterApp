package com.bce.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@WebServlet("/VoterServlet")
public class VoterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
	    //PrintWriter
		PrintWriter pw=null;
		String name=null;
		String tsno=null;
     	int  age=0;
		//General seting 
		pw=res.getWriter();
		//setContType
		res.setContentType("text/html");
		//Get request parameter values from
		name=req.getParameter("name");
		tsno= req.getParameter("age");
		age=Integer.parseInt(tsno);
		//Write a request response 
		if(age>=18)
			pw.println("<h1 style='color:green'>"+name+"you are  Eligible for Vote</h1>");
		else
		pw.println("<h1 style='color:red'>"+name+"you are  not  Eligible for Vote</h1>");
		//add hyperlink below
		pw.println("<a href='input.html'> <image src=james.jpg'>Home</a>");
		//close strime
		pw.close();
	}//end of the service method
}//end of the class
