package com.design_002;

import com.design_001.main.ISender;
import com.design_001.main.SenderFactory2;
import com.design_002.main.IProducer;
import com.design_002.main.MailSenderFactory;
import com.design_002.main.SmsSenderFactory;
/**
 * 
 * Title:   Design02_Test.java
 * Description:抽象多个工厂的模式测试方法   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015年12月24日下午4:32:32
 * @version  1.0
 */
public class Design02_Test {

	public static void main(String[] args) {
	     IProducer smsFactory = new SmsSenderFactory();
	     ISender smsSender = smsFactory.produceSender();
	     smsSender.send("110", "哈哈哈");
	     IProducer mailFactory = new MailSenderFactory();
	     ISender mailSender = mailFactory.produceSender();
	     mailSender.send("120", "呵呵呵");
	}
}
