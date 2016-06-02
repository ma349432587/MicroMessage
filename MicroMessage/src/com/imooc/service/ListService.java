package com.imooc.service;

import java.util.ArrayList;
import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDAO;

/**
 * 列表相关的业务功能
 *
 */
public class ListService {
	public List<Message> queryMessageList(String command, String description) {
		MessageDAO dao = new MessageDAO();
		List<Message> messages = new ArrayList<Message>();
		messages = dao.queryMessageList(command, description);
		return messages;
	}
}
