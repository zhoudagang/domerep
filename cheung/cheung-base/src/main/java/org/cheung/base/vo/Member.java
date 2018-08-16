/**  
* <p>Title: Member.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* @author zhougang  
* @date 2018年8月15日  
* @version 1.0  
*/
package org.cheung.base.vo;

import java.io.Serializable;

/**
 * <p>
 * Title: Member
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author zhougang
 * @date 2018年8月15日
 */
public class Member implements Serializable {
	private static final long serialVersionUID = -9072114668185614706L;
	private String mid;
	private String name;
	private String password;
	private Integer locked;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

}
