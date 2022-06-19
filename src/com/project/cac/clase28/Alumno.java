package com.project.cac.clase28;

public class Alumno extends Persona {

	private int nroLegajo;

	public Alumno(String nombre, String apellido, int edad, String dni, int nroLegajo) {
		super(nombre, apellido, edad, dni);
		this.nroLegajo = nroLegajo;
	}

	public int getNroLegajo() {
		return nroLegajo;
	}

	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}
	
}
