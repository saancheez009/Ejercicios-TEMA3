package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	/*Para dos números dados, a y b, es posible calcular el máximo común divisor (el número más grande que divide a ambos) 
	   mediante un algoritmo ineficiente pero sencillo: desde el menor de a y b,
	   ir buscando, de forma decreciente (-1), el primer número que divide a ambos simultáneamente.
	   Teniendo en cuenta lo que se acaba de explicar, realiza un programa que calcule el máximo común divisor de dos números.
	 */
	
	

	//Para comprobar que el código es correcto he introducido el número 325 y 255 y el sistema me ha devuelto que el máximo común divisor es 5, es correcto.
		public static void main(String[] args) {
			//Declaramos las variables num1 y num2
			int num1; //Estas variables son los números introducidos por el usuario , de los que el sistema mostrará su máximo común divisor
			int num2;
			
			//Introducimos e importamos el scanner para poder leer el teclado
			Scanner sc = new Scanner(System.in);
			
			//Le pedimos al usuario que introduzca los dos números
			System.out.println("Ingrese su primer numero para calcular el máximo común divisor:");
		    num1=sc.nextInt(); //Leemos el número
			System.out.println("Ingrese su segundo número para calcular el máximo común divisor");
		    num2=sc.nextInt(); //Leemos el número
		    
		    //Mediante el condicional while declaramos que solo se realizará el bucle si los números introducidos son distintos
		    while(num1 != num2) {
		         if(num1>num2) { //Si el primer numero es mayor , se le resta al primer número el segundo número para calcular su mcd
		             num1= num1-num2;
		         } else {  //Si lo dicho anteriormente no se cumple, al segundo número introducido se le resta el primer número introducido para calcular el mcd
		                num2= num2 -num1;
		         }
		       }
		    //Le mostramos al usuario el máximo común divisor de los dos números
		    System.out.println("El máximo común divisor  es: "+num1); 
		    
		    sc.close(); //Cerramos el scanner
		}

	}


