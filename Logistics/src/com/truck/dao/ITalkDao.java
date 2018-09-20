package com.truck.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;




import com.truck.bean.TalkBean;
	/**
	 * 查找评论和添加评论
	 * @author Administrator
	 *
	 */
public interface ITalkDao {
	/**
	 * 查看所有评论
	 * @return
	 */
	@Select("select id as id,p_name as pname,p_text as text,p_date as date from p_table")
	public List<TalkBean> findAllTalk();
	/**
	 * 添加评论
	 * @param bean
	 */
	@Insert("insert into p_table (pname,text,date) value(#{bean.pname},#{bean.text},#{bean.date})")
	public void addTalk(@Param("bean")TalkBean bean);
}
