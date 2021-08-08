package com.xh.service;

import java.util.ArrayList;

import com.xh.entity.T_business;

public interface T_businessService {
	
	//Ìí¼Ó
	public int add(T_business t_business);
	//È«²é
    public ArrayList<T_business> queryAll();
	//É¾³ý
	public int del(int bId);

}
