package Exercicio1;

import java.util.Scanner;

public class CalculoSalário {

	public static void main(String[] args) {
		
		float Salário,Abono,novo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário");
		Salário = leia.nextFloat();
		System.out.println("Digite o Abono");
		Abono = leia.nextFloat();
		
		
		novo = (Salário+Abono);
		System.out.printf("\nNovo Salario:  %.2f" ,novo);
		
		
	}

}
