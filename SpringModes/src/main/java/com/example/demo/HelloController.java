package com.example.demo;


	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;


	@RestController
	
	@RequestMapping("/api")
	public class HelloController {
	
		@GetMapping("/hello")
		public String display() {
			return "My First spring application";
		}
//		@PostMapping("/hii")
		//public String display1() {
			//return "My First springboot Application";
		//}
		@RequestMapping("/hello1")
		public String sayHi() {
			return "<h1> Hi </h1>";
		
	}

}
