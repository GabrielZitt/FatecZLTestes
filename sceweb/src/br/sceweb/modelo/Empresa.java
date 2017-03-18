package br.sceweb.modelo;


import java.util.InputMismatchException;

public class Empresa {
	String cnpj;
	String nomeDaEmpresa;
	String nomeFantasia;
	String endereco;
	String telefone;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		if (cnpj.equals("")){
			this.cnpj = cnpj;
			throw new IllegalArgumentException("Cnpj invalido");
		}else
			this.cnpj = cnpj;
	}
	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		if (nomeDaEmpresa.equals("")){
			this.nomeDaEmpresa = nomeDaEmpresa;
			throw new IllegalArgumentException("Nome da empresa invalido");
		}else
			this.nomeDaEmpresa = nomeDaEmpresa;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		if (nomeFantasia.equals("")){
			this.nomeFantasia = nomeFantasia;
			throw new IllegalArgumentException("Nome fantasia invalido");
		}else
		this.nomeFantasia = nomeFantasia;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if (endereco.equals("")){
			this.endereco = endereco;
			throw new IllegalArgumentException("Endereço invalido");
		}else
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if (telefone.equals("")){
			this.telefone = telefone;
			throw new IllegalArgumentException("Telefone invalido");
		}
		this.telefone = telefone;
	}
}

