/**  
* <p>Title: UploadController.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base.controller;

import org.cheung.base.util.AbstractBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
/**  
* <p>Title: UploadController</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月15日  
*/
@Controller
public class UploadController extends AbstractBaseController{
	
	@RequestMapping(value = "/uploadPre", method = RequestMethod.GET)
	public String uploadPre() { // 通过model可以实现内容的传递
		return "message/upload_page";
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public String upload(String name, MultipartFile photo) {
		if (photo != null) { // 现在有文件上传
			System.out.println("【*** 文件上传 ****】name = " + name);
			System.out.println("【*** 文件上传 ****】photoName = " + photo.getName());
			System.out.println("【*** 文件上传 ****】photoContentType = " + photo.getContentType());
			System.out.println("【*** 文件上传 ****】photoSize = " + photo.getSize());
		}
		return "upload-file";
	}

}
