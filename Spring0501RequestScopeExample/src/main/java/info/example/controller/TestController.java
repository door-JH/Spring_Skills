package info.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
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
import org.springframework.web.servlet.ModelAndView;

import info.example.beans.DataBean1;


@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		
		request.setAttribute("data1", "문자열1");		
		
		return "forward:/result1";
	}
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		String data1 = (String) request.getAttribute("data1");
		System.out.printf("data1: %s\n",data1);
		
		return "result1";
	}
//	
	@GetMapping("/test2")
	public String test2(Model model) {
		
		model.addAttribute("data2","문자열2");
		
		return "forward:/result2";
	}
	
	@GetMapping("/result2")
	public String result2(Model model) {
		
		String data2 = (String) model.getAttribute("data2");
		System.out.printf("data2: %s\n", data2);
		
		return "result1";
	}
//	
	@GetMapping("/test3")
	public String test3(Model model) {
		
		DataBean1 bean1 = new DataBean1();
		bean1.setData1("문자열3");
		bean1.setData2("문자열4");
		model.addAttribute("bean1", bean1);
		
		return "forward:/result3";
	}
	
	@GetMapping("/result3")
	public String result3(HttpServletRequest request) {
		
		DataBean1 bean1 = (DataBean1) request.getAttribute("bean1");
		System.out.printf("bean1.data1: %s\n", bean1.getData1());
		System.out.printf("bean1.data2: %s\n", bean1.getData2());
		return "result3";
	}
//
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		mv.addObject("data4", "문자열4");
		mv.setViewName("forward:/result4");
		
		return mv;
	}
	
	@GetMapping("/result4")
	public String result4(HttpServletRequest request) {
		String data4 = (String) request.getAttribute("data4");
		System.out.printf("data4: %s\n",data4);
		
		return "result4";
	}
//
	@GetMapping("/test5")
	public String test5(@ModelAttribute("bean1") DataBean1 bean1) {
		
		bean1.setData1("문자열6");
		bean1.setData2("문자열7");
		
		return "forward:/result5";
	}
	
	@GetMapping("/result5")
	public String result5(HttpServletRequest request) {
		
		DataBean1 bean1 = (DataBean1) request.getAttribute("bean1");
		System.out.printf("bean1.data1: %s\n", bean1.getData1());
		System.out.printf("bean1.data2: %s\n", bean1.getData2());
		
		return "result5";
	}
}

