package Exercicio07;

public abstract class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double valorKmRodado;
	private int kmInicial;
	private int kmFinal;
	private double valorLocacao;
	
	public Veiculo(String placa, String marca, String modelo, int ano,
			double valorKmRodado, int kmInicial, int kmFinal,
			double valorLocacao) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorKmRodado = valorKmRodado;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
		this.valorLocacao = valorLocacao;
	}

	public Veiculo() {
		this("", "", "", 0, 0.0, 0, 0, 0.0);
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getValorKmRodado() {
		return this.valorKmRodado;
	}
	
	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	
	public int getKmInicial() {
		return this.kmInicial;
	}
	
	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}
	
	public int getKmFinal() {
		return this.kmFinal;
	}
	
	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
	
	public double getValorLocacao() {
		return this.valorLocacao;
	}
	
	private void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	
	public void atualizarValorLocacao() {
		setValorLocacao((this.kmFinal - this.kmInicial) * this.valorKmRodado);
	}
}
