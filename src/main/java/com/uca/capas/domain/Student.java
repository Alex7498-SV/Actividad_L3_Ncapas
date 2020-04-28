package com.uca.capas.domain;

public class Student {
	
	private String nombre;
	private String apeliido;
	private String fEntrada;
	private String carrera;
	private Boolean  estado;
	
	
	
	public Student(String nombre, String apeliido, String fEntrada, String carrera, Boolean estado) {
		super();
		this.nombre = nombre;
		this.apeliido = apeliido;
		this.fEntrada = fEntrada;
		this.carrera = carrera;
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApeliido() {
		return apeliido;
	}
	public void setApeliido(String apeliido) {
		this.apeliido = apeliido;
	}
	public String getfEntrada() {
		return fEntrada;
	}
	public void setfEntrada(String fEntrada) {
		this.fEntrada = fEntrada;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
}
