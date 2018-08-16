/**  
* <p>Title: SampleController.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**  
* <p>Title: SampleController</p>  
* <p>Description: @SpringBootApplication  启动SpringBoot程序，而后自带子包扫描</p>  
* @author zhougang  
* @date 2018年8月15日  
*/
@SpringBootApplication
// @EnableScheduling // 启用间隔调度
public class Application {
	 public static void main(String[] args) throws Exception {
		 SpringApplication.run(Application.class, args);
	 }
}
