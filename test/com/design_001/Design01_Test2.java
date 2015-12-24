package com.design_001;

import com.design_001.main.ISender;
import com.design_001.main.SenderFactory;
import com.design_001.main.SenderFactory2;

/**
 * Title:   Design01_Test.java
 * Description: 多个静态工厂模式测试  
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015年12月24日下午4:02:36
 * @version  1.0
 */
public class Design01_Test2 {

	public static void main(String[] args) {
		 
	     ISender sender = SenderFactory2.produceSms(); 
	     sender.send("110", "哈哈哈");
	     ISender sender2 = SenderFactory2.produceMail();
	     sender2.send("120", "嘿嘿嘿");
	}
}
