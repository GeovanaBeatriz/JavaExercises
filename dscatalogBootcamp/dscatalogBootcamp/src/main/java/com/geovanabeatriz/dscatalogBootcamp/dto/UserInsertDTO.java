package com.geovanabeatriz.dscatalogBootcamp.dto;

import com.geovanabeatriz.dscatalogBootcamp.services.validation.UserInsertValid;

@UserInsertValid //Faz a verificação se o email já existe, essa anotation foi criada por mim
public class UserInsertDTO extends UserDTO{

	private static final long serialVersionUID = 1L;
	
	private String password;
	
	public UserInsertDTO() {
		super();
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
