/**  
* <p>Title: DeptServiceImpl.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.cheung.base.dao.IDeptDAO;
import org.cheung.base.service.IDeptService;
import org.cheung.base.vo.Dept;
import org.springframework.stereotype.Service;

/**  
* <p>Title: DeptServiceImpl</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月15日  
*/
@Service
public class DeptServiceImpl  implements IDeptService {

	@Resource
	private IDeptDAO deptDAO;
	
	@Override
	public List<Dept> list() {
		return this.deptDAO.findAll();
	}

	@Override
	public boolean add(Dept vo) {
		return false;
	}

}
