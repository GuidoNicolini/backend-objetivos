package com.objetivoscode.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@SQLDelete(sql = "UPDATE objetivos SET is_deleted = true WHERE id=?")
@Where(clause = "is_deleted=false")
@Table(name = "objetivos")
public class Objetivo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String imagen;
	private Calendar fechaInicio;
	private Calendar fechaFinal;
	private String descripcion;
	private Boolean isCumplido;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "objetivo")
	private List<Nota> notas;
	
	@Column(name = "is_deleted")
	private Boolean isDeleted;
	
	
	@ManyToOne()
	private User user;

}
