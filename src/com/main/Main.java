package com.main;

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
