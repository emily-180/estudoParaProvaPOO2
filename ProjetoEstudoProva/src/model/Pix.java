package model;

public class Pix implements FormaPagamento{
	private double desconto;
	
	public Pix(double desconto){
		this.desconto = desconto/100;
	}
	
	@Override
	public String nomePagamento() {
		return "Dinheio/Pix";
	}

	@Override
	public Double valor(Double vendaValor) {
		double valor = vendaValor - (this.desconto * vendaValor);
		return valor;
	}
}
