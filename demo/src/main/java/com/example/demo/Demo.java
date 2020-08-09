package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Demo{
		@RequestMapping(path= "/")
		@ResponseBody
		public ModelAndView index() {
			ModelAndView mv=new ModelAndView("home");
			return mv;
		}
		
		
		@RequestMapping(path= "/home")
		@ResponseBody
		public ModelAndView home() {
				  ModelAndView mv=new ModelAndView("index");
			      return mv;
		}
	}
