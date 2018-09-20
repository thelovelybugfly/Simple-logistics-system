package com.truck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.bean.TalkBean;
import com.truck.dao.ITalkDao;
import com.truck.service.IShowTalkService;
@Service("Service")
public class ShowTalkService implements IShowTalkService {

	@Autowired
	private ITalkDao Dao;
	
	@Override
	public List<TalkBean> findAll() {
		// TODO Auto-generated method stub
		return Dao.findAllTalk() ;
	}

	

	@Override
	public void addTalk(TalkBean bean) {
		// TODO Auto-generated method stub
		Dao.addTalk(bean);
	}

}
