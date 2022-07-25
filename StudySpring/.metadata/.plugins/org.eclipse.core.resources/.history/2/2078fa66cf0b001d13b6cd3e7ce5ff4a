package com.hanul.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/second")
	public ModelAndView view() {
		ModelAndView model = new ModelAndView();
		String now = new SimpleDateFormat("hh시 mm분 ss초").format(new Date());
		model.addObject("now", now);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/first")
	public String view(Model model) {
		//화면에 출력할 데이터는
		//Dynamic Web Project: HttpServletRequest request 에 attribute 로 데이터를 담는다
		//						setAttribute("이름", 데이터)
		//Spring: Model 에 attribute 로 데이터를 담는다
		//					addAttribute("이름", 데이터)
		String today = new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
		model.addAttribute("today", today);
		return "index";
	}
}
