/**  
* <p>Title: HelloController.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**  
* <p>Title: HelloController</p>  
* <p>Description: 强烈建议（Spring 官方建议）：如果要想进行简单方便的开发，所有的程序类一定要在启动类所在包的子包下。 </p>  
* @author zhougang  
* @date 2018年8月15日  
*/

@RestController
public class HelloController {
	@RequestMapping("/")
	public String hello(){
		return "hello";
	}
	
	@RequestMapping("/echo")
	public String echo(String msg) {
	return "【ECHO】" + msg ;
	}

	
	
}
