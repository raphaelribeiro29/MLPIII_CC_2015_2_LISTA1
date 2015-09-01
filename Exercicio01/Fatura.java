package Exercicio01;

public class Fatura {

	private String tipo;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Fatura(String tipo, String descricao, int quantidade, double preco) {
		this.tipo = tipo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public Fatura() {
		this("", "", 0, 0.0);
	}

	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		if(quantidade >= 0)
			this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		if(preco >= 0)
			this.preco = preco;
	}
	
	public double getValorFatura() {
		return (this.quantidade * this.preco);
	}
}
