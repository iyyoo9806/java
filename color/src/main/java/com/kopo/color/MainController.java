package com.kopo.color;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value ="/")
	public String color() {
		return "index";
	}
	
	@GetMapping("histories")
	public String histories() {
		return "histories";
	}
}
