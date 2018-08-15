package org.cheung.base.test;

import javax.annotation.Resource;

import org.cheung.base.Application;
import org.cheung.base.service.IDeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestSampleController {
	
	/*@Resource
	private DataSource dataSource;
	@Test
	public void testConnection() throws Exception {
	System.out.println(this.dataSource.getConnection());
	}*/
	
	@Resource
	private IDeptService deptService;

	@Test
	public void testList() throws Exception {
		System.out.println(this.deptService.list());
	}

}
