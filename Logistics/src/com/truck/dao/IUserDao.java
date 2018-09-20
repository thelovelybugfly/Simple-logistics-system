package com.truck.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.truck.bean.UserBean;

/**
 * 用户DAO接口
 * @author Administrator
 */
public interface IUserDao {
	
	/**
	 * 通过id查询user
	 * @param id
	 * @return
	 */
	UserBean selectUserById(Integer id);
	
	/**
	 * 通过name查询user
	 * @param name
	 * @return
	 */
	UserBean selectUserByName(String name);
	
	/**
	 * 新增user,传入一个UserBean
	 * @param userBean
	 */
	@Insert("insert into t_user(u_name,u_pass,u_realname,u_idnumber,u_sex) values(#{user.name},#{user.pass},#{user.realName},#{user.idNumber},#{user.sex})")
	void insertUser(@Param(value = "user") UserBean user);
	
	/**
	 * 通过id删除user
	 * @param id
	 */
	@Delete("delete from t_user where u_id=#{id}")
	void deleteUser(@Param(value = "id") Integer id);
	
	/**
	 * 更新user，传入一个UserBean
	 * @param userBean
	 */
	@Update("update t_user set u_name=#{user.name},u_pass=#{user.pass},u_realname=#{user.realName},u_idnumber=#{user.idNumber},u_sex=#{user.sex} where u_id=#{user.id}")
	void updateUser(@Param(value = "user") UserBean user);
	
}
