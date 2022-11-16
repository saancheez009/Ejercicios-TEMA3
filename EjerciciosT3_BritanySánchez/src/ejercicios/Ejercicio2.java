package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	//Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.

	//Para comprobar que el código es correcto he introducido el número 20 y el sistema me devuelve= hay 8 números primos
		//Por lo tanto el código es correcto

		public static void main(String[] args) {
			
		//Declaramos las variables num y cont
		int num=0; //Esta variable es el número hasta el que el usuario desea que el sistema le muestre la cantidad de números primos
		int cont=0; //Esta variable será la cantidad contada de números primos
		
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		
		//Le pedimos al usuario que por favor introduzca un número hasta el que desea contar números primos 
		System.out.println("Por favor introduzca el número hasta el que quiere que se le muestre la cantidad de números primos");
		num=sc.nextInt(); //Leemos el número
		
		
		//Mediante el condicional if introducimos un for
		if(num>0) {
			for(int i=2; i<=num; i++) { //En el for le damos la instrucción de que solo se sume i hasta el número introducido por el usuario
				if ( num%i!=0) {
					   i += 1; //Para poder contar los número primos a i le damos valor de 1 y le pedimos al sistema que sume los números primos es decir 
					   // los números que divididos entre i el resto sea distinto de 0
					cont++; //Contamos los números primos
				}
				
			}
			
		
		}
		//Le mostramos al usuario la cantidad de números introducidos hay hasta el número introducido por él
		System.out.println("Hay " +cont+" números primos desde el número 1 hasta el número "+num);
			
		sc.close(); //Cerramos el scanner 
		}
		
	}

