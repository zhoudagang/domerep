/**  
* <p>Title: IMemberService.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月16日  
* @version 1.0  
*/  
package org.cheung.base.service;

import java.util.Map;
import java.util.Set;

import org.cheung.base.vo.Member;

/**  
* <p>Title: IMemberService</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月16日  
*/
public interface IMemberService {
	public Member get(String mid) ;
	public Map<String,Set<String>> listAuthByMember(String mid) ;
}
