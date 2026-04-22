package com.green.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home"; // jsp 파일을 찾는다
	}
	@RequestMapping("/test")
	@ResponseBody  // 서버가 data(html) 를 내려보낸다
	public String test() {
		return "<h2>Test 입니다</h2>";
	}
}
