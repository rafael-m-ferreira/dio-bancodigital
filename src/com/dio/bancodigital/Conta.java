package com.dio.bancodigital;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Conta implements IConta{

	private static final int AGENCIA_DEFAULT = 0000001;
	private static int COUNT = 1;

	protected int agencia;
	protected int numConta;
	protected double saldo;
	protected Cliente cliente;
	protected Date dataAbertura;
	protected boolean ativa;

	public Conta(){
		this.agencia = AGENCIA_DEFAULT;
		this.numConta = COUNT++;
		this.saldo = 0.0;
		this.cliente = new Cliente();
		this.dataAbertura = new Date();
		this.ativa = true;
	}

	@Override
	public void sacar(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;	
		} else {
			System.out.println("Saldo insuficiente para o saque.\n");
		}		
	}

	@Override
	public void depositar(double valor) {

		this.saldo += valor;	
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {

		if (this.saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Saldo insuficiente para a transferência.\n");

		}
	}

	protected void imprimirInfosComuns() {
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("CPF/CNPJ: " + this.cliente.getCpfCnpj());
		System.out.println("Data de Abertura: " + new SimpleDateFormat("dd'/'MM'/'yyyy").format(dataAbertura) + "\n");
		System.out.println(String.format("Agência: %07d", this.agencia));
		System.out.println(String.format("Conta: %05d", this.numConta));
		System.out.println(String.format("Saldo: R$ %.2f", this.saldo) + "\n\n");
	  
	}

	//Getters and Setters
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
		
}
