package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appController {
	
	@GetMapping({"/login"})
	public String login() {
		return "login";
	}
	
	@GetMapping({"/registro"})
	public String registro() {
		return "registro";
	}
	
	@GetMapping({"/inicio"})
	public String inicio() {
		return "inicio";
	}
}
