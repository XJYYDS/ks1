package com.xh.service;

import java.util.ArrayList;

import com.xh.entity.T_business;

public interface T_businessService {
	
	//���
	public int add(T_business t_business);
	//ȫ��
    public ArrayList<T_business> queryAll();
	//ɾ��
	public int del(int bId);

}
