package calcularanonascimento;

import java.util.Scanner;

public class CalcularAnoNascimento {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String nome;
		byte idade;

		System.out.print("Qual o seu nome? ");
		nome = in.nextLine();

		System.out.print("Qual a sua idade? "); 
		idade = in.nextByte();


		int resultado = 2016 - idade;
		System.out.println("Olá "+ nome +", você nasceu por volta de "+ resultado +", e você " +
				(resultado <= 1998?"já é maior":"ainda é menor" )	);

	}
}
