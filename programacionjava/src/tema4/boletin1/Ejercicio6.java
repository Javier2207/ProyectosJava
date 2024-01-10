package tema4.boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		float nota1=0;
		float nota2=0;
		float nota3=0;
		float nota4=0;
		float mediaNota=0;
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce primera nota:");
		nota1=escaner.nextFloat();
		System.out.println("Introduce segunda nota:");
		nota2=escaner.nextFloat();
		System.out.println("Introduce tercera nota:");
		nota3=escaner.nextFloat();
		System.out.println("Introduce cuarta nota:");
		nota4=escaner.nextFloat();
		mediaNota=(nota1+nota2+nota3+nota4)/4;
		int parteEnteraMedia = (int) mediaNota;
		System.out.println("La parte entera es: "+parteEnteraMedia);

	}

}
