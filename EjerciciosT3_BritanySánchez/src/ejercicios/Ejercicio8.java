package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	//Para comprobar que el sistema es correcto hemos introducido como mayor el número 5, luego como num2=8 y luego num2=4 el sistema nos devuelve:
	
	/*Por favor introduzca un número mayor que el siguiente que introducirá, cuando desee dejar de introducir números, introduzca un 0
		5
		Por favor introduzca un número
		8
		Por favor introduzca un número
		4
		Fallo es menor
		Hay 1 fallos
		Por favor introduzca un número
		0
		Fallo es menor
		Hay 1 fallos*/

	public static void main(String[] args) {
		int mayor; //Declaramos la variable mayor que será el número desde el que tendrá que introducir los demás números
		int num2=1; //Esta variable es el otro número introducido
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que porfavor introduzca un número 
		System.out.println("Por favor introduzca un número mayor que el siguiente que introducirá, cuando desee dejar de introducir números, introduzca un 0");
		mayor=sc.nextInt(); //Leemos el número
		
		
		//Mediante while declaramos que se detenga la ejecución del sistema si el número dos es igual a 0
		for(int i =1; i>0;i++) {
		while(num2!=0) {
			System.out.println("Por favor introduzca un número"); //Le pedimos al usuario que introduzca otro número este debería ser mayor que el anterior
			num2=sc.nextInt(); //Leemos el número
			if(num2>mayor) { //Si num2 es mayor que el número que ha introducido antes que él, a este se le declara como nuevo número mayor
				mayor=num2;
			}else {
				System.out.println("Fallo es menor"); //Si el usuario introduce otro número menor que el mayor, el sistema le devolverá fallo y deberá introducir un 0 para acabar la ejecución
				System.out.println("Hay "+i+" fallos"); //Le mostramos al usuario el número de fallos totales
			}
		}
		
		}
		}
	
}
