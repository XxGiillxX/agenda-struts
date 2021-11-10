package br.com.agenda.action;

import com.opensymphony.xwork2.ActionSupport;

public class ContatosAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("Executou contatos");
		return "success";
	}

}
