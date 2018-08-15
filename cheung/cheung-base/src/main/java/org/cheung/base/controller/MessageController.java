/**  
* <p>Title: MessageController.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base.controller;

import javax.annotation.Resource;

import org.cheung.base.service.IMessageService;
import org.cheung.base.util.AbstractBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**  
* <p>Title: MessageController</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月15日  
*/
@Controller
public class MessageController extends AbstractBaseController {
	@Resource
	private IMessageService messageService ;
	
	@RequestMapping(value = "/echo", method = RequestMethod.GET)
	public String echo(String mid) {
		System.out.println("【*** 访问地址 ***】" + super.getMessage("member.add.action"));
		return super.getMessage("welcome.msg", mid);
		}
	
	
	@RequestMapping(value = "/ss", method = RequestMethod.GET)
	public String index() {
		return this.messageService.info() ;
	}
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String show(String mid, Model model) {
	model.addAttribute("url", "https://github.com/zhoudagang"); // request属性传递包装
	model.addAttribute("mid", mid); // request属性传递包装
	return "message/message_show"; // 此处只返回一个路径， 该路径没有设置后缀，后缀默认是*.html
	}
	
	
}
