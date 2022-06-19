package com.project.cac.clase28;

public class Profesor extends Persona{

	protected int idProfesor;

	public Profesor(String nombre, String apellido, int edad, String dni, int idProfesor) {
		super(nombre, apellido, edad, dni);
		this.idProfesor = idProfesor;
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	
	
}
