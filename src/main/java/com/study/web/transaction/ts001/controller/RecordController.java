package com.study.web.transaction.ts001.controller;

import com.study.web.transaction.ts001.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecordController {
	@Autowired
	private RecordService recordService;

	@RequestMapping(value = "/getRecord")
	public ModelAndView getRecord(String id){
		ModelAndView mav;
		mav = new ModelAndView("/login/lg001/top");
		mav.addObject("RecordList",recordService.getRecord(id));
		return mav;
	}
}
