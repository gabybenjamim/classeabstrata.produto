package produto.dominio;

public class ProdutoDigital extends Produto{

	public ProdutoDigital(String nome, double preco) {
		super(nome, preco);
	}
	
	public double calcularDesconto() {
		return this.preco * 0.10;
	}
	
	public double precoComDesconto() {
		return this.preco - this.calcularDesconto();
	}

	@Override
	public String toString() {
		return "ProdutoDigital [nome=" + nome + ", preco=" + preco + ", calcularDesconto=" + calcularDesconto()
				+ ", precoComDesconto=" + precoComDesconto() + "]";
	}

	
}
