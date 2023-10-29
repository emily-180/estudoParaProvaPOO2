package model;

public class Credito implements FormaPagamento{
	
	private double desconto;
	
	public Credito(double desconto) {
		this.desconto = desconto/100;
	}
	
	@Override
	public String nomePagamento() {
		return "Credito";
	}

	@Override
	public Double valor(Double vendaValor) {
		double valor = vendaValor + (this.desconto * vendaValor);
		return valor;
	}

}
