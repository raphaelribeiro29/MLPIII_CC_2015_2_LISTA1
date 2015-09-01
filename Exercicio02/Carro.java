package Exercicio02;

public class Carro {

	private boolean ligado;
	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	
	public Carro(boolean ligado, String cor, String modelo, 
			int velocidadeAtual, int velocidadeMaxima) {
		this.ligado = ligado;
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public Carro() {
		this(false, "", "", 0, 0);
	}
	
	public void ligar() {
		setLigado(true);
	}
	
	public void desligar() {
		setLigado(false);
	}
	
	public void acelerar(int velocidadeAcrescentada) {
		if(this.ligado){
			setVelocidadeAtual(getVelocidadeAtual() + velocidadeAcrescentada);
			
			if(getVelocidadeAtual() > getVelocidadeMaxima()){
				System.out.println("ATENÇÃO!!!");
				System.out.println("A VELOCIDADE ATUAL É SUPERIOR A VELOCIDADE MÁXIMA DO VEÍCULO!");
			}
		}
		else
			System.out.println("O CARRO ENCONTRA-SE DESLIGADO!");
	}
	
	public void frear(int velocidadeDesacelerada) {
		if(this.ligado){
			if(velocidadeDesacelerada < this.velocidadeAtual)
				setVelocidadeAtual(getVelocidadeAtual() - velocidadeDesacelerada);
			else
				setVelocidadeAtual(0);
		}
	}
	
	public void imprimir() {
		System.out.println("\tINFORMAÇÕES SOBRE O VEÍCULO");
		System.out.println("MODELO: " + getModelo());
		System.out.println("COR: " + getCor());
		System.out.println("LIGADO: " + getLigado());
		System.out.println("VELOCIDADE MAXIMA: " + getVelocidadeMaxima() + " Km/h");
		System.out.println("VELOCIDADE ATUAL: " + getVelocidadeAtual() + " Km/h");
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public boolean getLigado() {
		return this.ligado;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
}
