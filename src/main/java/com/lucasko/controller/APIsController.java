package com.lucasko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class APIsController {

	@RequestMapping(value = { "/", "/index"}, method = { RequestMethod.GET })
	@ResponseBody
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	@RequestMapping(value = "/count", method = { RequestMethod.GET })
	public @ResponseBody String count(@RequestParam int num) {
		String st="";
		for(int i=1;i<=num;i++){
			st=st+String.valueOf(i);
		}		
		return st;
	}
	@RequestMapping(value = "/num", method = { RequestMethod.GET })
	public @ResponseBody String count2(@RequestParam String num) {
			
		return num;
	}
}
