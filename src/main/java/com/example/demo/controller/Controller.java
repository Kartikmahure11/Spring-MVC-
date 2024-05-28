package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;

@org.springframework.stereotype.Controller
public class Controller
{
	@RequestMapping("/demo1")
	String fun()
	{
		return "page.html";
	}
	
	
	@RequestMapping("/demo2")
	String fun1(Model m)
	{
		String msg="Hello World";
		m.addAttribute("mymsg",msg);
		
		return "page2.html";
	}
	
	

	@RequestMapping("/demo3")
	String fun2(Model m)
	{
		Student s=new Student(101,"kartik","Raulgaon","pass");
		m.addAttribute("obj",s);
		 
		
		return "page3.html";
	}
	
	@RequestMapping("/demo4")
	ModelAndView fun3()
	{
		
		ModelAndView mv= new ModelAndView("page3.html");
		Student s=new Student(102,"Yash","Nagpur","Fail");
		mv.addObject("obj1",s);
		
		return mv;
	}
	
	

}
