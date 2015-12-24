package com.design_001;

import com.design_001.main.ISender;
import com.design_001.main.SenderFactory;

/**
 * 
 * Title:   Design01_Test.java
 * Description: 普通工厂模式测试  
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015年12月24日下午4:02:36
 * @version  1.0
 */
public class Design01_Test {

	public static void main(String[] args) {
		 SenderFactory factory = new SenderFactory();  
	     ISender sender = factory.produce("sms");  
	     sender.send("110", "哈哈哈");
	     ISender sender2 = factory.produce("email");  
	     sender2.send("120", "嘿嘿嘿");
	}
}
