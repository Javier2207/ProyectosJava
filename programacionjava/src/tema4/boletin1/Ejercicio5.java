package tema4.boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		float  grados=0;
		float fahrentheit=0;
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce temperatura en ºC: ");
		grados=escaner.nextFloat();
		fahrentheit=(9*grados/5+32);
		System.out.println(grados+ " grados celcius son "+fahrentheit+" grados fahrentheit." );
	}

}
