package Iteraciones2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int grupoa = 4;
		int grupob = 4;
		int grupoc = 4;
		int notaMediaMayor = 0;
		String nombrealumnoMediaAlta="";
		String nombreAlumno ="";
		int notaMedia = 0;
		
		
		Scanner escaner=new Scanner(System.in);
		
		System.out.println("Indica grupo que desea consultar A, B o C:");
		String opcion=escaner.next().toUpperCase();
		
		if (opcion.equals("A") || opcion.equals("B") || opcion.equals("C")) {
			for(int i = 1; i<=4; i++ )
			{
			System.out.println("Introduce nombre del alumno: ");
			nombreAlumno = escaner.next();
			System.out.println("Introduce nota primer parcial: ");
			int nota1 = escaner.nextInt();
			System.out.println("Introduce nota segundo parcial: ");
			int nota2 = escaner.nextInt();
			System.out.println("Introduce nota tercer parcial: ");
			int nota3 = escaner.nextInt();
			notaMedia = (nota1+nota2+nota3)/3;
			
			if(notaMedia>notaMediaMayor) {
			notaMediaMayor=notaMedia;
			nombrealumnoMediaAlta=nombreAlumno;
			 }
			 
			 }
			System.out.println("El alumno "+nombrealumnoMediaAlta+" tiene la mayor media con "+notaMediaMayor+".");
		}
		
		
	}

}
