package Exercicio01;

import java.util.Scanner;

public class TesteFatura {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Fatura fatura = new Fatura();
		
		System.out.printf("\t\tTESTE DA CLASSE FATURA%n%n");
		
		String opcao;
		
		do{			
			System.out.println("Informe o tipo do produto: ");
			fatura.setTipo(scan.next());
			System.out.println("Informe a descricao do produto: ");
			fatura.setDescricao(scan.next());
			System.out.println("Informe a quantidade do produto: ");
			fatura.setQuantidade(scan.nextInt());
			System.out.println("Informe o preço do produto: ");
			fatura.setPreco(scan.nextDouble());
			
			System.out.printf("%n%nValor da Fatura: R$%.2f%n%n", fatura.getValorFatura());
			
			System.out.println("Deseja realizar outro teste? (S - Sim / N - Não) ");
			opcao = scan.next();
		}while(opcao.equals("s") || opcao.equals("S"));
		
		scan.close();
		System.out.println("\t\tTESTE FINALIZADO!");
	}

}
