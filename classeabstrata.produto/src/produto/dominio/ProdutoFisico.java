package produto.dominio;

public class ProdutoFisico extends Produto{

	public ProdutoFisico(String nome, double preco) {
		super(nome, preco);
	}
	
	public double calcularDesconto() {
		return this.preco * 0.05;
	}

	public double precoComDesconto() {
		return this.preco - this.calcularDesconto();
	}

	@Override
	public String toString() {
		return "ProdutoFisico [nome=" + nome + ", preco=" + preco + ", calcularDesconto=" + calcularDesconto()
				+ ", precoComDesconto=" + precoComDesconto() + "]";
	}
	
	
	
	
	
	

}
