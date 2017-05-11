package com.diegonunez.ipoo.repuestos2.datos.cliente;

public class Producto {
	private int id;
	private String nombre;
	private String description;
	private Byte imagen;
	private Double precio;
	
	//constructor 1
	public Producto(){
	}
	
	//constructor 2	
	public Producto(int id, String nombre, String description, Byte imagen, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.description = description;
		this.imagen = imagen;
		this.precio = precio;
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
	public Byte getImagen() {
		return imagen;
	}
	public void setImagen(Byte imagen) {
		this.imagen = imagen;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
