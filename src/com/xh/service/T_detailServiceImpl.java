package com.xh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xh.dao.T_detailDao;
import com.xh.entity.T_detail;


@Service
@Transactional
public class T_detailServiceImpl implements T_detailService{

		@Autowired
		private T_detailDao t_detailDao;

		@Override
		public int addT(T_detail t_detail) {
			// TODO 自动生成的方法存根
			int i = t_detailDao.insertT(t_detail);
			return i;
		}
}
