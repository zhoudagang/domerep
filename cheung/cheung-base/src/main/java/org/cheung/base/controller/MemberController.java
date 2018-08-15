/**  
* <p>Title: MemberController.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base.controller;

import org.cheung.base.util.AbstractBaseController;
import org.cheung.base.vo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**  
* <p>Title: MemberController</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月15日  
*/
@Controller
public class MemberController extends AbstractBaseController{

	@RequestMapping(value = "/addPre", method = RequestMethod.GET)
	public String addPre() { // 增加前的准备操作路径
		return "message/member_add" ;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Object add(Member vo) { // 增加前的准备操作路径
		return vo ;
	}
	
	@RequestMapping(value="/get")
	@ResponseBody
	public String get() {
		System.out.println("除法计算：" + (10 / 0));
		return "hello world" ;
	}

}
