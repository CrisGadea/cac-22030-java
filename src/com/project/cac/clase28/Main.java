package com.project.cac.clase28;
public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Cristian", "Gadea", 25, "372893579");
		System.out.println("La persona creada se llama: " + persona1.getNombre());
		
		persona1.setNombre("Hernan");
		System.out.println("La persona ahora se llama: " + persona1.getNombre());
		
		Alumno alumno1 = new Alumno("Cristian", "Gadea", 25, "372893579",12);
		System.out.println("El alumno se llama: " + alumno1.getNombre());
		
		Persona persona3;
		Persona persona4;
		
		persona3 = new Alumno("John", "Doe", 25, "372893575",13);
		persona4 = new Profesor("John", "Doe", 25, "372893575",1);
		
	}

}
