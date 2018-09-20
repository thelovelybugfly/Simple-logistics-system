package com.truck.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.truck.bean.RecordOfPaymentBean;

/**
 * 付款表操作
 * 
 * @author lsl
 * @version 1.0
 */
public interface IRecordOfPaymentDao {

	/**
	 * 根据id删除该条记录
	 * 
	 * @param id
	 * @return
	 */
	@Delete("delete from t_recordofpayment where r_id=#{id}")
	int deleteByid(Integer id);

	/**
	 * 插入一条付款记录
	 * @param record
	 * @return
	 */
	@Insert("insert into  t_recordofpayment(r_modeofpayment,r_sum,r_o_id) values(#{modeOfPayment},#{sum},#{bean.orderBean.id})")
    int insert(@Param(value="bean")RecordOfPaymentBean bean);

	/**
	 * 通过id查询
	 * @param id
	 * @return
	 */
	@Select("select * from t_recordofpayment where r_id=#{id}")
    RecordOfPaymentBean selectById(Integer id);
	
	/**
	 * 通过id查询
	 * @param oId
	 * @return
	 */
	@Select("select * from t_recordofpayment where r_o_id=#{oId}")
    RecordOfPaymentBean selectByOrderId(Integer oId);

    /**
     * 更新记录
     * 
     * @param record
     * @return
     */
    @Update("")
    int updateByPrimaryKey(RecordOfPaymentBean record);
}
