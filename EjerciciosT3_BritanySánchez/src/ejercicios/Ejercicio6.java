package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	/* Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1 hasta N, uno en cada línea, 
	 * repitiendo cada número tantas veces como su valor. Ejemplo:
	   1
	   22
	   333
	 */

	
	

	//Para comprobar que el código es correcto he introducido el número 5 y el sistema ha devuelto 
		/*  1
			22
			333
			4444
			55555  */
		public static void main(String[] args) {
			//Declaramos la variable num que es el número introducido por el usuario 
			int num;
			
			//Introducimos e importamos el scanner para poder leer el teclado 
			Scanner sc = new Scanner(System.in);
			
			//Le pedimos al usuario que por favor introduzca un número compendido entre 0 y 20
			System.out.println("Por favor introduzca un número comprendido enre 0 y 20");
			num = sc.nextInt(); //Leemos el teclado
			
			//Mediante for declaramos que solo se mostrarán los números hasta el número introducido por el usuario
			for (int i=1; i<=num;i++ ) {
				for(int j=1; j<=i; j++) {
					System.out.print(i); //Mostramos al usuario el triángulo de números repetidos por su número mismo
				}
					System.out.println(); //Para que los números se muestren en forma de triángulo recto se añade un sysoutprintln
			
			}
			sc.close(); //Cerramos el scanner 
		}

	}

