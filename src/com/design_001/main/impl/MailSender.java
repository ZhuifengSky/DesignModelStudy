package com.design_001.main.impl;

import com.design_001.main.ISender;

public class MailSender implements ISender {

	@Override
	public void send(String mobile, String message) {
		System.out.println("���ڸ� "+mobile+" ����Email��Ϣ-----"+message+"-----��Email��");				
	}

}
