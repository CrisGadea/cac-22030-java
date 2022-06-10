package com.project.cac.clase26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hola mundo desde Java!");
		
		// Para crear una variable en Java debemos colocar el tipo de dato
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
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero para obtener su tabla:");
		
		int numero = sc.nextInt();
		
		// Creamos un limite por defecto (El nombre de una constante debe ir en MAYUS)
		final int LIMITE = 10;
		
		// Iteramos desde 0 hasta el LIMITE y generamos la tabla del numero
		for (int i = 0; i <= LIMITE; i++) {
			System.out.println(numero + " * " + i + " = " + (numero * i));
		}
		
		
		
	}

}
