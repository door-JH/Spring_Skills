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
	
	@GetMapping("CTtest")
	public String CTtest(@ModelAttribute DataBean bean) {
		bean.setNum(123);
		bean.setId("answlgus06");
		bean.setPw("pws");
		bean.setAddress("add");
		return "test1";
	}
	@PostMapping("CTresult")
	public String CTresult(@ModelAttribute DataBean bean) {
		return "result";
	}
	@GetMapping("FFCTtest")
	public String FFCTtest(@ModelAttribute DataBean bean) {
		bean.setNum(1223);
		bean.setId("boy9768");
		bean.setPw("9768");
		bean.setAddress("goyang");
		return "test2";
	}
	@PostMapping("FFCTresult")
	public String FFCTresult(@ModelAttribute DataBean bean) {
		return "result";
	}
}

