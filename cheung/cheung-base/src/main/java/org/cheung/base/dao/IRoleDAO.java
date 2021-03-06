/**  
* <p>Title: IRoleDAO.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月16日  
* @version 1.0  
*/  
package org.cheung.base.dao;

import java.util.Set;

import org.apache.ibatis.annotations.Mapper;

/**  
* <p>Title: IRoleDAO</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月16日  
*/
@Mapper
public interface IRoleDAO {
	public Set<String> findAllRoleByMember(String mid) ; 
}
