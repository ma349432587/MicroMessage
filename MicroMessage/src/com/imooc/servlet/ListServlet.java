package com.imooc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDAO;
import com.imooc.service.ListService;

/**
 * 列表
 *
 */
@SuppressWarnings("serial")
public class ListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
//		接受页面的值
		String command = req.getParameter("command");
		String description = req.getParameter("description");
//		向页面传值
		req.setAttribute("command", command);
		req.setAttribute("description", description);
//		调用service
		ListService listService = new ListService();
		req.setAttribute("listMessage", listService.queryMessageList(command, description));
//		页面跳转
		req.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
