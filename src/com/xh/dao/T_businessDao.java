package com.xh.dao;

import java.util.ArrayList;

import com.xh.entity.T_business;

public interface T_businessDao {
	//Ìí¼Ó
	public int insert(T_business t_business);
	
	//È«²é
	public ArrayList<T_business> selectAll();
		
	//É¾³ý
	public int delete(int bId);

}
