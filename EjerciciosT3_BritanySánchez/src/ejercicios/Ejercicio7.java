package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	/*Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:
	1
	121
	12321
	1234321*/
	
	
	//Para comprobar que el código es correcto hemos introducido el número 4 y el sistema nos ha devuelto Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:
	/*  1
		121
		12321
		1234321
		   */


	public static void main(String[] args) {
		
		//Declaramos la variable num que será el número hasta el que se mostrarán los números
	    int num = 0; 
	    int altura = 1; //Esta variable es la altura del triángulo recto 
	    
        
	    //Introducimos e importamos el scanner para poder leer el teclado
        Scanner sc = new Scanner(System.in);
        
        
        //Le pedimos al usuario que introduzca un número
        System.out.print("Introduzca un número : ");
       num=sc.nextInt(); //Leemos el número
        
       //Mediante while declaramos que el bucle solo se realizará cuando la altura sea menor o igual al número introducido
       while (altura <= num) {
         
         // Introducimos un for en el que solo mostrará los números hasta la altura que es igual al número introducido
         for (int i = 1; i < altura; i++) {
           System.out.print(i); //Mostramos los números introducidos desde el 1 al número introducido por el usuario en una línea
         }
         
         for (int i = altura; i > 0; i--) { //Creamos otro for para mostrar los números desde el número introducido por el usuario hasta el 1  por ello i--
           System.out.print(i); //Mostramos los números desde el número introducido que es la altura hasta el 1
         }
         
         System.out.println(); //Para que los números se muestren en forma de triángulo recto añadimos un sysoutprintln
         
         altura++; //Esto es necesario para que se muestren los números y evitamos un bucle infinito
         
       } 
       sc.close(); //Cerramos el scanner
     }
   }
     
