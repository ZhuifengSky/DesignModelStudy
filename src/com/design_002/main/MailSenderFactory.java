package com.design_002.main;

import com.design_001.main.ISender;
import com.design_001.main.impl.MailSender;
import com.design_001.main.impl.SmsSender;

/**
 * 
 * Title: SenderFactory.java 
 * Description: 专门生产MailSender的工厂类 
 * Company: www.edu24ol.com
 * @author pc-zw
 * @date 2015年12月24日下午3:51:26
 * @version 1.0
 */
public class MailSenderFactory implements IProducer{

	@Override
	public ISender produceSender() {
		return new MailSender();
	}
}
