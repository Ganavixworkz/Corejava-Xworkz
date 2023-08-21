package com.xworkz.snapchatapp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.snapchatapp.dto.SnapDto;
import com.xworkz.snapchatapp.service.SnapService;
import com.xworkz.snapchatapp.service.SnapServiceImpl;


@WebServlet(urlPatterns = "/register")
public class SnapRunner extends HttpServlet{

	public SnapRunner() { 
		System.out.println("OttServlet constructor");
	}
	
	SnapDto dto=new SnapDto();
	SnapService ser=new SnapServiceImpl();
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		System.out.println("doPost method");
		
	
		int id=Integer.parseInt(req.getParameter("userId"));
		String email=req.getParameter("email");
		String name=req.getParameter("userName");
		String password=req.getParameter("password");
		long number=Long.parseLong(req.getParameter("phoneNumber"));
		String address=req.getParameter("address");
		String country=req.getParameter("country");
		String gender=req.getParameter("gender");
		String dob=req.getParameter("dob");
		Boolean type=Boolean.parseBoolean(req.getParameter("accountType"));
		

		
		dto.setUserId(id);
		System.out.println(id);
		dto.setEmail(email);
		System.out.println(email);
		dto.setUserName(name);
		System.out.println(name);
		dto.setPassword(password);
		System.out.println(password);
		dto.setPhoneNumber(number);
		System.out.println(number);
		dto.setAddress(address);
		System.out.println(address);
		dto.setCountry(country);
		System.out.println(country);
		dto.setGender(gender);
		System.out.println(gender);
		dto.setDob(dob);
		System.out.println(dob);
		dto.setAccountType(type);
		System.out.println(type);
		
	SnapService service=new SnapServiceImpl();
		try {
			service.onSave(dto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.setAttribute("d", dto);
		RequestDispatcher dispatcher=req.getRequestDispatcher("success.jsp");
		dispatcher.forward(req, resp);
}

	}


