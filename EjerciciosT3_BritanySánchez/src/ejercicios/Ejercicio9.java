package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. El número introducido debe ser mayor que 0.
		int num;
		int numDigitos=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Por favor introduzca un número mayor que 0: ");
		num=sc.nextInt();
		
	while (num>0) {
	 
		num =num/10;
		numDigitos++;
	}
		System.out.println("El número tiene "+numDigitos+ " dígitos.");
		
	
	        }
	}