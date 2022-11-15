package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un número comprendido enre 0 y 20");
		num = sc.nextInt();
		
		for (int i=1; i<=num;i++ ) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
				System.out.println();
		
		}

	}

}
