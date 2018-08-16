/**  
* <p>Title: MemberController.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base.controller;

import javax.annotation.Resource;

import org.cheung.base.service.IMemberService;
import org.cheung.base.util.AbstractBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**  
* <p>Title: MemberController</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月15日  
*/
@Controller
public class MemberController extends AbstractBaseController{

	@Resource
	private IMemberService memberService;
	@RequestMapping(value="/member/get",method=RequestMethod.POST)
	public Object get(String mid) {
	return this.memberService.get(mid) ;
	}
	@RequestMapping(value="/member/auth",method=RequestMethod.POST)
	public Object auth(String mid) {
	return this.memberService.listAuthByMember(mid) ;
	}


}
