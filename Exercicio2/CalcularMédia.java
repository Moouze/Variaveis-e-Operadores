package Exercicio2;

import java.util.Scanner;

public class CalcularMédia {

	public static void main(String[] args) {

		float nota1,nota2,nota3,nota4,média;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nota 1");
		nota1 = leia.nextFloat();
		System.out.println("Nota 2");
		nota2 = leia.nextFloat();
		System.out.println("Nota 3");
		nota3 = leia.nextFloat();
		System.out.println("Nota 4");
		nota4 = leia.nextFloat();
		
		média = (nota1+nota2+nota3+nota4)/4;
		System.out.printf("\nMédia Final:  %.1f" ,média);

	}

}
