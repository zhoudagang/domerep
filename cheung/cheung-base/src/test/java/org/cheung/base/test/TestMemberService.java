/**  
* <p>Title: Testemail.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base.test;

import javax.annotation.Resource;

import org.cheung.base.Application;
import org.cheung.base.service.IMemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**  
* <p>Title: Testemail</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月15日  
*/
@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestMemberService {

	@Resource
	private IMemberService memberService ;
	@Test
	public void testGet() {
	System.out.println(this.memberService.get("admin"));
	}
	@Test
	public void testAuth() {
	System.out.println(this.memberService.listAuthByMember("admin"));
	}

}
