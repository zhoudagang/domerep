package org.cheung.base.test;

import javax.annotation.Resource;

import org.cheung.base.Application;
import org.cheung.base.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestSampleController {
	@Resource
	private Application sampleController;

	@Resource
	private HelloController helloController;
	
	@Test
	public void testHome() {
	}

}
