package com.diegonunez.ipoo.repuestos2.datos.cliente;

import java.util.Date;

public class Marca {
	private int id;
	private String nombre;
	private String description;
	
	//contructor 1
	public Marca(){
	}
     //constructor 2
	public Marca(int id, String nombre, String description) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
