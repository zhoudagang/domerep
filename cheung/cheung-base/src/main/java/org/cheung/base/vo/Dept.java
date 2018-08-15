/**  
* <p>Title: Dept.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/  
package org.cheung.base.vo;

import java.io.Serializable;

/**  
* <p>Title: Dept</p>  
* <p>Description: </p>  
* @author zhougang  
* @date 2018年8月15日  
*/
public class Dept implements Serializable {
	private Long deptno;
	private String dname;

	public Long getDeptno() {
		return deptno;
	}

	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
}
