package Exercicio06;

import java.util.Scanner;

public class TesteFita {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FitaInfantil fitaInf = new FitaInfantil();
		FitaLancamento fitaLanc = new FitaLancamento();
		
		System.out.printf("\t\tTESTE DA CLASSE FITA%n%n");
		
		int opcao;
		
		do{
			System.out.printf("\tMENU%n%n");
			System.out.println("1 - Cadastrar/Alterar uma Fita Lançamento");
			System.out.println("2 - Cadastrar/Alterar uma Fita Infantil");
			System.out.println("3 - Preço da Fita Lançamento");
			System.out.println("4 - Preço da Fita Infantil");
			System.out.println("5 - Sair");
			opcao = scan.nextInt();
			
			switch(opcao){
				case 1:{
					System.out.println("Informe o titulo da fita: ");
					fitaLanc.setTitulo(scan.next());
					System.out.println("Informe o preço da fita: ");
					fitaLanc.setPreco(scan.nextDouble());
					fitaLanc.atualizarPreco(fitaLanc.getPreco());
					break;
				}
				case 2:{					
					System.out.println("Informe o titulo da fita: ");
					fitaInf.setTitulo(scan.next());
					System.out.println("Informe o preço da fita: ");
					fitaInf.setPreco(scan.nextDouble());
					fitaInf.atualizarPreco(fitaInf.getPreco());
					break;
				}
				case 3:{
					System.out.printf("Preço da Fita Lançamento: R$%.2f%n", fitaLanc.getPreco());
					break;
				}
				case 4:{
					System.out.printf("Preço da Fita Infantil: R$%.2f%n", fitaInf.getPreco());
					break;
				}
			}
			
		}while(opcao != 5);
			
		scan.close();
		System.out.println("\t\tTESTE FINALIZADO!");
	}

}
