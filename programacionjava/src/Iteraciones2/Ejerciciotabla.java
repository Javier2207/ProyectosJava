package Iteraciones2;

import java.util.Arrays;

public class Ejerciciotabla {

	public static void main(String[] args) {
		
		int tabla[] = new int [7];
		int num=0;
		for(int i=0; i<7;i++) {
			tabla[i]=i*2;
			
		}
		System.out.println(Arrays.toString(tabla));
	}

}
