/**  
* <p>Title: AbstractBaseController.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base.util;

import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**  
* <p>Title: AbstractBaseController</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月15日  
*/
public abstract class AbstractBaseController {
	@Resource
	private MessageSource messageSource; // 自动注入此资源对象
	
	/**  
	 * <p>Title: getMessage</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param args
	 * @return  
	 */  
	public String getMessage(String key, String... args) {
		return this.messageSource.getMessage(key, args, Locale.getDefault());
		}

	
	@InitBinder
	public void initBinder(WebDataBinder binder) { // 在本程序里面需要针对于日期格式进行处理
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
	binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sdf, true));
	}

}
