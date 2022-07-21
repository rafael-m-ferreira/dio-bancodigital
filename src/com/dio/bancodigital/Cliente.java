package com.dio.bancodigital;

import java.util.Date;

public class Cliente {

	private String nome;
	private String cpfCnpj;
	private Date dataNascimento;
	private Endereco endereco;
	private String email;
	private String telefone;
	private boolean ativo;
	

	public Cliente() {}

	public Cliente(String nome, String cpf, Date dataNascimento, Endereco endereco, String email, String telefone) {
		this.nome = nome;
		this.cpfCnpj = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.ativo = true;
	}
	
	// Methods
	public void imprimirInfoCliente() {
		System.out.println("Cliente: " + this.nome);
		System.out.println("CPF/CNPJ: " + this.cpfCnpj);
	}

	// Getter and Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
