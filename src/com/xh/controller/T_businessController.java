package com.xh.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xh.entity.T_business;
import com.xh.service.T_businessService;


@Controller
@RequestMapping("/t_business")
public class T_businessController {
	
	@Autowired
	private T_businessService t_businessService;
	
	//����
	@RequestMapping("/add")
	public String add(T_business t_business){
		int i = t_businessService.add(t_business);
		if(i>0){
			System.out.println("��ӳɹ�");
			return "redirect:/t_business/query";
			}else{
				System.out.println("���ʧ��");
				return "add";
			}
		}
	//ȫ��
	@RequestMapping("/query")
	public String query(HttpSession session){
		ArrayList<T_business> t_business  = t_businessService.queryAll();
		session.setAttribute("t_business", t_business);
		return "query";
	}
	//ɾ��
		@RequestMapping("/del")
		public String del(Integer bId){
			int i = t_businessService.del(bId);
			if(i>0){
				System.out.println("ɾ���ɹ�");
				return "redirect:/t_business/query";
			}else{
				System.out.println("ɾ��ʧ��");
				return "index";
			}
		}
}
