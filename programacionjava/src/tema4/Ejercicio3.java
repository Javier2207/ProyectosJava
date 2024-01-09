package tema4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		float numero1=0;
		float numero2=0;
		float resultado=0;
		System.out.println("Introduzca primer numero: ");
		Scanner escaner = new Scanner(System.in);
		numero1 = escaner.nextFloat();
		System.out.println("Introduzca segundo numero: ");
		numero2 = escaner.nextFloat();
		resultado=(numero1+numero2)/2;
		System.out.println("Resultado:"+resultado);

	}

}
