/**  
* <p>Title: SchedulerConfig.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月16日  
* @version 1.0  
*/  
package org.cheung.base.config;

import java.util.concurrent.Executors;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**  
* <p>Title: SchedulerConfig</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月16日  
*/
@Configuration // 定时调度的配置类一定要实现指定的父接口
public class SchedulerConfig implements  SchedulingConfigurer{

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(Executors.newScheduledThreadPool(100));
	}

}
