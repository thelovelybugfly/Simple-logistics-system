package com.truck.dao;
import org.apache.ibatis.annotations.Param;

import com.truck.bean.TruckBean;

public interface ITruckDao {
	/**
	 * 通过id查询出货车信息
	 * @param id 需要查出的货车的id
	 * @return TruckBean 返回货车信息的Bean
	 */
	public TruckBean getTruckMsgById(Integer id);
	/**
	 * 通过Bean查询出货车信息
	 * @param truck 需要查出的货车的id
	 * @return TruckBean 返回货车信息的Bean
	 */
	public TruckBean getTruckMsgByBean(@Param(value="truck")TruckBean truck);
	/**
	 * 通过Bean 添加货车信息
	 * @param truck 需要添加的货车Bean
	 * @return TruckBean 返回货车信息的Bean
	 */
	public void addTruck(@Param(value="truck")TruckBean truck);
	/**
	 * 通过Bean 修改货车信息
	 * @param truck 需要修改的货车Bean
	 * @return TruckBean 返回货车信息的Bean
	 */
	public void updateTruck(@Param(value="truck")TruckBean truck);
}
