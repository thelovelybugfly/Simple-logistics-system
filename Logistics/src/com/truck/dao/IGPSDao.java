package com.truck.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.truck.bean.GPSBean;
/**
 * 对GPS信息表进行操作
 * 
 * @author lsl
 * @version 1.0
 */
public interface IGPSDao {

	int deleteByPrimaryKey(Integer gId);

	/**
	 * 插入一条新的gps信息
	 * 
	 * @param record
	 * @return
	 */
	@Insert("insert into t_gps(g_number,g_longitude,g_dimension) values(number,longitude,dimension)")
    int insert(GPSBean bean);

	/**
	 * 通过id查询GpS信息
	 * 
	 * @param id
	 * @return
	 */
    @Select("select * from t_gps where g_id=#{id}")
    GPSBean selectById(Integer id);

    /**
     * 更新gps信息
     * 
     * @param record
     * @return
     */
    @Update("update t_gps set g_longitude=#{longitude},g_dimension=#{dimension} where g_id=#{id}")
    int update(GPSBean bean);
}
