package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	//Para comprobar que el sistema está correcto, hemos introducido:
	// horas = 5    minutos= 59   segundos=59    Y un incremento de 5 segundos
	//Y el sistema nos ha devuelto 6 horas,  0 minutos y 4 segundos
	

	public static void main(String[] args) {
		
		//Declaramos las variables horas minutos, segundos y incremento
		
		int horas, minutos, segundos; //Estas variables son introducidas por el usuario, 
		int incremento = 0; //Esta variable es el incremento de segundos que el usuario desea aumentar
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que por favor introduzca horas minutos y segundos en ese orden
		System.out.println("Por favor introduzca  horas minutos y segundos");
		horas=sc.nextInt();   //Leemos el teclado
		minutos=sc.nextInt();
		segundos=sc.nextInt();
		
		//Luego le pedimos el incremento al usuario para calcular la hora con los segundos aumentados que el usuario haya introducido
		System.out.println("Por favor introduzca el incremento de segundos para calcular la hora con los segundos incrementados");
		incremento=sc.nextInt();
		
		//Mediante el condicional if declaramos que si las horas son mayor a 24 , los minutos mayor a 59 y los segundos mayor a 59, devolveremos ERROR
		if (horas>24 || minutos>59 || segundos>59) 	{
			System.out.println("ERROR: Usted ha introducido valores incorrectos");
			
		}else {  //Si lo dicho anteriormente no se cumple se realizará un for con el incremento de segundos
		for (int i=1; i<=incremento; i++) {
		
		if(segundos==59) {
			segundos=0;
		if (minutos==59) {
			minutos=0;
			if (horas==23) {
				horas=0;
			}else {
				horas++;
			}
		} else {
			minutos++;
		}
		}else {
			segundos++;
		}
		//Se le suma a los segundos, los segundos de incremento introducidos por el usuario y si los segundos llegan a 59 se le suma un minuto a los minutos, en caso de los minutos ser 59, se le suma una hora a las horas
		} 
		System.out.println("Son "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos.");
		}
		//Le mostramos al usuario la hora final con los segundos incrementados
		
		sc.close(); //Cerramos el scanner
	}
}


