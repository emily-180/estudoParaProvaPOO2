package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private List<ItemVenda> itens;
	private FormaPagamento formaPag;
	private double valorTotalCompra;
	
	public Venda() {
		this.itens = new ArrayList();
	}
	
	public void addItem(double quantidade, String nome) {
		ItemVenda item = new ItemVenda(quantidade, nome);
		itens.add(item);
		valorTotalCompra += item.getPrecoTotalItem();
	}

	public List<String> getItens() {
		List<String> itemVendaString = new ArrayList<>();
		
		for (ItemVenda itemVenda : this.itens) {
			String item = String.format("%s - %.2f - R$%.2f - R$%.2f", 
					itemVenda.getProduto().getNomeProduto(), itemVenda.getQuantidadeVendida(), 
					itemVenda.getProduto().getPrecoProduto(), itemVenda.getPrecoTotalItem());
			
			itemVendaString.add(item);
		}		
		return itemVendaString;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPag = formaPagamento;
    }
	
	public double getValorTotalCompra() {
		return valorTotalCompra;
	}

	public String getNomePag() {
		return formaPag.nomePagamento();
	}
	
	public double getValor() {
		return formaPag.valor(valorTotalCompra);
	}
	
	public void addPagamento(String pagamento) {
		this.formaPag = DataBase.getFormaPagamento(pagamento);
	}
	
	
}
