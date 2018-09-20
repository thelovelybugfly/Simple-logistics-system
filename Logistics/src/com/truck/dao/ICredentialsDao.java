package com.truck.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.truck.bean.CredentialsBean;

public interface ICredentialsDao {

	/**
	 * 通过id查询认证信息，传入一个id
	 * @param id
	 * @return
	 */
	/*@Select("select * from t_credentials where c_id=#{id}")*/
	CredentialsBean selectCredentialsById(Integer id);
	
	/**
	 * 通过state查询认证信息，传入一个state（审核状态）
	 * @param state
	 * @return
	 */
	/*@Select("select * from t_credentials where c_state=#{state}")*/
	List<CredentialsBean> selectCredentialsByState(Integer state,Integer limitIndex);
	
	/**
	 * 查询所有认证信息
	 * @return
	 */
	/*@Select("select * from t_credentials")*/
	List<CredentialsBean> selectAllCredentials(Integer limitIndex);
	
	/**
	 * 新增认证信息，传入一个认证bean，CredentialsBean
	 * @param credentialsBean
	 */
	@Insert("insert into "
			+ "t_credentials"
			+ "(c_idcard_front,"
			+ "c_idcard_back,"
			+ "c_license_front,"
			+ "c_license_back,"
			+ "c_drivering_front,"
			+ "c_drivering_back,"
			+ "c_state,"
			+ "c_d_id,"
			+ "c_t_id) "
			+ "values"
			+ "(#{credentials.idCardFront},"
			+ "#{credentials.idCardBack},"
			+ "#{credentials.licenseFront},"
			+ "#{credentials.licenseBack},"
			+ "#{credentials.driveringFront},"
			+ "#{credentials.driveringBack},"
			+ "#{credentials.driverBean.id},"
			+ "#{credentials.truckBean.id})")
	void insertCredentials(@Param(value = "credentials") CredentialsBean credentialsBean);
	
	/**
	 * 更新认证状态，传入id,state
	 * @param id
	 * @param state
	 */
	@Update("update t_credentials set c_state=#{state} where c_id=#{id}")
	void updateCredentials(@Param(value = "id") Integer id, @Param(value = "state") Integer state);
	
	/**
	 * 查询所有认证信息记录条数
	 * @return
	 */
	@Select("select count(*) num from t_credentials")
	Integer selectCountOfCredentials();
	
	/**
	 * 根据认证状态查询认证信息记录条数
	 * @param state
	 * @return
	 */
	@Select("select count(*) from t_credentials where c_state=#{state}")
	Integer selectCountBystate(@Param(value = "state") Integer state);
}
