package com.truck.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.truck.bean.ComplaintBean;

public interface IComplaintDao {

	/**
	 * 插入一条投诉
	 * @param bean
	 * @return
	 */
	@Insert("insert into t_complaint(c_context,c_o_id) values(#{context},#{bean.orderBean.id})")
    int insert(@Param(value="bean")ComplaintBean bean);

	/**
	 * 通过id查询投诉
	 * @param cId
	 * @return
	 */
	@Select("select * from t_complaint where c_id=#{id}")
    ComplaintBean selectById(Integer id);
	
	/**
	 * 查询所有的投诉信息
	 * 
	 * @return
	 */
	@Select("select * from t_complaint")
	List<ComplaintBean> selectAll();
}
