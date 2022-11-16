package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	/*Realiza un programa que nos diga si un número introducido por teclado es capicúa o no. El número debe ser mayor o igual que 0.*/
	

	//Para comprobar que el código es correcto, hemos introducido por teclado el número 313 y el sistema nos ha devuelto que el número es capicúa.
	//Luego hemos introducido 5 y nos ha devuelto que el número es capicúa. Y al introducir números menores que 10 y mayor o igual a 0 nos dice que el número es capicúa.
	// Finalmente he introducido por teclado el número 56 que no es capicúa y el sistema me ha devuelto que no es ca`picúa.
		
		
		public static void main(String[] args) {
			int num = 0; //Declaramos la variable num, que es el número introducido por el usuario
			 int invert; //Declaramos l variable invert, que será el número introducido por el usuario dado la vuelta
			 int descomposicion = 0;  //Esta variable seá igual a la descomposición del número, si el número es 313, la descomposición será de 3 luego 13 y luego 313, es decir invierte el número
			 int resto; //Declaramos la variable resto que es el resto de la división del número invertido entre 10
			 
			 //Introducimos e importamos el scanner para poder leer el teclado
		        Scanner sc = new Scanner(System.in);
		        
		        
		        do {
		        	//Le pedimos al usuario que por favor introduzca un número mayor o igual que 0 para saber si es capicúa, un número es capicúa cuando al leerlo de derecha a izquierda se lee igual que si lo leemos de izquierda a derecha.
		            System.out.print("Introduce un número mayor o igual a 0 para decirle si es capicúa o no ");                                                 
		            num = sc.nextInt(); //Leemos el número
		            
		            //Creamos un bucle para comprobar que el número puede leerse de igual forma normal y al revés, y damos instrucciones de que solo se realizará si los números introducidos son mayor a 0 o igual a 0
		        } while (num < 0);
		        
		      //le damos la vuelta al número
		        invert = num;
		        while (invert!=0){
		            resto = invert % 10; //Calculamos el resto de la división ddel número invertido entre 10 para descomponer los números
		            descomposicion = descomposicion * 10 + resto; //Con esto se comprueba si el número al revés es igual al número introducido por el usuario
		            invert = invert / 10; //Quitamos la última cifra al número invertido 
		        }
		    
		        //Si el número introducido, es igual a la descomposición/inversión del número el sistema nos devolverá que el número será capicúa
		        if(num == descomposicion ){
		            System.out.println("Es capicua");
		        }else{ //En caso de no cumplir las condiciones el sistema nos devolverá que el número no será capicúa
		            System.out.println("No es capicua");
		        }
		        
		sc.close(); //Cerramos el scanner
		



		

	}

}
