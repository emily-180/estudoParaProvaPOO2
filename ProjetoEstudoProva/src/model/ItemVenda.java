package model;

public class ItemVenda {
	private double quantidadeVendida;
	private double precoTotalItem;
	private Produto produto;
	
	public ItemVenda(double quantidadeVendida, String nome) {
		String[] prodDescricao = DataBase.getProdutoDescricao(nome);
		this.quantidadeVendida = quantidadeVendida;
		double preco = Double.parseDouble(prodDescricao[1]);
		this.produto = new Produto (prodDescricao[0], preco);
		calculaTotalItem();
	}
	
	public void calculaTotalItem() {
		precoTotalItem = 0;
		precoTotalItem = produto.getPrecoProduto() * quantidadeVendida;
	}

	public double getQuantidadeVendida() {
		return quantidadeVendida;
	}

	public double getPrecoTotalItem() {
		return precoTotalItem;
	}

	public Produto getProduto() {
		return produto;
	}
	
	
	
}
