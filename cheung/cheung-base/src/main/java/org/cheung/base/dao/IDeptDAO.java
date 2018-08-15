package org.cheung.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cheung.base.vo.Dept;
@Mapper
public interface IDeptDAO {
	public List<Dept> findAll();
	public boolean doCreate(Dept vo) ;
}
