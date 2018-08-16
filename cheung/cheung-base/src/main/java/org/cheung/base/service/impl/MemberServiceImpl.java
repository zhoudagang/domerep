/**  
* <p>Title: MemberServiceImpl.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月16日  
* @version 1.0  
*/  
package org.cheung.base.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.cheung.base.dao.IActionDAO;
import org.cheung.base.dao.IMemberDAO;
import org.cheung.base.dao.IRoleDAO;
import org.cheung.base.service.IMemberService;
import org.cheung.base.vo.Member;
import org.springframework.stereotype.Service;

/**  
* <p>Title: MemberServiceImpl</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月16日  
*/
@Service
public class MemberServiceImpl  implements IMemberService{
	@Resource
	private IMemberDAO memberDAO;
	@Resource
	private IRoleDAO roleDAO;
	@Resource
	private IActionDAO actionDAO;

	@Override
	public Member get(String mid) {
		return this.memberDAO.findById(mid);
	}

	@Override
	public Map<String, Set<String>> listAuthByMember(String mid) {
		Map<String, Set<String>> map = new HashMap<String, Set<String>>();
		map.put("allRoles", this.roleDAO.findAllRoleByMember(mid));
		map.put("allActions", this.actionDAO.findAllActionByMember(mid));
		return map;
	}

	
}
