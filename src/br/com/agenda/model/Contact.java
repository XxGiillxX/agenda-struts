package br.com.agenda.model;

public class Contact {
	
	private int id;
	private String estado;
	private String cidade;
	private String cep;
	private String telefone;
	private String email;
	
	
	
	public Contact() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", estado=" + estado + ", cidade=" + cidade + ", cep=" + cep + ", telefone="
				+ telefone + ", email=" + email + "]";
	}
	
	
}
