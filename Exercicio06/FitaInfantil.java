package Exercicio06;

public class FitaInfantil extends Fita{

	public FitaInfantil(String titulo, double preco) {
		super(titulo, preco);
	}
	
	public FitaInfantil() {
		this("", 0.0);
	}
	
	public void atualizarPreco(double preco) {
		preco -= preco * (40/100);
		setPreco(preco);
	}
}
