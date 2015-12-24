package com.design_001.main.impl;

import com.design_001.main.ISender;

/**
 * 
 * Title:   SmsSender.java
 * Description: SMS 发送  
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015年12月24日下午3:47:20
 * @version  1.0
 */
public class SmsSender implements ISender{

	@Override
	public void send(String mobile, String message) {
		System.out.println("正在给 "+mobile+" 发送SMS消息-----"+message+"-----【SMS】");		
	}

}
