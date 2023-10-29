package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	 private List<ContaBancaria> contas;
	 private List<ContaBancaria> extrato;
	 
    public Banco() {
        this.contas = new ArrayList<>();
    }
    
    public void addConta(String nome, int cpf, int numConta, double saldo) {
    	contas.add(new ContaBancaria(nome, cpf, numConta, saldo));
    }
    
    public ContaBancaria getContaPorNumero(int numeroConta) {
	    for (ContaBancaria conta : contas) {
	        if (conta.getNumConta() == numeroConta) {
	            return conta;
	        }
	    }
	    return null;
	}
    
  //deposito
  	public void deposito(int numConta, double valor) {
  		ContaBancaria conta = getContaPorNumero(numConta);
  		if (conta != null) {
            conta.deposito(valor);
        }
  	}
  	
  	//saque
  	public void saque(int numConta, double valor) {
  		ContaBancaria conta = getContaPorNumero(numConta);
  		if (conta != null) {
  			conta.saque(valor);
  		}
   	}
  	
  	//saldo
  	public void verSaldo(int numConta) {
  		ContaBancaria conta = getContaPorNumero(numConta);
  		if (conta != null) {
  			conta.verSaldo();
  		}
  	}
  	
  	//transfencia
  	public void transferencia(int numConta, ContaBancaria numDestino, double valor) {
  		ContaBancaria conta = getContaPorNumero(numConta);
  		if (conta != null) {
  			conta.transferencia(numDestino, valor);
  		}		
  	}
  	
  	//extrato
  	public List<String> exibirExtrato(int numConta){
  	    ContaBancaria conta = getContaPorNumero(numConta);
  	    if (conta != null) {
  	        return conta.exibirExtrato();
  	    }
  	    return null; // ou uma lista vazia, dependendo da sua necessidade
  	}

	public List<ContaBancaria> getContas() {
		return contas;
	}
  	
  	
}
