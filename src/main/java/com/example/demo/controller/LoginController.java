package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@GetMapping("login")
	@ResponseBody
	public String login() {
		System.out.println("modify");
		System.out.println("Donhwa Babo");
		System.out.println("add");
		return "Hello";
	}
}
