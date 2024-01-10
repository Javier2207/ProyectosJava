package tema4.boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		System.out.println("introduce un numero entero: ");
		int numero = escaner.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.println("El numero es par y mayor que 0.");
		}
		else if(numero % 2 !=0) {
			System.out.println("El numero es impar.");
		}
		else if(numero < 0) {
			System.out.println("El numero es menor que cero.");
		}
			
		
		
	}

}
