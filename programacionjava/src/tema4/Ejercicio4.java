package tema4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		float longitud=0;
		float millas=0;
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce la longitud en millas:");
		longitud= escaner.nextFloat();
		millas=longitud*1609;
		System.out.println(longitud+ " millas son "+ millas+ " metros.");

	}

}
