package Exercicio07;

public class VeiculoCarga extends Veiculo{

	private int capacidadeCarga;

	public VeiculoCarga(String placa, String marca, String modelo, int ano,
			double valorKmRodado, int kmInicial, int kmFinal,
			double valorLocacao, int capacidadeCarga) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal,
				valorLocacao);
		this.capacidadeCarga = capacidadeCarga;
	}

	public VeiculoCarga(int capacidadeCarga) {
		this("", "", "", 0, 0.0, 0, 0, 0.0, capacidadeCarga);
	}
	
	public VeiculoCarga() {
		this(0);
	}
	
	public int getCapacidadeCarga() {
		return this.capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
}
