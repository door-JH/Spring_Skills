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
	
	@GetMapping("FEtest")
	public String FEtest(DataBean bean, Model model) {
		
		bean.setB1("b1-hidden");
		bean.setB2("b2-text");
		bean.setB3("b3-pw");
		bean.setB4("b4-textarea");
		
		ArrayList<String> data_list1 = new ArrayList<String>();
		data_list1.add("data1");
		data_list1.add("data2");
		data_list1.add("data3");
		model.addAttribute("data_list1", data_list1);
		
		MapBean map_bean1 = new MapBean();
		MapBean map_bean2 = new MapBean();
		MapBean map_bean3 = new MapBean();
		
		map_bean1.setKey("항목1");
		map_bean1.setValue("data1");
		map_bean2.setKey("항목2");
		map_bean2.setValue("data2");
		map_bean3.setKey("항목3");
		map_bean3.setValue("data3");
		
		ArrayList<MapBean> data_list2 = new ArrayList<MapBean>();
		data_list2.add(map_bean1);
		data_list2.add(map_bean2);
		data_list2.add(map_bean3);
		model.addAttribute("data_list2", data_list2);
		
		return "test1";
	}
	
	
	@PostMapping("FEresult")
	public String FEresult(DataBean bean) {
		
		return "result";
	}
	
}

