package com.diegonunez.ipoo.repuestos2.datos.cliente;
//Clase en vez de Storage
public class Modelo {
	
	public int id;
	public String nombre;
	public String decription;
	
	public Modelo(){
	}

	public Modelo(int id, String nombre, String decription) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.decription = decription;
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

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}
	
	

}
