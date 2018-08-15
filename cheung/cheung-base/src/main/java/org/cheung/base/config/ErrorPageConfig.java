/**  
* <p>Title: ErrorPageConfig.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/
package org.cheung.base.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

/**
 * <p>
 * Title: ErrorPageConfig
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author zhougang
 * @date 2018年8月15日
 */
public class ErrorPageConfig {
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				ErrorPage errorPage400 = new ErrorPage(HttpStatus.BAD_REQUEST, "/error-400.html");
				ErrorPage errorPage404 = new ErrorPage(HttpStatus.NOT_FOUND, "/error-404.html");
				ErrorPage errorPage500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error-500.html");
				container.addErrorPages(errorPage400, errorPage404, errorPage500);
			}
			// 那么此时只要出现了错误，就会找到相应的 http 状态码，而后跳转到指定的错误路径上进行显示。
		};
	}

}
