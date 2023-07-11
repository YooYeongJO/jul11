package com.poseidon.web;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.
				LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/home") 
	public String home() {
		return "home2";
	}
	
	@RequestMapping("/main") // 주소
	public ModelAndView main() { // model뷰란 박스안에 값을 담아서 보낸다.
		ModelAndView mv = new ModelAndView("main"); // jsp 파일명
		
		// 리스트 list = 10 ~ 100
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 11; i++) {
			list.add(i * 10);
		}
		
		mv.addObject("list", list); 
		// main.jsp에서 mame란 이름으로 홍길동을 실어서 보내기 = 객체 보내기
		return mv; // 나올 페이지 이름
	}
	
}
