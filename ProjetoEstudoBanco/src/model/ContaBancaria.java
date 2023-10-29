package model;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
	private int numConta;
	private Titular titular;
	private List<Transacao> extrato;
	private double saldo;
	
	public ContaBancaria(String nome, int cpf, int numConta, double saldo) {
		this.titular = new Titular(nome, cpf);
		this.numConta = numConta;
		this.extrato = new ArrayList();
		this.saldo = saldo;
	}
	
	public int getNumConta() {
		return numConta;
	}
		
	public Titular getTitular() {
		return titular;
	}

	//deposito
	public void deposito(double valor) {
		saldo += valor;
		 this.extrato.add(new Transacao("Depósito", valor));
	}
	
	//saque
	public boolean saque(double valor) {
		if(valor<=saldo) {
			saldo-=valor;
			this.extrato.add(new Transacao("Saque", valor));
			return true;
		}
		return false;
	}
	
	//saldo
	public double verSaldo() {
		this.extrato.add(new Transacao("Saldo", saldo));
		return saldo;
	}
	
	//transfencia
	public boolean transferencia(ContaBancaria conta, double valor) {
		if(valor<=saldo) {
			conta.deposito(valor);
			this.extrato.add(new Transacao("Transferencia", valor));
			return true;
		}
		return false;			
	}
	
	//extrato
	public List<String> exibirExtrato(){
		List <String> extratoString = new ArrayList<>();
		extratoString.add("Extrato da conta " + numConta + " - Titular: " + titular.getNomeTitular());
		for(Transacao transacao: extrato) {
			String item = String.format("%s ----- %.2f", transacao.getNomeOperacao(), transacao.getValor());
			extratoString.add(item);
		}
		return extratoString;
	}
}
