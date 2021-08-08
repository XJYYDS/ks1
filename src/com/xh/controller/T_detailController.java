package com.xh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xh.entity.T_detail;
import com.xh.service.T_detailService;

@Controller
@RequestMapping("/t_detail")
public class T_detailController {
	@Autowired
	private T_detailService t_detailService;
	
	//新增
		@RequestMapping("/addT")
		public String addT(T_detail t_detail){
			int i = t_detailService.addT(t_detail);
			if(i>0){
				System.out.println("添加成功");
				return "redirect:/t_business/query";
				}else{
					System.out.println("添加失败");
					return "index";
				}
			}
	}