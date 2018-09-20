package com.truck.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.truck.bean.AssessBean;
/**
 * 针对评价表的DAO层接口
 * @author lsl
 * @version 1.0
 */
public interface IAssesDao {

	/**
	 * 针对某条订单记录，插入一条评论 评论为空，等待更新
	 * 
	 * @param record
	 * @return
	 */
	@Insert("insert into t_assess(a_o_id) values(#{id)")
	int insert(Integer id);

	/**
	 * 通过id查询一条评论记录，并将记录填充到AssessBean的一个对象中
	 * 
	 * @param aId
	 * @return
	 */
	@Select("select * from t_assess where a_id=#{id}")
	AssessBean selectById(Integer id);

	/**
	 * 通过订单编号查询一条评论记录，并将记录填充到AssessBean的一个对象中
	 * 
	 * @param orderId
	 * @return
	 */
	@Select("select * from t_assess where a_o_id=#{orderBean.id}")
	AssessBean selectByOrderId(Integer orderId);

	/**
	 * 更新评论中的用户评论或者司机评论
	 * 
	 * @param record
	 * @return
	 */
	@Update("update t_assess set a_context_user=#{bean.userContext},a_context_driver=#{bean.driverContext} where a_o_id =#{bean.orderBean.id}")
	int updateComment(@Param(value = "bean") AssessBean bean);
}
