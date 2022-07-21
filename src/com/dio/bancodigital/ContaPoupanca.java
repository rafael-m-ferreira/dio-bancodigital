package com.dio.bancodigital;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("==============================");
		System.out.println("### Extrato Conta Poupança ###");
		System.out.println("==============================");
		super.imprimirInfosComuns();
	}
}
