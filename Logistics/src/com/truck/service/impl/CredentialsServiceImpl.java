package com.truck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.bean.CredentialsBean;
import com.truck.dao.ICredentialsDao;
import com.truck.service.ICredentialsService;

@Service("credentialsService")
public class CredentialsServiceImpl implements ICredentialsService{
	
	@Autowired
	private ICredentialsDao credentialsDao;
	
	@Override
	public boolean uploadCredentials(CredentialsBean credentialsBean) {
		// 是否上传成功，默认为false不通过
		boolean isUploas = false;
		
		credentialsDao.insertCredentials(credentialsBean);
		
		return isUploas;
	}
	
	@Override
	public boolean credentialsDriver(Integer id) {
		// 是否审核认证信息通过，默认为false不通过
		boolean isCredentials = false;
		
		credentialsDao.updateCredentials(id, 1);
		
		return isCredentials;
	}

	@Override
	public List<CredentialsBean> getIsCredentials(Integer page) {
		
		int limitIndex = (page - 1)*10;
		
		return credentialsDao.selectCredentialsByState(1,limitIndex);
		
	}

	@Override
	public List<CredentialsBean> getNotCredentials(Integer page) {
		
		int limitIndex = (page - 1)*10;
		
		return credentialsDao.selectCredentialsByState(0, limitIndex);
	}

	@Override
	public List<CredentialsBean> getAllCredentials(Integer page) {
		
		int limitIndex = (page - 1)*10;
		
		return credentialsDao.selectAllCredentials(limitIndex);
	}

	@Override
	public Integer getTotalPage() {
		
		Integer totalPage = 1;
		
		Integer totalCredentials = credentialsDao.selectCountOfCredentials();
		
		if(totalCredentials % 10 == 0){
			totalPage = totalCredentials / 10;
		} else {
			totalPage = (totalCredentials / 10) + 1;
		}
		
		System.out.println(totalPage);
		return totalPage;
	}

	@Override
	public Integer getTotalPageIsCredentials() {
		
		Integer totalPage = 1;
		
		Integer totalCredentials = credentialsDao.selectCountBystate(1);
		
		if(totalCredentials % 10 == 0){
			totalPage = totalCredentials / 10;
		} else {
			totalPage = (totalCredentials / 10) + 1;
		}
		
		return totalPage;
	}

	@Override
	public Integer getTotalPageNotCredentials() {

		Integer totalPage = 1;
		
		Integer totalCredentials = credentialsDao.selectCountBystate(0);
		
		if(totalCredentials % 10 == 0){
			totalPage = totalCredentials / 10;
		} else {
			totalPage = (totalCredentials / 10) + 1;
		}
		
		return totalPage;
	}

	
}
