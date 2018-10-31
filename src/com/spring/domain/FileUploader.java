package com.spring.domain;

import org.springframework.web.multipart.MultipartFile;

public class FileUploader {

	private MultipartFile multipartFile;

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}

}
