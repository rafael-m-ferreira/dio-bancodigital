package com.dio.bancodigital;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Cliente cliente) {
		super();
		this.cliente = cliente;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("==============================");
		System.out.println("### Extrato Conta Corrente ###");
		System.out.println("==============================");
		super.imprimirInfosComuns();
	}
	
}
