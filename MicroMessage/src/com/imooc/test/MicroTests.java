package com.imooc.test;

import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDAO;

public class MicroTests {
	public static void main(String[] args) {
		MessageDAO dao =  new MessageDAO();
		List<Message> messages = dao.queryMessageList("", "");
		for (Message message : messages) {
			System.out.println(message.toString());
			
		}
	}
}
