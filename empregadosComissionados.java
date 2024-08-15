package br.com.desafios.empregados;

public class empregadosComissionados {
	
	private double comissao;
	private int vendas;
	private String nome, cpf, endereco;
	
	public empregadosComissionados(double comissao, int vendas, String nome, String cpf,
			String endereco) {
		this.comissao = comissao;
		this.vendas = vendas;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	protected double calcularSalario () {
		return this.comissao * this.vendas;
	}

	@Override
	public String toString() {
		return "Empregado - Comissao: " + comissao + ", Vendas: " + vendas + ", Nome: " + nome + ", CPF: " + cpf
				+ ", Endereco: " + endereco;
	}
	
	
	
}
