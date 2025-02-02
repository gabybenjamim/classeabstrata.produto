package produto.teste;

import produto.dominio.ProdutoDigital;
import produto.dominio.ProdutoFisico;

public class ProdutoTeste {

	public static void main(String[] args) {
		ProdutoFisico produtoFisico = new ProdutoFisico("Jogo", 250);
		ProdutoFisico produtoFisico2 = new ProdutoFisico("Livro", 62.50);
		ProdutoDigital produtoDigital = new ProdutoDigital("Game", 170);
		ProdutoDigital produtoDigital2 = new ProdutoDigital("E-Book", 96.30);
		
		System.out.println(produtoFisico);
		System.out.println(produtoFisico2);
		System.out.println(produtoDigital);
		System.out.println(produtoDigital2);
	}

}
