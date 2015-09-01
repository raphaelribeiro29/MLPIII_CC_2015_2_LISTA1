package Exercicio06;

public abstract class Fita {
	
	private String titulo;
	private double preco;
	
	public Fita(String titulo, double preco) {
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public Fita() {
		this("", 0.0);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
