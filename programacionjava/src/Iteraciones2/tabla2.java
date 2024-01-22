package Iteraciones2;

import java.util.Scanner;

public class tabla2 {

	public static void main(String[] args) {
		
		int tabla[]= {3,7,12,18,22};
		boolean encontrado = false;
		Scanner escaner=new Scanner(System.in);
		
		System.out.println("Introduzca numero que desea encontrar:");
		int numero=escaner.nextInt();
		
	for(int i=0; i<tabla.length && !encontrado; i++) {
		if(numero==tabla[i])
			System.out.println(i);
		
		
			}
			
		
	}

}
