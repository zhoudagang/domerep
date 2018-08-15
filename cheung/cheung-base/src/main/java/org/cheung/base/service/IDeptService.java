package org.cheung.base.service;

import java.util.List;

import org.cheung.base.vo.Dept;

public interface IDeptService {
	public List<Dept> list() ;
	public boolean add(Dept vo) ;
}
