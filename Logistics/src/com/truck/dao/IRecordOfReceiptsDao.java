package com.truck.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.truck.bean.RecordOfReceiptsBean;

/**
 * 收款记录表操作
 * 
 * @author lsl
 * @version 1.0
 */
public interface IRecordOfReceiptsDao {

	/**
	 * 
	 * @param id
	 * @return
	 */
	@Delete("delete from t_recordofreceipts where r_id=#{id}")
	int deleteById(Integer id);

	/**
	 * 插入一条收款记录
	 * @param bean
	 * @return
	 */
	@Insert("insert into t_recordofreceipts(r_o_id,r_modeofpayment,r_sum) values(#{orderBean.id},#{modeOfPayment},#{sum})")
    int insert(RecordOfReceiptsBean bean);

	/**通过id查询付款记录
	 * @param id
	 * @return
	 */
	@Select("select * from t_recordofreceipts where r_id=#{id}")
    RecordOfReceiptsBean selectById(Integer id);
	
	
	/**通过订单id查询付款记录
	 * @param id
	 * @return
	 */
	@Select("select * from t_recordofreceipts where r_o_id=#{id}")
    RecordOfReceiptsBean selectByOrderId(Integer id);


	/**
	 * 更新收款记录
	 * 
	 * @param bean
	 * @return
	 */
	@Update("update t_recordofreceipts <set>"
			+ "<if(test='modeOfPayment!=null')>r_modeofpayment=#{modeofpayment},</if>"
			+ "<if(test='sum!=0')>r_sum=#{sum}</if>"
			+ "</set>")
    int update(RecordOfReceiptsBean bean);

}
