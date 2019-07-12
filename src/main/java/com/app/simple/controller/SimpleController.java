package com.app.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class SimpleController {

	@GetMapping("/hello/{name}")
	public Mono<String> hello(@PathVariable(name = "name") String name) {
		return Mono.just("Hello " + name + ".");
	}
	
}
