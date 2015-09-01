package Exercicio06;

public class FitaLancamento extends Fita{

	public FitaLancamento(String titulo, double preco) {
		super(titulo, preco);
	}
	
	public FitaLancamento() {
		this("", 0.0);
	}
	
	public void atualizarPreco(double preco) {
		preco += preco * (20/100);
		setPreco(preco);
	}
}
