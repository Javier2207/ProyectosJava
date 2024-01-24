package Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce filas: ");
		int filas=input.nextInt();
		
		System.out.println("Introduce columnas:");
		int columnas=input.nextInt();
		
		int tabla[] []= new int[filas] [columnas];
		
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				tabla[i][j]=i+j;
				
				
			}	
		}
		for(int i=0; i<filas; i++) {
		System.out.println(Arrays.toString(tabla[i]));
		}
	}

}
