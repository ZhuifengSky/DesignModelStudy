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
public class SenderFactory2 {

	public static ISender produceMail() {
		return new MailSender();
	}

	public static ISender produceSms() {
		return new SmsSender();
	}
}
