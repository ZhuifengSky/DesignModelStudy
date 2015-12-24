package com.design_001;

import com.design_001.main.ISender;
import com.design_001.main.SenderFactory;

/**
 * 
 * Title:   Design01_Test.java
 * Description: ��ͨ����ģʽ����  
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015��12��24������4:02:36
 * @version  1.0
 */
public class Design01_Test {

	public static void main(String[] args) {
		 SenderFactory factory = new SenderFactory();  
	     ISender sender = factory.produce("sms");  
	     sender.send("110", "������");
	     ISender sender2 = factory.produce("email");  
	     sender2.send("120", "�ٺٺ�");
	}
}
