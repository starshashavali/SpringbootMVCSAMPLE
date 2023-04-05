package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	@GetMapping("/Welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView m= new ModelAndView();
		m.addObject("msg","Hi,Welcome to Ashokit");
		m.setViewName("message");
		return m;
	}
	@GetMapping("/greed")
	public ModelAndView getGreedMsg() {
		ModelAndView m= new ModelAndView();
		m.addObject("msg","Good evening... ");
		m.setViewName("message");
		return m;
	}

}
