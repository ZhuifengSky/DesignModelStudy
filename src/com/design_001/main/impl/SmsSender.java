package com.design_001.main.impl;

import com.design_001.main.ISender;

/**
 * 
 * Title:   SmsSender.java
 * Description: SMS ����  
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015��12��24������3:47:20
 * @version  1.0
 */
public class SmsSender implements ISender{

	@Override
	public void send(String mobile, String message) {
		System.out.println("���ڸ� "+mobile+" ����SMS��Ϣ-----"+message+"-----��SMS��");		
	}

}
