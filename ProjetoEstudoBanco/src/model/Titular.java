package model;

public class Titular {
	private String nomeTitular;
	private int cpf;
	
	public Titular(String nomeTitular, int cpf) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public int getCpf() {
		return cpf;
	} 
	
	@Override
    public String toString() {
        return "Nome: " + nomeTitular + ", CPF: " + cpf;
    }
	
}
