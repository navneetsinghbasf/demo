package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/demo")
	public String demoMethod(){
		return new String("Hello World!!!");
	}
	
	@GetMapping("/demo-bean")
	public DemoBean demoBean(){
		
		return new DemoBean("Hello World");
	}
	
	@GetMapping("/demo-bean/path-variable/{name}")
	public DemoBean demoBeanPath(@PathVariable String name){
		
		return new DemoBean(String.format("World ,%s",name));
	}
	
}
