package com.dio.bancodigital;

import java.util.List;
import java.util.Objects;

public class Banco {

	private String nome;
	private String codigo;
	private String cnpj;
	private List<Conta> contas;

	public Banco() {
		this.codigo = "0001"; 
		this.nome = "Dio Bank";
		this.cnpj = "12.345.678/0001-90";
	}
	
	public void imprimirInfoBanco() {
		System.out.println("Banco: " + this.nome);
		System.out.println("Código: " + this.codigo);
		System.out.println("CNPJ: " + this.cnpj + "\n");
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj, codigo, contas, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(contas, other.contas) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Banco [nome=" + nome + ", codigo=" + codigo + ", cnpj=" + cnpj + ", contas=" + contas + "]";
	}
	
}
