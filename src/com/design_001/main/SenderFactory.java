package com.design_001.main;

import com.design_001.main.impl.MailSender;
import com.design_001.main.impl.SmsSender;

/**
 * 
 * Title: SenderFactory.java Description: ���͹����� Company: www.edu24ol.com
 * 
 * @author pc-zw
 * @date 2015��12��24������3:51:26
 * @version 1.0
 */
public class SenderFactory {

	/**
	 * sender��������
	 * @param type
	 * @return Sender
	 */
	public ISender produce(String type) {
		if ("email".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("��������ȷ������!");
			return null;
		}
	}
}
