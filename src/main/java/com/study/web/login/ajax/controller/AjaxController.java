package com.study.web.login.ajax.controller;

import com.alibaba.fastjson.JSON;
import com.study.web.login.ajax.service.AjaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class AjaxController {

	@Autowired
	private AjaxService ajaxService;

	@RequestMapping("/getProvince")
	public void getProvince(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		String json = JSON.toJSONString(ajaxService.getProvince());
		try {
			response.getWriter().print(json);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	@RequestMapping("/getCity")
	public void getCity(String pcode,HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		String json = JSON.toJSONString(ajaxService.getCity(pcode));
		try {
			response.getWriter().print(json);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}
