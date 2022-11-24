package info.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	
	@GetMapping("Gtest1")
	public String test1_GET() {
		return "test1";
	}
	
	@PostMapping("Ptest1")
	public String test1_POST() {
		return "test1";
	}
	
	@GetMapping("GHSRtest")
	public String GHSRtest(HttpServletRequest req) {
		String data1 = req.getParameter("data1");
		
		System.out.println("data1: " + data1);
		return "result";
	}
	
	@PostMapping("PHSRtest")
	public String PHSRtest(HttpServletRequest req) {
		String data1 = req.getParameter("data1");
		
		System.out.println("data1: " + data1);
		return "result";
	}
	
	@GetMapping("GPVtest/{data1}/{data2}/{data3}")
	public String GPVtest(@PathVariable int data1,
						  @PathVariable int data2,
						  @PathVariable int data3) {
		
		System.out.println("data1:" + data1);
		System.out.println("data2:" + data2);
		System.out.println("data3:" + data3);
		return "result";
	}
	
	@PostMapping("PPVtest/{data1}/{data2}/{data3}")
	public String PPVtest(@PathVariable int data1,
						  @PathVariable int data2,
						  @PathVariable int data3) {
		
		System.out.println("data1:" + data1);
		System.out.println("data2:" + data2);
		System.out.println("data3:" + data3);
		return "result";
	}
	
	@GetMapping("GRPtest")
	public String GRPtest(@RequestParam int data1,
						  @RequestParam int data2,
						  @RequestParam String [] data3) {
		
		System.out.println("data1:" + data1);
		System.out.println("data2:" + data2);
		
		for(String str : data3) {
			System.out.println("data3:" +str);
		}
		
		return "result";
	}
	@PostMapping("PRPtest")
	public String PRPtest(@RequestParam int data1,
			  			  @RequestParam int data2,
			  			  @RequestParam String [] data3) {
		System.out.println("data1:" + data1);
		System.out.println("data2:" + data2);
		
		for(String str : data3) {
			System.out.println("data3:" +str);
		}
		
		return "result";
	}
	
	@GetMapping("GRPOPtest")
	public String GRPOPtest(@RequestParam (value = "value1") int data1,
							@RequestParam (required = false) String data2,
							@RequestParam (defaultValue = "0") int data3) {
		System.out.println("data1:" + data1);
		System.out.println("data2:" + data2);
		System.out.println("data3:" + data3);
		
		return "result";
	}
	@PostMapping("PRPOPtest")
	public String PRPOP(@RequestParam (value = "value1") int data1,
						@RequestParam (required = false) String data2,
						@RequestParam (defaultValue = "0") int data3) {
		
		System.out.println("data1:" + data1);
		System.out.println("data2:" + data2);
		System.out.println("data3:" + data3);
		
		return "result";
	}
	
}















