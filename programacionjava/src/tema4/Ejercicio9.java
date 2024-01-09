package tema4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		final float PI = 3.141592f;
		float radio=0;

		//Introducir radio del circulo para calcular su radio.
		Scanner escaner = new Scanner(System.in);
		
		System.out.print("Introduce el radio del circulo que quieras averiguar su radio: ");
		radio = escaner.nextFloat();
		float area = PI*(radio*radio);
		
		System.out.println("El área del circulo es de "+area);
		
	}

}
