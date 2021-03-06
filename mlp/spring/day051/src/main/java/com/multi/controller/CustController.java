package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@Controller
@RequestMapping("/cust")
public class CustController {
	
	@Autowired
	CustBiz biz;
	
	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left", "cust/left");
		mv.addObject("center", "cust/center");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left", "cust/left");
		mv.addObject("center", "cust/register");
		return mv;
	}
	
	@RequestMapping("/registerimpl")
	public ModelAndView registerimpl(ModelAndView mv, CustVO obj) {
		mv.setViewName("main");
		mv.addObject("left", "cust/left");
		try {
			biz.register(obj);
			mv.addObject("center", "cust/registerok");
			mv.addObject("rcust", obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			mv.addObject("center", "cust/registerfail");
		}
		return mv;
	}
}
