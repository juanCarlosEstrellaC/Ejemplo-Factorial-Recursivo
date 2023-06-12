package com.main;

/**
 * @author Lap
 *	1. Clonar "git clone xxx"
 *	2. Hacer "git checkout xxx" a la rama que deseo acceder
 *	3. Crear una nueva rama partiendo desde la que deseo comenzar.
 *	4. Hacer los commits que desee. 
 */
public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("El factorial de " + i + ", es " + factorial(i) + ".");

		}
		
		System.out.println("hola");
		
		System.out.println("bai");
		
		System.out.println("De nuevo");

	} 

	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
