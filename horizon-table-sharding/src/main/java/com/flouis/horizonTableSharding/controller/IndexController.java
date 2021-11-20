package com.flouis.horizonTableSharding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "hello " + name + "~";
	}

}
