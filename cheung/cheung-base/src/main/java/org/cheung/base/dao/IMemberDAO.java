/**  
* <p>Title: IMemberDAO.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月16日  
* @version 1.0  
*/  
package org.cheung.base.dao;

import org.apache.ibatis.annotations.Mapper;
import org.cheung.base.vo.Member;

/**  
* <p>Title: IMemberDAO</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月16日  
*/
@Mapper
public interface IMemberDAO {
	
	public Member findById(String mid) ;
	
}
