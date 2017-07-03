package com.mavenspringmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
String message="Hello World MVC";
//controller will return a modelandview object that will be processed by viewresolver to display view
//@RequestMapping annotation maps web requests onto specific handler classes and/or handler methods, in this case, showMessage().
//RequestParam indicates that a method parameter should be bound to a web request parameter. In this case, we also make it not required and give it a default value.//
@RequestMapping("/hello")
public ModelAndView showMessage(@RequestParam(value="name",required=false,defaultValue="world") String name)
{
	System.out.println("in controller");
	//new ModelAndView("helloworld") determines that helloworld is the target view.
	ModelAndView mv=new ModelAndView("helloworld");
	mv.addObject("message",message);
	mv.addObject("name", name);
	return mv;
}

}
