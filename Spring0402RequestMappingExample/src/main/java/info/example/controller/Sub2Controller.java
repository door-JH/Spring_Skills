package info.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("sub2")
public class Sub2Controller {
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2() {
		return "sub2/test2";
	}
	
	@RequestMapping(value = "/test3", method = {RequestMethod.GET, RequestMethod.POST})
	public String test3() {
		return "sub2/test3";
	}
}
