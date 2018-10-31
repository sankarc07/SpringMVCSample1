package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.domain.FileUploader;

@Controller
public class FileUploadController {

	@RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
	public String fileUpload(@ModelAttribute FileUploader file, Model model) {
		if (!file.getMultipartFile().isEmpty()) {
			model.addAttribute("fileName", file.getMultipartFile().getOriginalFilename());
			return "upload-success";
		}
		return "upload-failure";
	}
}
