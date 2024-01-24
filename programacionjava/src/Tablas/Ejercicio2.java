package Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Suma de Matrices. Escribe un programa en Java que sume dos matrices. El
		 * usuario debe proporcionar las dimensiones de las matrices y los valores de
		 * los elementos. El programa debe imprimir la matriz resultante.
		 */
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce el número de filas: ");
		int filas = escaner.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int columnas = escaner.nextInt();
		int matriz[][] = new int[filas][columnas];
		int matriz2[][] = new int[filas][columnas];
		int matrizSuma[][] = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("(Matriz 1) Introduce el valor de la fila " + i + ", columna " + j);
				matriz[i][j] = escaner.nextInt();
				System.out.println("(Matriz 2) Introduce el valor de la fila " + i + ", columna " + j);
				matriz2[i][j] = escaner.nextInt();
				matrizSuma[i][j] = matriz[i][j] + matriz2[i][j];
			}
		}
		
		System.out.println("Matrices:");
		for (int x = 0; x < filas; x++) {
		System.out.print(Arrays.toString(matriz[x]));
		
		System.out.print("/");
		
		System.out.print(Arrays.toString(matriz2[x]));
	
		System.out.print("/");
		
		System.out.println(Arrays.toString(matrizSuma[x]));
		}
	}
}