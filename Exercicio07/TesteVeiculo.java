package Exercicio07;

import java.util.Scanner;

public class TesteVeiculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		VeiculoCarga carga = new VeiculoCarga();
		VeiculoPasseio passeio = new VeiculoPasseio();
		
		System.out.printf("\t\tTESTE DA CLASSE FITA%n%n");
		
		int opcao;
		
		do{
			System.out.printf("\t\tMENU%n%n");
			System.out.println("1 - Cadastrar Veículo de Passeio");
			System.out.println("2 - Cadastrar Veículo de Carga");
			System.out.println("3 - Devolver Veículo de Passeio");
			System.out.println("4 - Devolver Veículo de Carga");
			System.out.println("5 - Sair");
			opcao = scan.nextInt();
			
			switch(opcao){
				case 1:{
					System.out.println("Informe a placa: ");
					passeio.setPlaca(scan.next());
					System.out.println("Informe a marca: ");
					passeio.setMarca(scan.next());
					System.out.println("Informe o modelo: ");
					passeio.setModelo(scan.next());
					System.out.println("Informe o ano: ");
					passeio.setAno(scan.nextInt());
					System.out.println("Informe o valor por Km rodado: R$");
					passeio.setValorKmRodado(scan.nextDouble());
					System.out.println("Informe a quilometragem: ");
					passeio.setKmInicial(scan.nextInt());
					System.out.println("Tem ar condicionado? ");
					passeio.setArCondicionado(scan.nextBoolean());
					System.out.println("Quantidade de portas: ");
					passeio.setQuantidadePortas(scan.nextInt());
					break;
				}
				case 2:{
					System.out.println("Informe a placa: ");
					carga.setPlaca(scan.next());
					System.out.println("Informe a marca: ");
					carga.setMarca(scan.next());
					System.out.println("Informe o modelo: ");
					carga.setModelo(scan.next());
					System.out.println("Informe o ano: ");
					carga.setAno(scan.nextInt());
					System.out.println("Informe o valor por Km rodado: R$");
					carga.setValorKmRodado(scan.nextDouble());
					System.out.println("Informe a quilometragem: ");
					carga.setKmInicial(scan.nextInt());
					System.out.println("Capacidade de carga: ");
					carga.setCapacidadeCarga(scan.nextInt());
					break;
				}
				case 3:{
					System.out.println("Informe a quilometragem: ");
					passeio.setKmFinal(scan.nextInt());
					passeio.atualizarValorLocacao();
					System.out.printf("Valor da locação: R$%.2f%n%n", passeio.getValorLocacao());
					break;
				}
				case 4:{
					System.out.println("Informe a quilometragem: ");
					carga.setKmFinal(scan.nextInt());
					carga.atualizarValorLocacao();
					System.out.printf("Valor da locação: R$%.2f%n%n", carga.getValorLocacao());
					break;
				}
			}
		}while(opcao != 5);
		
		scan.close();
		System.out.println("\t\tTESTE FINALIZADO!");
	}

}
