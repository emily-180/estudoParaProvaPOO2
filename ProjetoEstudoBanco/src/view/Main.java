package view;

import java.util.List;

import model.Banco;
import model.ContaBancaria;

public class Main {
	public static void main (String argrs[]) {
		 Banco banco = new Banco();
		 banco.addConta("Emily", 123654, 0001, 500);
		 banco.addConta("Julia", 223654, 0002, 200);
		 banco.deposito(0001, 100);
		 banco.deposito(0001, 100);
		 banco.saque(0001, 50);
		 banco.verSaldo(0001);
		
		 for (ContaBancaria conta : banco.getContas()) {
	            for (String linha : banco.exibirExtrato(conta.getNumConta())) {
	                System.out.println(linha);
	            }
	            System.out.println();
	     }
		  
	}
}
