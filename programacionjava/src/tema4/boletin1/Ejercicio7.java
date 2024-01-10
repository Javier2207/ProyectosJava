package tema4.boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		float base=0;
		float altura=0;
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Introduce la base del triangulo: ");
		base = escaner.nextFloat();
		System.out.println("Introduce la altura del triangulo: ");
		altura=escaner.nextFloat();
		
		//Operacion para calcular area.
		float area = base*altura/2;
		System.out.println("El area del triangulo es de "+area);
	}

}
