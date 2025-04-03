package com.bicript.bysafe.dto;

import com.bicript.bysafe.entities.Usuario;

public class UsuarioDTO {

	private Long id;
	private String email;
	private String senha;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public UsuarioDTO(Long id, String email, String senha) {
		super();
		this.id = id;
		this.email = email;
		this.senha = senha;
	}
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		email = entity.getEmail();
		senha = entity.getSenha();
	}
	public UsuarioDTO() {
		
	}
	
	
	
}

