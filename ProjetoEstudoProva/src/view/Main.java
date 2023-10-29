package view;

import model.GerenciadorEstoque;

public class Main {
	public static void main(String[] args) {
		GerenciadorEstoque manager = new GerenciadorEstoque();
		manager.abreVenda();
		manager.addItem("arroz", 3);
		manager.addItem("feijao", 2);
		manager.addPagamento("cd");
				
		for (String si : manager.getItens()) {
			System.out.println(si);
		}
		
		System.out.println(String.format("Total: R$:%.2f", manager.getTotal()));
		System.out.println("Forma de pagamento: " + manager.getNomePag());
		System.out.println("Valor a ser pago: " + manager.getValor());
	}
}
