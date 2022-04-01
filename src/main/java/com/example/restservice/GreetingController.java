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

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;

import com.gatewayhotel.module.gh_check_in.GH_Check_In_Dto;
import com.gatewayhotel.module.gh_check_in.GH_Check_In_Service;
import com.gatewayhotel.module.gh_check_out.GH_Check_Out_Dto;
import com.gatewayhotel.module.gh_check_out.GH_Check_Out_Service;
import com.gatewayhotel.module.gh_customer.GH_Customer_Dto;
import com.gatewayhotel.module.gh_customer.GH_Customer_Service;
import com.gatewayhotel.module.gh_customer_group.GH_Customer_Group_Service;
import com.gatewayhotel.module.gh_rooms.GH_Rooms_Dto;
import com.gatewayhotel.module.gh_rooms.GH_Rooms_Service;

@Configuration
@SpringBootApplication
@RestController
public class GreetingController extends SpringBootServletInitializer {
	@Autowired
	private GH_Rooms_Service roomsService;
	@Autowired
	private GH_Customer_Service customerService;
	@Autowired
	private GH_Check_In_Service checkInService;
	@Autowired
	private GH_Check_Out_Service checkOutService;
	@Autowired
	private GH_Customer_Group_Service customerGroupService;

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
	    return "customPathMobileView";
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

	//start
	@GetMapping("/prototype")
	public String index(Model model, HttpSession session)  {
		try {
			System.out.println("final verify my changes ! : gatewayhotel/module/prototype/index");
			model.addAttribute("allAvailableRooms", roomsService.getAllAvailableRooms());
			return "gatewayhotel/module/prototype/index";
		}catch(Exception e) {
			e.printStackTrace();
			return "gatewayhotel/module/prototype/index";
		}
	}
	
	@GetMapping("/v6")
	public String index6(Model model, HttpSession session)  {
		try {
			model.addAttribute("allAvailableRooms", roomsService.getAllAvailableRooms());
			model.addAttribute("allCustomers", customerService.getAllCustomers());
			model.addAttribute("allCheckIns", checkInService.getAllCheckIns());
			model.addAttribute("allCheckOuts", checkOutService.getAllCheckOuts());
			System.out.println("checkpoint customer group : "+customerGroupService.getAllCustomerGroups()); 
			return "gatewayhotel/module/home/index6";
		}catch(Exception e) { 
			e.printStackTrace();
			return "gatewayhotel/module/home/index6";
		}
		
	}

	@GetMapping(path="/room/search", produces=MediaType.APPLICATION_JSON_VALUE)
  	public ResponseEntity<Object> roomSearch(@ModelAttribute("roomSearchField") String roomSearchField)  {
  		try {
  			System.out.println("checkpoint roomSearch");
  			System.out.println("checkpoint roomSearchField : "+roomSearchField);
  			return new ResponseEntity<Object>(roomsService.searchRooms(roomSearchField), HttpStatus.OK);
  		}catch(Exception e) {
  			e.printStackTrace();
  			return new ResponseEntity<Object>(new java.util.ArrayList<GH_Rooms_Dto>(), HttpStatus.OK);
  		}
  		
  	}
	
	
	
	@GetMapping(path="/customer/search", produces=MediaType.APPLICATION_JSON_VALUE)
  	public ResponseEntity<Object> customerSearch(@ModelAttribute("customerSearchField") String customerSearchField)  {
  		try {
  			System.out.println("checkpoint customerSearch");
  			System.out.println("checkpoint customerSearchField : "+customerSearchField);
  			return new ResponseEntity<Object>(customerService.searchRooms(customerSearchField), HttpStatus.OK);
  		}catch(Exception e) {
  			e.printStackTrace();
  			return new ResponseEntity<Object>(new java.util.ArrayList<GH_Customer_Dto>(), HttpStatus.OK);
  		}
  		
  	}
	
	@GetMapping(path="/checkIn/search", produces=MediaType.APPLICATION_JSON_VALUE)
  	public ResponseEntity<Object> checkInSearch(@ModelAttribute("checkInSearchField") String checkInSearchField)  {
  		try {
  			System.out.println("checkpoint checkInSearch");
  			System.out.println("checkpoint checkInSearchField : "+checkInSearchField);
  			return new ResponseEntity<Object>(checkInService.searchCheckIns(checkInSearchField), HttpStatus.OK);
  		}catch(Exception e) {
  			e.printStackTrace();
  			return new ResponseEntity<Object>(new java.util.ArrayList<GH_Check_In_Dto>(), HttpStatus.OK);
  		}
  		
  	}
	
	@GetMapping(path="/checkOut/search", produces=MediaType.APPLICATION_JSON_VALUE)
  	public ResponseEntity<Object> checkOutSearch(@ModelAttribute("checkOutSearchField") String checkOutSearchField)  {
  		try { 
  			System.out.println("checkpoint checkOutSearch");
  			System.out.println("checkpoint checkOutSearchField : "+checkOutSearchField);
  			return new ResponseEntity<Object>(checkOutService.searchCheckOuts(checkOutSearchField), HttpStatus.OK);
  		}catch(Exception e) {
  			e.printStackTrace();
  			return new ResponseEntity<Object>(new java.util.ArrayList<GH_Check_Out_Dto>(), HttpStatus.OK);
  		}
  		
  	}
	
	@PostMapping(path="/checkIn", produces=MediaType.APPLICATION_JSON_VALUE)
  	public ResponseEntity<Object> checkIn()  {
  		try {
  			return new ResponseEntity<Object>(checkInService.insertNewCheckIn(), HttpStatus.OK);
  		}catch(Exception e) {
  			e.printStackTrace();
  			return new ResponseEntity<Object>(false, HttpStatus.OK);
  		}
  		
  	}
}