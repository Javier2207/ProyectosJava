package Iteraciones2;

public class Comparartablas {

	public static void main(String[] args) {
		
		int tabla1[] = {1,2,3};
		int tabla2[] = {1,2,3};
		boolean iguales= true;
		
		for(int i=0; i< tabla1.length && iguales; i++) {
			iguales = tabla1[i] == tabla2[i];
		System.out.println();
		}
			

	}

}
