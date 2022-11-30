package com.objetivoscode.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SQLDelete(sql = "UPDATE usuarios SET is_deleted = true WHERE id=?")
@Where(clause = "is_deleted=false")
@Table(name = "usuarios")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String userName;
	private String email;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Rol> roles;
	
	
	private String Nombre;
	private String Apellido;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "usuario")
	private List<Objetivo> objetivos;
	
	@Column(name = "is_deleted")
	private Boolean isDeleted;

}
