package tema4.boletin2;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		String opcion;
		
		
		do
		{
			System.out.println("A) Abrir.");
			System.out.println("B) Buscar.");
			System.out.println("X) Salir.");
			System.out.println("Introduce una opcion:");
			opcion = escaner.next().toUpperCase();
			
			if (opcion.equals("A")) {
				System.out.println("Has seleccionado A.");
			}
			else if (opcion.equals("B")) {
				System.out.println("Has seleccionado B.");
			}
			
		} while(!opcion.equals("X")); 
		 System.out.print("ffff");
	}

}
