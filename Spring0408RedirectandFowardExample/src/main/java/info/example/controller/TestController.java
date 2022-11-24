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

import info.example.beans.DataBean;
import info.example.beans.MapBean;


@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1() {
		return "redirect:/sub1";
	}
	
	
	@GetMapping("/sub1")
	public String sub1() {
		return "sub1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "forward:/sub2";
	}
	
	
	@GetMapping("/sub2")
	public String sub2() {
		return "sub2";
	}
}

