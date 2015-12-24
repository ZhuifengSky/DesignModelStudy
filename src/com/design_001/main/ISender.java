package com.design_001.main;

/**
 * 
 * Title:   ISender.java
 * Description: 发送者  
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015年12月24日下午3:37:02
 * @version  1.0
 */
public interface ISender {

	
	/**
	 * 发送方法
	 * @param mobile
	 * @param message
	 */
	public void send(String mobile, String message);
}
