package model;

public class ItemEstoque {
	private Produto produto;
	private double quantidadeEstoque;
	
	public ItemEstoque(Produto p , double quant) {
		this.produto = p;
		this.quantidadeEstoque = quant;
	}

	public Produto getProduto() {
		return produto;
	}

	public double getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public void removeDoEstoque(int quant){
		this.quantidadeEstoque -= quantidadeEstoque;
	}
}
