package Exercicio02;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.printf("\t\tTESTE DA CLASSE CARRO%n%n");
		
		int opcao;
		
		do{
			System.out.printf("\tMENU%n%n");
			System.out.println("1 - Cadastrar veículo");
			System.out.println("2 - Ligar/Desligar Veículo");
			System.out.println("3 - Acelerar Veículo");
			System.out.println("4 - Frear Veículo");
			System.out.println("5 - Informações sobre o Veículo");
			System.out.println("6 - Sair");
			System.out.println("Digite uma das opções acima: ");
			opcao = scan.nextInt();
			
			switch(opcao){
				case 1:{
					System.out.println("Informe o modelo do carro: ");
					carro.setModelo(scan.next());
					System.out.println("Informe a cor do carro: ");
					carro.setCor(scan.next());
					System.out.println("Informe a velocidade máxima do carro: ");
					carro.setVelocidadeMaxima(scan.nextInt());
					break;
				}
				case 2:{
					if(carro.getLigado())
						carro.desligar();
					else
						carro.ligar();
					break;
				}
				case 3:{
					System.out.println("Informe a velocidade de aceleração em Km/h: ");
					carro.acelerar(scan.nextInt());
					break;
				}
				case 4:{
					System.out.println("Informe a velocidade de desaceleração em Km/h: ");
					carro.frear(scan.nextInt());
					break;
				}
				case 5:{
					carro.imprimir();
					break;
				}
				default:{
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
			}
		}while(opcao != 6);		
		
		scan.close();
		System.out.println("\t\tTESTE FINALIZADO!");
	}
}
