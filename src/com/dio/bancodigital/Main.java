package com.dio.bancodigital;

public class Main {
	
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		Cliente pessoaJuridica = new Cliente();
		pessoaJuridica.setNome("Test Company");
		pessoaJuridica.setCpfCnpj("98.765.432/0001-21");
		
		Cliente pessoaFisica = new Cliente();
		pessoaFisica.setNome("John Testing");
		pessoaFisica.setCpfCnpj("123.456.789-44");
			
		Conta corrente = new ContaCorrente();
		corrente.setCliente(pessoaJuridica);
		
		Conta poupanca = new ContaPoupanca();
		poupanca.setCliente(pessoaFisica);
		
		// Movimentações
		corrente.depositar(500);
		corrente.transferir(100, poupanca);
		corrente.sacar(50);
		
		banco.imprimirInfoBanco();
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
