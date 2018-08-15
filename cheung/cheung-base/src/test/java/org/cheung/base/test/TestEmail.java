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
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
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
public class TestEmail {
	@Resource
	private JavaMailSender javaMailSender;

	@Test
	public void testSendMail() {
		SimpleMailMessage message = new SimpleMailMessage(); // 要发送的消息内容
		message.setFrom("15371646664@163.com");
		message.setTo("zhougang@imonsoft.com");
		message.setSubject("测试邮件");
		message.setText("好好学习，天天向上");
		this.javaMailSender.send(message);
	}

}
