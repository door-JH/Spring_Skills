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

import info.example.beans.DataBean;


@Controller
public class TestController {
	
	@GetMapping("GRPDStest")
	public String GRPDStest(@RequestParam Map<String, String> map,
							@RequestParam List<String> data3) {
		
		String data1 = map.get("data1");
		String data2 = map.get("data2");
			
		System.out.println("data1:" + data1);
		System.out.println("data2:" + data2);
		
		for(String str : data3) {
			System.out.println("str:" + str);
		}
		
		return "result";
	}
	@PostMapping("PRPDStest")
	public String PRPDStest(@RequestParam Map<String, String> map,
							@RequestParam List<String> data3) {
		
		String data1 = map.get("data1");
		String data2 = map.get("data2");
			
		System.out.println("data1:" + data1);
		System.out.println("data2:" + data2);
		
		for(String str : data3) {
			System.out.println("str:" + str);
		}
		
		return "result";
	}
	
	@GetMapping("GMAtest")
	public String GMAtest(DataBean bean) {
		
		System.out.println("data1:" + bean.getData1());
		System.out.println("data2:" + bean.getData2());
		
		for(String str : bean.getData3()) {
			System.out.println("data3:" + str);
		}
		
		return "result";
	}
	
	@PostMapping("PMAtest")
	public String PMAtest(DataBean bean) {
		
		System.out.println("data1:" + bean.getData1());
		System.out.println("data2:" + bean.getData2());
		
		for(String str : bean.getData3()) {
			System.out.println("data3:" + str);
		}
		
		return "result";
	}
}


















