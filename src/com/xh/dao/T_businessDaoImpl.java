package com.xh.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xh.entity.T_business;
@Repository
public class T_businessDaoImpl implements T_businessDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(T_business t_business) {
		String sql = "insert into t_business (bNum,bType,bMark) values (?,?,?)";
		int i = jdbcTemplate.update(sql,t_business.getbNum(),t_business.getbType(),t_business.getbMark() );
		
		return i;
	}

	@Override
	public ArrayList<T_business> selectAll() {
		// TODO 自动生成的方法存根
		String sql = "select * from t_business";
		//String sql = "select t_detail.*,t_business.* from t_detail inner join t_business on t_business.bId=t_detail.bdId; ";
		ArrayList<T_business> queryAll = (ArrayList<T_business>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<T_business>(T_business.class));
		
		return queryAll;
	}

	@Override
	public int delete(int bId) {
		// TODO 自动生成的方法存根
		String sql = "delete from t_business where bId = ?";
		int i =  jdbcTemplate.update(sql, bId);
		return i;
	}

}
