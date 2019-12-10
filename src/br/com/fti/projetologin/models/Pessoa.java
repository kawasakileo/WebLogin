package br.com.fti.projetologin.models;

/**
 * Classe padrão para o objeto Login.
 * 
 */
public class Pessoa {
	private int id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String cep;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(int id, String nome, String sobrenome, String cpf, String cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.cep = cep;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}