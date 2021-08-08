package com.xh.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xh.entity.T_detail;

@Repository
public class T_detailDaoImpl implements T_detailDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertT(T_detail t_detail) {
		String sql = "insert into t_detail (bdId,bdName,bdPerson) values (?,?,?)";
		int i = jdbcTemplate.update(sql,t_detail.getBdId(),t_detail.getBdName(),t_detail.getBdPerson() );
		
		return i;
	}

}
