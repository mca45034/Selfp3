package com.rays.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.dto.UserDTO;
import com.rays.model.UserModel;

@WebServlet("/UserListCtl")
public class UserListCtl extends HttpServlet {
	public static final String OP_SAVE = "Save";
	public static final String OP_DELETE = "Delete";
	public static final String OP_NEXT = "Next";
	public static final String OP_PREVIOUS = "Previous";
	public static final String OP_ADD = "Add";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDTO dto = new UserDTO();
		UserModel model = new UserModel();
		int pageNo = 1;
		int pageSize = 5;

		List list = model.search(dto, pageNo, pageSize);
		List nextList = model.search(dto, pageNo + 1, pageSize);
		req.setAttribute("nextlist", nextList.size());
		req.setAttribute("list", list);
		req.setAttribute("pageNo", pageNo);
		req.setAttribute("PageSize", pageSize);
		RequestDispatcher rd = req.getRequestDispatcher("UserListView.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String op = (String) req.getParameter("operation");
		System.out.println(op);
		if (OP_ADD.equalsIgnoreCase(op)) {
			System.out.println("add chali....");
//			RequestDispatcher rd=req.getRequestDispatcher("UserRegistrationCtl");
//		       rd.forward(req, resp);
			resp.sendRedirect("UserRegistrationCtl");
		}
		int pageNo = 1;
		int pageSize = 5;
		// pageNo=Integer.parseInt(req.getParameter("pageNo"));

		int ids = (int) Integer.parseInt(req.getParameter("ids"));
		System.out.println(ids);
		UserDTO dto = new UserDTO();
		UserModel model = new UserModel();
//		if(OP_DELETE.equalsIgnoreCase(op)) {
//			System.out.println("delete chali....");
//			if(ids >0) {
//				dto.setId(ids);
//						model.delete((dto));
//						
//					
//
//				req.setAttribute("succ", "record deleted sussefully..!!!!");
////				RequestDispatcher rd=req.getRequestDispatcher("UserListView.jsp");
////			       rd.forward(req, resp);
//				resp.sendRedirect("UserListCtl");
//			}
//			else {
//				System.out.println("delete else chali...");
//				List list=model.search(dto,pageNo,pageSize);
//			      req.setAttribute("list", list);
//				req.setAttribute("msg", "select atleast one record..!!!!");
////				RequestDispatcher rd=req.getRequestDispatcher("UserListView.jsp");
////			       rd.forward(req, resp);
//			}
//			
//		}else 

		List list = model.search(dto, pageNo, pageSize);
		List nextList = model.search(dto, pageNo + 1, pageSize);
		req.setAttribute("list", list);
		req.setAttribute("nextlist", nextList.size());
		req.setAttribute("pageNo", pageNo);
		req.setAttribute("PageSize", pageSize);
		RequestDispatcher rd = req.getRequestDispatcher("UserListView.jsp");
		rd.forward(req, resp);

	}

}
