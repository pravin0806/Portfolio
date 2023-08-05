package com.dao;

import java.util.ArrayList;

import com.model.EducationPojo;
import com.model.MessagePojo;
import com.model.ProjectPojo;
import com.model.ReadCredentialPojo;
public interface ReadDao {

	public ArrayList<MessagePojo>readMessage();
	public String readAdminLogin(String username,String password);
	public ReadCredentialPojo readCreadential();
	public ArrayList<ProjectPojo>readProject();
	public ArrayList<EducationPojo>readEdcation();

}
