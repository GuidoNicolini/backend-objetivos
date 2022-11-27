package com.objetivoscode.model;

import java.util.Calendar;
import java.util.List;

public class Objetivo {

	
	private Long id;
	private String nombre;
	private String imagen;
	private Calendar fechaInicio;
	private Calendar fechaFinal;
	private String descripcion;
	private Boolean isCumplido;
	private List<Nota> notas;
	private Boolean isDelete;

}
