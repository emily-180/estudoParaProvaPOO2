package model;

public class Debito implements FormaPagamento{
	private double desconto;
	
	public Debito(double desconto) {
		this.desconto = desconto/100;
	}
	
	@Override
	public String nomePagamento() {
		return "Debito";
	}

	@Override
	public Double valor(Double vendaValor) {
		double valor = vendaValor - (vendaValor * this.desconto); 
		return valor;
	}

}
