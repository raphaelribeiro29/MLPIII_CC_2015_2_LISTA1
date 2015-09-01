package Exercicio04;

import java.util.Scanner;

public class TestePagamento extends Pagamento{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("\t\tTESTE DA CLASSE CARRO%n%n");
		
		int opcao;
		
		do{
			System.out.println("INFORME O SALARIO DOS FUNCIONARIOS: ");
			System.out.printf("VALOR DO PAGAMENTO: R$ %d%n%n", decifrar(scan.next()));
			System.out.println("Deseja realizar outra operação? (1 - SIM / QUALQUER OUTRO VALOR - NÃO)");
			opcao = scan.nextInt();
		}while(opcao == 1);
		
		scan.close();
		System.out.println("\t\tTESTE FINALIZADO!");
	}

}
