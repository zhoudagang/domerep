/**  
* <p>Title: IMessageServiceimpl.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base.service.impl;

import org.cheung.base.service.IMessageService;
import org.springframework.stereotype.Service;

/**  
* <p>Title: IMessageServiceimpl</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月15日  
*/
@Service
public class MessageServiceImpl implements IMessageService {

	@Override
	public String info() {
		return "hello world";
	}

}
