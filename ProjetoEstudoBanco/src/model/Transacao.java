package model;

public class Transacao {
	private String nomeOperacao;
    private double valor;

    public Transacao(String nomeOperacao, double valor) {
        this.nomeOperacao = nomeOperacao;
        this.valor = valor;
    }

	public String getNomeOperacao() {
		return nomeOperacao;
	}

	public double getValor() {
		return valor;
	}

   
}
