package com.project.cac.clase26;

import java.util.Scanner;

public class Main {
	// Clases y Objetos en Java
	
			// Definir una clase Animal y una clase Coche
			
			// Al crear una nueva clase en Java, estamos creando un nuevo "Tipo de Dato".
			
			

	public static void main(String[] args) {
		//System.out.println("Hola mundo desde Java!");
		
		// *Para crear una variable en Java debemos colocar el tipo de dato
		//int edad = 25;
		
		//if (edad > 18) {
		//	System.out.println("Soy mayor de edad!");
		//} else {
		//	System.out.println("Soy menor de edad");
		//}
		
		
		// Permitimos ingresar a la casa de los Simpsons a los integrantes de la flia.
		// * Para crear una variable debemos darle un nombre descriptivo a la misma
	
		//System.out.println("Por favor, indique quien quiere entrar a la casa de los Simpsons:");
		
		// Pedimos por consola al integrante
		// Creo un Scanner 
		/* Scanner sc = new Scanner(System.in);
		
		String integrante = sc.nextLine();
		
		
		switch (integrante) {
		case "Homero":
			System.out.println("Bienvenido Homero!");
			break;
		case "Marge":
			System.out.println("Bienvenido Marge!");
			break;
		case "Maguie":
			System.out.println("Bienvenida Maguie!");
			break;
		case "Lisa":
			System.out.println("Bienvenida Lisa!");
			break;
		case "Bart":
			System.out.println("Bienvenido Bart!");
			break;

		default:
			System.out.println("No tiene permitida la entrada!");
			break;
		}
		
		
		
		// ---------------------- TABLA DE MULTIPLICAR DIDACTICA CON CMD EN JAVA ---------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero para obtener su tabla:");
		
		int numero = sc.nextInt();
		
		// Creamos un limite por defecto (El nombre de una constante debe ir en MAYUS)
		final int LIMITE = 10;
		
		// Iteramos desde 0 hasta el LIMITE y generamos la tabla del numero
		for (int i = 0; i <= LIMITE; i++) {
			System.out.println(numero + " * " + i + " = " + (numero * i));
		}
		
		*/
		class Animal {
			// Codigo: Definimos las caracteristicas y los comportamientos que deben tener
			// los objetos para poder pertenecer al tipo.
			
			// Caracteristicas o propiedades o atributos
			String raza;
			String nombre;
			int edad;
			String color;
			int cantPatas;
			
			
			// Comportamientos - Metodos (funciones)
			
			// El primer metodo que voy a definir va a ser el de la creacion del obj.
			
			// Constructor: por defecto,
			public Animal() {}
			
			// Sobrecarga de Metodos (Overloading) Constructor
			// Distintos parametros -> Definir los valores iniciales del objeto
			public Animal(String raza, String nombre) {
				this.raza = raza;
				this.nombre = nombre;
			}
			
			public Animal(String race, String nombre, int edad, String color, int cantPatas) {
				raza = race;
				this.nombre = nombre;
				this.edad = edad;
				this.color = color;
				this.cantPatas = cantPatas;
			}
			
			// El metodo constructor es aquel que nos va a permitir darle forma/vida
			// a un objeto nuevo.
		}
		
		// Por fuera de la clase (En el metodo Main)
		// Creamos una instancia particular de la clase => Primer objeto
		final String RAZA = "perro";
		final String NOMBRE = "firulais";
		// Generamos instancias de animales
		Animal animal1 = new Animal(RAZA, NOMBRE);
		Animal animal2 = new Animal(RAZA, "coco", 2, "Blanco", 4);
		
		System.out.println("El animal es de tipo " + animal1.raza + " y su nombre es " + animal1.nombre);
		
	}
	
	

}
