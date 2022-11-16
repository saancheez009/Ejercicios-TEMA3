package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	/*De forma similar a la actividad 4, realiza un programa que calcule el mínimo común múltiplo de dos números dados. 
	  En este caso, habrá que partir del máximo de los dos e ir incrementando hasta encontrar el primer número que sea múltiplo de los dos números.
	 */
	
	

	//Para comprobnar que el código es correcto he introducido 50 como num1 y 20 como num 2 y el sistema me ha devuelto que el mcm es 100, por tanto es correcto
		public static void main(String[] args) {
			//Declaramos las variables num1, num2, mcm e i:
		       int num1=1; //Esta variable es el primer número introducido por el usuario
		       int num2; //Esta variable es el segundo número introducido por el usuario
		       int mcm = 1; //Esta variable es el cálculo del mínimo común múltiplo
		       int i=2;   //Esta es una variable que vale dos, se utiliza para el cálculo del mcm
		       
		       //Introducimos e importamos el scanner para poder leer el teclado
		   	Scanner sc = new Scanner(System.in);
		   	
		   	//Le pedimos al usuario que introduzca dos números para poder calcular el mínimo común múltiplo
		        System.out.println("Ingrese un primer numero para el cálculo del mínimo común múltiplo:");
		        num1=sc.nextInt();
		        System.out.println("Ingrese un segundo numero para el cálculo del mínimo común múltiplo:");
		        num2=sc.nextInt();
		      
		        
		        //Mediante el bucle while declaramos que los números introducidos deben ser mayor o igual a 2
		        while(i <= num1 || i <= num2)
		        { 
		            if(num1%i==0 || num2%i==0) //si el resto de la división del num1 entre i es igual a 0 y lo mismo con num2 , el mcm es igual a el mismo por i
		            {
		            mcm=mcm*i;
		            if(num1%i==0) num1=num1/i; //Si el resto de num1 entre i es 0, se divide num1 entre i
		            if(num2%i==0) num2=num2/i; //Si el resto de num2 entre i es 0, se divide num2 entre i
		            }
		            else //Si todo lo mencionado anteriormente no se cumple se realiza la suma de i + 1
		                i=i+1;               
		        }                        
		        System.out.println("El mínimo común múltiplo es :" +mcm); 
		        sc.close(); //Cerramos el scanner
		}

	}


