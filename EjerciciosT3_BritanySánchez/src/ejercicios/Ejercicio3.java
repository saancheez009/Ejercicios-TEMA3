package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	/*Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por ejemplo para n=4 debe dibujar lo siguiente:
   *
  * *
 * * *
* * * *           */

	


	/* Para comprobar que el código es correcto he introducido el número 6 y el sistema me ha devuelto   *
																									    ***
																									   *****
																									  *******
																									 *********
																									***********     */
	public static void main(String[] args) {
        int numFilas; //Declaramos la variable numFilas que será el número de filas que tendrá la pirámide, este número es introducido por el usuario
		
        
        //Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		
		//Le pedimos al usuario que por favor introduzca un número de filas 
        System.out.print("Introduzca numero de filas: ");
         numFilas = sc.nextInt(); //Leemos el número 
        
 
      //Mediante for , declaramos la variable altura que será igual a 1 y el bucle solo se realizará hasta el número introducido por el usuario
        for(int altura = 1; altura<=numFilas; altura++){
            //Creamos otro for para los espacios en blanco, donde declaramos la variable blancos
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" "); //Ponemos un sysoutprint vacío que mostrará los espacios en blanco
            }
 
            //Luego creamos otro for para añadir los asteriscos, se delcrara una variable llamada asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*"); //Mediante el sysoutprint añadimos el asterisco que se mostrará en forma de prirámide ya que en el for hemos indicado que los asteriscos deben ir decreciendo en la parte superior de la pirámide
            }
            System.out.println(); //Para que los asteriscos se muestren en forma de pirámide se añade un espacio en blanco
        }
        sc.close(); //Cerramos el scanner
    }
}

