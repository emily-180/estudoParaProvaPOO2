package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
	private static Map<String, String[]> produtos = new HashMap();
	private static Map<String, FormaPagamento> pagamento = new HashMap();
	private static Map<String, ItemEstoque> estoqueItens = new HashMap<>();
	
	static {
		produtos.put("arroz", new String[] {"Arroz", "10"});
		produtos.put("feijao", new String[] {"Feijao", "5"});
		
		pagamento.put("credito", new Credito(5));
		pagamento.put("debito", new Debito(0));
		pagamento.put("pix", new Pix(5));
		
		estoqueItens.put("arroz",  new ItemEstoque(new Produto ("Arroz", 10), 5));
		estoqueItens.put("feijao",  new ItemEstoque(new Produto ("Feijao", 8), 5));	
	}
	
	public static String[] getProdutoDescricao(String key) {
		return produtos.get(key);
	}
	
	public static FormaPagamento getFormaPagamento(String key) {
		return pagamento.get(key);
	}
	
	public static List<ItemEstoque> itemEstoque(){
		List<ItemEstoque>  items = new ArrayList<>();
		for (ItemEstoque itemEstoque : estoqueItens.values()) {
			items.add(itemEstoque);
		}
		return items;
	}
	
	public static Produto getProdutoEstoque(String codProduto) {
		String[] dadosProdutos = produtos.get(codProduto);
		
		if (dadosProdutos != null) {
			Produto p = new Produto(dadosProdutos[0], Double.parseDouble(dadosProdutos[1]));
			return p;
		}
		
		return null;
	}
}

