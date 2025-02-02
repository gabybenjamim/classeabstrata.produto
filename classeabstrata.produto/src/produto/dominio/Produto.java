package produto.dominio;

public abstract class Produto {
	protected String nome;
	protected double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		calcularDesconto();
		precoComDesconto();
	}
	
	public abstract double calcularDesconto();
	
	public abstract double precoComDesconto();
	
}
