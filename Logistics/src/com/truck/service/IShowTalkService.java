package com.truck.service;

import java.util.List;

import com.truck.bean.TalkBean;

public interface IShowTalkService {
	
	public List<TalkBean> findAll();
	public void addTalk(TalkBean bean);
}