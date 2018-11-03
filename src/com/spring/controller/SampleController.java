package com.spring.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.domain.DineInForm;
import com.spring.domain.FileUploader;
import com.spring.validator.DineInFormValidator;

@Controller
public class SampleController {

	private static final Logger logger = Logger.getLogger(SampleController.class);

	@Autowired
	DineInFormValidator dineInFormValidator;

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "test mvc xml";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String testJsp() {
		return "index";
	}

//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//		dateFormat.setLenient(true);
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//	}

	private List<String> restaurantList() {
		List<String> restaurantList = new ArrayList<String>();
		restaurantList.add("BBQ");
		restaurantList.add("FARUZI");
		restaurantList.add("BBQ NATION");
		restaurantList.add("BHUHARI");
		return restaurantList;
	}

	private List<String> timeList() {
		List<String> timeList = new ArrayList<String>();
		timeList.add("12PM");
		timeList.add("1PM");
		timeList.add("8PM");
		timeList.add("9PM");
		return timeList;
	}

	@RequestMapping(value = "/dineInPage", method = RequestMethod.GET)
	public String dineInPage(Model model) {
		//logs debug message
		if(logger.isDebugEnabled()){
			logger.debug("dineInPage is executed!");
		}
		model.addAttribute("dineInForm", new DineInForm());
		model.addAttribute("restaurantList", restaurantList());
		model.addAttribute("timeList", timeList());
		//logs exception
		logger.error("This is Error message", new Exception("Testing"));
		return "dineInForm";
	}

	@RequestMapping(value = "/reserve", method = RequestMethod.POST)
	public String reserve(Model model, @ModelAttribute DineInForm dineInForm, BindingResult error) {
		//logs debug message
		if(logger.isDebugEnabled()){
			logger.debug("reserve is executed!");
		}
		dineInFormValidator.validate(dineInForm, error);
		if (error.hasErrors()) {
			model.addAttribute("restaurantList", restaurantList());
			model.addAttribute("timeList", timeList());
			return "dineInForm";
		}
		model.addAttribute("dineInForm", dineInForm);
		model.addAttribute("fileUploader", new FileUploader());
		//logs exception
		logger.error("This is Error message", new Exception("Testing"));
		return "dineInSuccess";
	}
}
