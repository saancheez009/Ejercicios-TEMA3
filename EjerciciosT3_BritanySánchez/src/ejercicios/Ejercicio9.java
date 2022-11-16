package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	// Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. El número introducido debe ser mayor que 0.
	
	//Para comprobar si el código es correcto, hemos probado introduciendo el número 8659 y nos ha devuelto el sistema que el número tiene 4 digitos, por lo tanto es correcto.
		public static void main(String[] args) {
			
			
			//Declaramos las variables num y numDigitos
					int num; //Esta variable será el número introducido por el usuario 
					int numDigitos=0; //Esta variable será el número de digitos que tiene el número introducido por el usuario 
					
					//Introducimos e importamos el scanner para poder leer el teclado
					Scanner sc = new Scanner(System.in);
					
					//Le pedimos al usuario que por favor introduzca un número mayor que cero 
					System.out.println("Por favor introduzca un número mayor que 0: ");
					num=sc.nextInt(); //Leemos el número
					
					//Mediante el bucle while declaramos que para que este funcione el número debe ser mayor a 0
				while (num>0) {
				 //Dividimos el número introducido entre 10 para descomponerlo y contar los números totatel que contiene este número
					num =num/10;
					numDigitos++; //Contamos los números que tiene el número introducido
				}
				
				//Le mostramos al usuario la cantidad de números que tiene su número
					System.out.println("El número tiene "+numDigitos+ " dígitos.");
					
					sc.close(); //Cerramos el scanner 
		}

	}


