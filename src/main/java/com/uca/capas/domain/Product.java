package com.uca.capas.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
	
	@Digits(integer=12, fraction=0, message = "Se esperaba numeros enteros de 12 digitos!")
	private String codigo;
	@Size(min=1, max=100)
	private String nombre;
	@Size(min=1, max=100)
	private String marca;
	@Size(min=1, max=500)
	private String descripcion;
	@Digits(integer=10, fraction=0, message = "Se esperaba numeros enteros!")
	private String existencias;
	@Pattern(regexp = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))", message = "La fecha tiene un formato incorrecto!")
	private String fechaIngreso;
	
	public Product() {
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getExistencias() {
		return existencias;
	}
	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
	
}
