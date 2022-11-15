package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
	        int num;
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Introduzca un número : ");
	       num=sc.nextInt();
	        	
	       for (int i=1;i<=num;i++ ) {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
					System.out.println("1");
			
			}
	    
	        		
	        		    

	}

}
