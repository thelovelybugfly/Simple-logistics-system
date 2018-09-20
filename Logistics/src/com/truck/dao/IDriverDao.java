/*package com.truck.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.truck.bean.DriverBean;

*//**
 * 司机DAO接口
 * 
 * @author lsl
 * @version 1.3
 *//*
public interface IDriverDao {

	*//**
	 * 通过id查询driver
	 * 
	 * @param id
	 * @return
	 *//*
	@Select("select * from t_driver where d_id=#{id}")
	DriverBean selectDriverById(Integer id);

	*//**
	 * 通过name查询driver
	 * 
	 * @param name
	 * @return
	 *//*
	@Select("select * from t_driver where d_name=#{name}")
	DriverBean selectDriverByName(String name);

	*//**
	 * 新增driver,传入一个DriverBean
	 * 
	 * @param DriverBean
	 *//*
	@Insert("insert into t_driver(d_name,d_pass,d_realname,d_idnumber,d_sex) values(#{driver.name},#{driver.pass},#{driver.realName},#{driver.idNumber},#{driver.sex}")
	void insertUser(@Param(value = "driver") DriverBean driverBean);

	*//**
	 * 通过id删除driver
	 * 
	 * @param id
	 *//*
	@Delete("delete from t_driver where d_id=#{id}")
	void deleteUser(@Param(value = "id") Integer id);

	*//**
	 * 更新driver，传入一个DriverBean
	 * 
	 * @param DriverBean
	 *//*
	@Update("update driver set d_name=#{driver.name},d_pass=#{driver.pass},d_realname=#{driver.realName},d_idnumber=#{driver.idNumber},d_sex=#{driver.sex} where d_id=#{driver.id}")
	void updateUser(@Param(value = "driver") DriverBean driverBean);
}
*/