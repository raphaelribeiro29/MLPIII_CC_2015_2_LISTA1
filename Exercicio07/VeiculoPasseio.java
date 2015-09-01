package Exercicio07;

public class VeiculoPasseio extends Veiculo{

	private boolean arCondicionado;
	private int quantidadePortas;

	public VeiculoPasseio(String placa, String marca, String modelo, int ano,
			double valorKmRodado, int kmInicial, int kmFinal,
			double valorLocacao, boolean arCondicionado, int quantidadePortas) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal,
				valorLocacao);
		this.arCondicionado = arCondicionado;
		this.quantidadePortas = quantidadePortas;
	}
	
	public VeiculoPasseio(boolean arCondicionado, int quantidadePortas) {
		this("", "", "", 0, 0.0, 0, 0, 0.0, arCondicionado, quantidadePortas);
	}
	
	public VeiculoPasseio() {
		this(false, 2);
	}

	public boolean isArCondicionado() {
		return this.arCondicionado;
	}
	
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	
	public int getQuantidadePortas() {
		return this.quantidadePortas;
	}
	
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
}
