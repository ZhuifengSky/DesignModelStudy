package com.design_002;

import com.design_001.main.ISender;
import com.design_001.main.SenderFactory2;
import com.design_002.main.IProducer;
import com.design_002.main.MailSenderFactory;
import com.design_002.main.SmsSenderFactory;
/**
 * 
 * Title:   Design02_Test.java
 * Description:������������ģʽ���Է���   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015��12��24������4:32:32
 * @version  1.0
 */
public class Design02_Test {

	public static void main(String[] args) {
	     IProducer smsFactory = new SmsSenderFactory();
	     ISender smsSender = smsFactory.produceSender();
	     smsSender.send("110", "������");
	     IProducer mailFactory = new MailSenderFactory();
	     ISender mailSender = mailFactory.produceSender();
	     mailSender.send("120", "�ǺǺ�");
	}
}
