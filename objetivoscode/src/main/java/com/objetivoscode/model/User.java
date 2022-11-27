package com.objetivoscode.model;

import java.util.List;
import java.util.Set;

public class User {
	
	
	private Long id;
	
	
	private String userName;
	private String email;
	private String password;
	private Set<Rol> roles;
	
	
	private String Nombre;
	private String Apellido;
	
	
	private List<Objetivo> objetivos;
	
	private Boolean isDelete;

}
