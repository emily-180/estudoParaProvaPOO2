package model;

import java.util.List;

public class Estoque {
	private List<ItemEstoque> itens;
	
	public Estoque() {
		this.itens = DataBase.itemEstoque();
	}
		
	public boolean hasQuantidade(String codProduto, int quantidade) {
		Produto p = DataBase.getProdutoEstoque(codProduto);
		for (ItemEstoque itemEstoque : itens) {
			Produto pInStock = itemEstoque.getProduto();
			
			if (p.getNomeProduto().equals(pInStock.getNomeProduto())) {
				return itemEstoque.getQuantidadeEstoque()>= quantidade;
			}
		}
		return false;
	}
	
	public void removeDoEstoque(String codProduto, int quantidade) {
		Produto p = DataBase.getProdutoEstoque(codProduto);
		for (ItemEstoque itemEstoque : itens) {
			Produto pInStock = itemEstoque.getProduto();
			if (p.getNomeProduto().equals(pInStock.getNomeProduto())) {
				itemEstoque.removeDoEstoque(quantidade);
			}	
			break;
		}
	}
}
