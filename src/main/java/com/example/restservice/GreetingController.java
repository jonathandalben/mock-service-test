package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@SpringBootApplication
@RestController
public class GreetingController extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(GreetingController.class, args);
		//System.setProperty("javax.net.ssl.trustStore", "C:/Users/benigjo/Downloads/baeldung_public_cert.cer");
	    //System.setProperty("javax.net.ssl.trustStorePassword", "secret");
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(GreetingController.class);
    }
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/index")
	public String showUserList(Model model) {
	    return "index";
	}

	@GetMapping("/customPathMobileView")
	public String customPathMobileView(Model model) {
	    return "/templates/customPathMobileView";
	}
	
	@PostMapping("/v2/common/notification/v1/markets/hkg/messages")
	public String postNotificationV1() {
		return "{\"msgid\":\"acda4616-16bd-43fb-b147-319e31479c8f\",\"status\":\"PUBLISHED\",\"errorcode\":null,\"description\":\"E-mail has been published.\"}";
	}
	
	@PostMapping("/v2/common/notification/v2/PHL/WMT/email")
	public String postNotificationV2() {
		return "{\"msgid\":\"acda4616-16bd-43fb-b147-319e31479c8f\",\"status\":\"PUBLISHED\",\"errorcode\":null,\"description\":\"E-mail has been published.\"}";
	}
	
	@GetMapping("/v2/common/notification/v1/markets/hkg/messages")
	public String getNotificationV1() {
		return "{\"msgid\":\"acda4616-16bd-43fb-b147-319e31479c8f\",\"status\":\"PUBLISHED\",\"errorcode\":null,\"description\":\"E-mail has been published.\"}";
	}
	
	@GetMapping("/v2/common/notification/v2/PHL/WMT/email")
	public String getNotificationV2() {
		return "{\"msgid\":\"acda4616-16bd-43fb-b147-319e31479c8f\",\"status\":\"PUBLISHED\",\"errorcode\":null,\"description\":\"E-mail has been published.\"}";
	}
}