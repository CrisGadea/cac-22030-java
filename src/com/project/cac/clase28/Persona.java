package com.project.cac.clase28;
public class Persona {

	// Caracteristicas - atributos
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String dni;
	
	// Comportamiento
	public Persona(String nombre, String apellido, int edad, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	// Funciones dentro de una clase en Java se llaman Metodos
	public String saludar() {
		return "Hola! Saludo desde el objeto";
	}
	
	// Metodos principales: Getter y Setter
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
