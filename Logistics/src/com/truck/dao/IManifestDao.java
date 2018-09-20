package com.truck.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.truck.bean.ManifestBean;

public interface IManifestDao {

	 public ManifestBean selectManifestByUserRequirementId(Integer id);
	 
	 @Insert("insert into "
	 			+ "t_manifest("
	 			+ "m_name,"
	 			+ "m_count,"
	 			+ "m_r_id) "
	 		+ "values("
	 			+ "#{manifest.name},"
	 			+ "#{manifest.count},"
	 			+ "#{manifest.userRequirementBean.id})")
	 public void insertManifest(@Param(value="manifest") ManifestBean manifestBean);
}
