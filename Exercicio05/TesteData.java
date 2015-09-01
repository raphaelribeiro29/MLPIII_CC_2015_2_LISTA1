package Exercicio05;

import java.util.Scanner;

public class TesteData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Data data = new Data();
		
		System.out.printf("\t\tTESTE DA CLASSE CARRO%n%n");
		
		int opcao;
		
		do{
			System.out.println("Informe o dia: ");
			int dia = scan.nextInt();
			System.out.println("Informe o mês: ");
			int mes = scan.nextInt();
			System.out.println("Informe o ano: ");
			int ano = scan.nextInt();
			data.setData(dia, mes, ano);
			System.out.println(data.toString());
			
			
			System.out.println("Deseja realizar outra operação? (1 - SIM / QUALQUER OUTRO VALOR - NÃO)");
			opcao = scan.nextInt();
		}while(opcao == 1);
		
		scan.close();
		System.out.println("\t\tTESTE FINALIZADO!");
	}

}
