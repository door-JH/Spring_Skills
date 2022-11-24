package info.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
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
import info.example.beans.DataBean2;
import info.example.beans.DataBean3;
import info.example.beans.DataBean4;


@Controller
public class TestController {
	
	@Autowired
	DataBean1 requestBean1;
	@GetMapping("/test1")
	public String test1() {
		requestBean1.setData1("문자열1");
		requestBean1.setData2("문자열2");
		return "forward:/result1";
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		System.out.printf("requestBean1.data1: %s\n", requestBean1.getData1());
		System.out.printf("requestBean1.data2: %s\n", requestBean1.getData2());
		model.addAttribute("requestBean1", requestBean1);
		return "result1";
	}
	
	@Resource(name = "requestBean2")
	DataBean2 requestBean2;
	@GetMapping("/test2")
	public String test2() {
		requestBean2.setData3("문자열3");
		requestBean2.setData4("문자열4");
		return "forward:/result2";
	}
	
	@GetMapping("/result2")
	public String result2(Model model) {
		System.out.printf("requestBean2.data3: %s\n", requestBean2.getData3());
		System.out.printf("requestBean2.data4: %s\n", requestBean2.getData4());
		model.addAttribute("requestBean2", requestBean2);
		return "result2";
	}
	
	
	@Autowired
	DataBean3 requestBean3;
	@GetMapping("/test3")
	public String test3() {
		requestBean3.setData5("문자열5");
		requestBean3.setData6("문자열6");
		return "forward:/result3";
	}
	
	@GetMapping("/result3")
	public String result3(Model model) {
		System.out.printf("requestBean3.data5: %s\n", requestBean3.getData5());
		System.out.printf("requestBean3.data6: %s\n", requestBean3.getData6());
		model.addAttribute("requestBean3", requestBean3);
		return "result3";
	}
	
	
	
	@Resource(name = "requestBean4")
	DataBean4 requestBean4;
	@GetMapping("/test4")
	public String test4() {
		requestBean4.setData7("문자열7");
		requestBean4.setData8("문자열8");
		return "forward:/result4";
	}
	
	@GetMapping("/result4")
	public String result4(Model model) {
		System.out.printf("requestBean4.data7: %s\n", requestBean4.getData7());
		System.out.printf("requestBean4.data8: %s\n", requestBean4.getData8());
		model.addAttribute("requestBean4", requestBean4);
		return "result4";
	}
}

