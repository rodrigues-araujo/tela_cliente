package Tela;
import java.util.ArrayList;
public class Produtos {
	private ArrayList<Produto> produtosAtivos;

	public Produtos(ArrayList<Produto> produtosAtivos) {
		this.produtosAtivos = produtosAtivos;
		produtosAtivos = new ArrayList<Produto>();
		
	}

	public ArrayList<Produto> getProdutosAtivos() {
		return produtosAtivos;
	}

	public void setProdutosAtivos(ArrayList<Produto> produtosAtivos) {
		this.produtosAtivos = produtosAtivos;
	}
	public void AdicionarProduto(Produto ProdutosAtivos) {
		this.produtosAtivos.add(ProdutosAtivos);
	}
	public void RemoverProduto(Produto produtosAtivos) {
		this.produtosAtivos.remove(produtosAtivos);
	}
}