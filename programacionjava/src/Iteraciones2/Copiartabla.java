package Iteraciones2;

import java.util.Arrays;

public class Copiartabla {

	public static void main(String[] args) {
		
		int tabla1 [] = {1,2,3,4};
		int tabla2 [];
		
		tabla2=Arrays.copyOf(tabla1, 4);
		System.out.println(Arrays.toString(tabla2));

	}
	
}
