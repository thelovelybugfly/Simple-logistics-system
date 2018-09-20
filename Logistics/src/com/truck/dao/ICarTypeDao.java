package com.truck.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.truck.bean.CarTypeBean;
/**
 * 对货车类型的插入与查询
 * 
 * @author lsl
 * @version 1.0
 */
public interface ICarTypeDao {

	/**
	 * 插入一种新的货车类型收费标准
	 * 
	 * @param record
	 * @return
	 */
	@Insert("insert into t_cartype(c_basic_distance,c_basic_count,c_super_price) values(#{basicDistance},#{basicPrice},#{superPrice})")
	int insert(CarTypeBean bean);

	/**
	 * 通过id查询货车类型，以供计算费用
	 * @param cId
	 * @return
	 */
	@Select("select * from t_cartype where c_id=#{cId}")
	CarTypeBean selectById(Integer id);

}
