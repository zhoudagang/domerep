/**  
* <p>Title: MyWebApplicationConfig.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base.config;

import org.cheung.base.util.MyInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**  
* <p>Title: MyWebApplicationConfig</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月15日  
*/
public class MyWebApplicationConfig  extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) { // 进行拦截器的注册处理操作
		
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**"); // 匹配路径
		super.addInterceptors(registry);
	}

}
