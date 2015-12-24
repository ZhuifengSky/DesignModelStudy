package com.design_002.main;

import com.design_001.main.ISender;

/**
 * 
 * Title:   IProducer.java
 * Description: 基类  
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015年12月24日下午3:37:02
 * @version  1.0
 */
public interface IProducer {

	/**
	 * 生产Sender的方法
	 * @return
	 */
	public ISender produceSender();
	
}
