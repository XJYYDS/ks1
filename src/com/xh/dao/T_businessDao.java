package com.xh.dao;

import java.util.ArrayList;

import com.xh.entity.T_business;

public interface T_businessDao {
	//���
	public int insert(T_business t_business);
	
	//ȫ��
	public ArrayList<T_business> selectAll();
		
	//ɾ��
	public int delete(int bId);

}
