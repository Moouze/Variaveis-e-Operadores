package JavaTech;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
	
		String nome = "Charles";
		int idade = 25,X=10;
		double altura = 1.72;
		float nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome participante: "+nome);
		System.out.println("Idade participante: "+idade);
		System.out.println("Altura participante "+altura);
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Entre com a segundaa nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nMédia Aritimética: "+media);
		System.out.printf("\nMédia Aritimética:  %.2f" ,media);
		
		nota1 = (float) Math.sqrt(nota2);
		nota2 = (float) Math.pow(nota3, 3);
		X = X % 2;
		System.out.println("resultado"+nota1);
		
	}

}
