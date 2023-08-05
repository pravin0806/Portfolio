package com.validation;

import javax.servlet.http.Part;

public class ProjectValidation {

	private String result;
	public String validate(Part part) {
		// TODO Auto-generated method stub
		String contentType = part.getContentType();
		System.out.println(contentType);

		long size = part.getSize();
		System.out.println(size);

		if (!contentType.endsWith("jpeg")) {
			result = "Invalid File Format";
		} else if (size >= 1048576) {
			result = "Image Size Exceeded";
		} else {
			result = "valid";
		}
		return result;

	}
}
