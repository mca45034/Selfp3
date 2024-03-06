package com.rays.controller;

import java.io.IOException;

import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.dto.UserDTO;
import com.rays.model.UserModel;

@WebServlet("/UserRegistrationCtl")
public class UserRegistrationCtl extends HttpServlet {
	public static final String OP_SAVE = "Save";
	public static final String OP_UPDATE = "update";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// String op = DataUtility.getString(request.getParameter("operation"));
		// get model

		System.out.println("doget chali....");

		UserModel model = new UserModel();
		String id = req.getParameter("id");
		System.out.println(id);
		if (id != null) {
			System.out.println("in id > 0  condition");

			UserDTO dto = model.findByPk(Integer.parseInt(id));
			System.out.println("find by pk chaliii");
			System.out.println("Ankit11111111111");
			System.out.println(dto);
			req.setAttribute("dto", dto);
			RequestDispatcher rd = req.getRequestDispatcher("UserRagistration.jsp");
			rd.forward(req, resp);
		}

		// resp.sendRedirect("UserRagistration.jsp");
		RequestDispatcher rd = req.getRequestDispatcher("UserRagistration.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String op = req.getParameter("operation");
		System.out.println(op);
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		String fname = req.getParameter("fName");
		String lname = req.getParameter("lName");
		String login = req.getParameter("login");
		String pass = req.getParameter("pass");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		UserDTO dto = new UserDTO();
		dto.setId(id);
		dto.setF_name(fname);
		dto.setL_Name(lname);
		dto.setLogin(login);
		dto.setPass(pass);
		dto.setDob(dob);
		dto.setAddress(address);

		if (OP_UPDATE.equalsIgnoreCase(op) || OP_SAVE.equalsIgnoreCase(op)) {
			if (id > 0) {
				UserModel model = new UserModel();
				model.update(dto);
				req.setAttribute("dto", dto);
				req.setAttribute("msg", "User update successfully.....!!!!");
				RequestDispatcher rd = req.getRequestDispatcher("UserRagistration.jsp");
				rd.forward(req, resp);

			} else {

				UserModel model = new UserModel();
				model.add(dto);
				req.setAttribute("msg", "User Insert successfully.....!!!!");
				RequestDispatcher rd = req.getRequestDispatcher("UserRagistration.jsp");
				rd.forward(req, resp);
				return;
			}

		}

		RequestDispatcher rd = req.getRequestDispatcher("UserRagistration.jsp");
		rd.forward(req, resp);
	}

}
