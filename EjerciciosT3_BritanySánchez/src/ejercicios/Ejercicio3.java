package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numFilas;
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Introduzca numero de filas: ");
         numFilas = sc.nextInt();
        
 
        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
		
		
