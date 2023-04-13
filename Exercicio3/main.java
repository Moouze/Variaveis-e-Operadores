package Exercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		float bruto,adicional,extra,descontos,liquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Salário Bruto: ");
		bruto = leia.nextFloat();
		System.out.println("Adicional Noturno: ");
		adicional = leia.nextFloat();
		System.out.println("Horas Extras: ");
		extra = leia.nextFloat();
		System.out.println("Descontos: ");
		descontos = leia.nextFloat();
		
		
		liquido = (bruto+adicional+(extra*5)-descontos);
		
		System.out.printf("\nSalário Liquido:  %.2f" ,liquido);

	}

}
