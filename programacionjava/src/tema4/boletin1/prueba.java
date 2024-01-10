package tema4.boletin1;

import java.util.Random;
import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int numeroAleatorio = rand.nextInt(100);
		int numeroAdivinar = 0;
		Scanner escaner = new Scanner(System.in);
		
		
		while(numeroAleatorio!=numeroAdivinar )
        System.out.println("Ingrese numero para adivinar");
		numeroAdivinar = escaner.nextInt();
		
	}

}
