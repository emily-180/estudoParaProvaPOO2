package model;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstoque {
	private Estoque estoque;
	private Venda venda;
	
	public GerenciadorEstoque() {
		estoque = new Estoque();
		venda = null;
	}
	
	public void abreVenda() {
		venda = new Venda();
	}
	
	public void fechaVenda() {
		venda = null;
	}
	
	public boolean taAberto() {
		return venda != null;
	}
	
	public boolean addItem(String codProduto, int quantidade) {
		if (!taAberto())
			return false;
		// Se tem no estoque
		if (estoque.hasQuantidade(codProduto, quantidade)) {		
			venda.addItem(quantidade, codProduto);
			estoque.removeDoEstoque(codProduto, quantidade);
			return true;
		}		
		return false;
	}
	
	public void addPagamento(String formaPag){
		if (taAberto())
			venda.addPagamento(formaPag);
	}
	
	public List<String> getItens() {		
		if (taAberto())
			return venda.getItens();
		
		return new ArrayList();
	}

	public double getTotal() {
		if (taAberto())
			return venda.getValorTotalCompra();
		return 0.0;
	}

	public String getNomePag() {
		if (taAberto())
			return venda.getNomePag();
		return "";
	}

	public double getValor() {
		if (taAberto())
			return venda.getValor();
		
		return 0.00;
	}
}
