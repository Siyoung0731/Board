package com.green.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "<h2>Test 입니다</h2>";
	}
}
