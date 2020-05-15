package com.demo.bluemine.controller;


import com.demo.bluemine.service.RootService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {

	@Resource(name = "com.demo.bluemine.service")
	RootService service;

	@RequestMapping(value="/", method= {RequestMethod.POST,RequestMethod.GET})
	public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
		String test = service.test();
		model.addAttribute("test",test);
		return "index";
	}

}
