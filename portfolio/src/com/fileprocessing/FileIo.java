package com.fileprocessing;

import javax.servlet.http.Part;

public interface FileIo {

	public String deleteProject(String filename);
	public String uploadResume(String filename, Part part);
}
