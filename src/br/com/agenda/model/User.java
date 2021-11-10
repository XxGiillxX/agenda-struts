package br.com.agenda.model;

import java.util.List;

public class User {
	
	
	private String name;
	private String lastName;
	private List<Contact> contact;
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Contact> getContact() {
		return contact;
	}
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", lastName=" + lastName + ", contact=" + contact + "]";
	}
	
	
	
}