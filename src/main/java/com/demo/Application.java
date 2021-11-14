package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication(scanBasePackages="com.demo")
public class Application {

	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).run(args);
	}
}