package br.com.agenda.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegistrationAction extends ActionSupport{
	
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void validate() {
		if ("".equals(getUsername())) {	
			addFieldError("Username",getText( "username.required"));}
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println("Executou registration");
		return "success";
	}
	
	

}
