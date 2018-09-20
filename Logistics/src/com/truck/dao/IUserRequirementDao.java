package com.truck.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.truck.bean.UserRequirementBean;

public interface IUserRequirementDao {

	public UserRequirementBean selectByPrimaryKey(Integer id);

	/**
	 * 插入一条用户需求记录，传入一个userRequirementBean
	 * 
	 * @param userRequirementBean
	 */
	@Insert("insert into " + "t_requirement(" + "r_origin," + "r_destination,"
			+ "r_departuretime," + "r_cost," + "r_u_id) " + "r_c_id,"
			+ "values(" + "#{userRequirement.origin},"
			+ "#{userRequirement.destination},"
			+ "#{userRequirement.departureTime}," + "#{userRequirement.cost},"
			+ "#{userRequirement.userBean.id},"
			+ "#{userRequirement.carTypeBean.id})")
	public void insertUserRequirement(
			@Param(value = "userRequirement") UserRequirementBean userRequirementBean);

	/**
	 * 查询符合条件的用户需求10条，适用于分页查询
	 * 
	 * @param bean
	 * @return
	 * @author lsl
	 */
	@Select("<script>select r_id id,r_origin origin,r_destination destination,r_departureTime departureTime, r_u_id userBean,r_c_id carTypeBean,r_cost cost from t_requirement"
			+ " <where>"
			+ "<if test='bean.origin!=null' >r_origin like concat('%',#{bean.origin},'%')</if>"
			+ "<if test='bean.destination!=null' >and r_destination like concat('%',#{bean.destination},'%')</if>"
			+ "<if test='bean.departureTime!=null' >and r_departureTime=#{bean.departureTime}</if>"
			+ "</where>" + "limit #{a}, #{b}" + "</script>")
	List<UserRequirementBean> getALLOfOnePage(
			@Param("bean") UserRequirementBean bean, @Param("a") int a,
			@Param("b") int b);

	/**
	 * 获得满足条件的所有用户需求，以便获得页数
	 * 
	 * @param bean
	 * @return
	 * @author lsl
	 */
	@Select("<script>select r_id id,r_origin origin,r_destination destination,r_departureTime departureTime, r_u_id userBean,r_c_id carTypeBean,r_cost cost from t_requirement"
			+ " <where>"
			+ "<if test='origin!=null' >r_origin like concat('%',#{origin},'%')</if>"
			+ "<if test='destination!=null' >and r_destination like concat('%',#{destination},'%')</if>"
			+ "<if test='departureTime!=null' >and r_departureTime=#{departureTime}</if>"
			+ "</where>" + "</script>")
	List<UserRequirementBean> getALL(UserRequirementBean bean);
}
