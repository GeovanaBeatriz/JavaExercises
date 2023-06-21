package com.geovanabeatriz.dscatalogBootcamp.dto;

import com.geovanabeatriz.dscatalogBootcamp.services.validation.UserUpdateValid;

@UserUpdateValid //Faz a verificação se o email já existe, essa anotation foi criada por mim
public class UserUpdateDTO extends UserDTO{

	private static final long serialVersionUID = 1L;
	
	
}
