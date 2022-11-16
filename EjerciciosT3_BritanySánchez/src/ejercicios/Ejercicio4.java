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
			
			//Estas otras dos variables están dentro del for
			 int i; //La i la declaramos fuera del for para luego poder mostrarla dentro del if
			 int menor; //Esta variable la utilizaremos para un operador ternario y saber cual de los dos números es menor
			
			//Introducimos e importamos el scanner para poder leer el teclado
			Scanner sc = new Scanner(System.in);
			
			//Le pedimos al usuario que introduzca los dos números
			System.out.println("Ingrese su primer numero para calcular el máximo común divisor:");
		    num1=sc.nextInt(); //Leemos el número
			System.out.println("Ingrese su segundo número para calcular el máximo común divisor");
		    num2=sc.nextInt(); //Leemos el número
		    
		   //Hacemos un operador ternario para saber que número es el menor 
		    menor=num1<num2?num1:num2;
		    
		    //Introducimos un for en el que a i le damos el valor del número menor
		    for ( i=menor;i>0;i--) {
		    	if(num1%i==0 && num2%i==0) {   //Si el resto de la división de cada número introducido entre el número menor es 0 i es el máximo común divisor
		    		System.out.println("El máximo común divisor es "+i);
		    		break;  //Para que solo nos muestre el máximo común divisor ponemos un break
		    	}
		    }
		    
		    
		    sc.close(); //Cerramos el scanner
		}

	}


