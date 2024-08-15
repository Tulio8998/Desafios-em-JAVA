package br.com.desafios.empregados;

import java.text.DecimalFormat;

public class empregadosComissionadosMaisBase extends empregadosComissionados{

	private double salarioBase;

	public empregadosComissionadosMaisBase(double comissao, int vendas, double salarioBase, String nome, String cpf, String endereco) {
		super(comissao, vendas, nome, cpf, endereco);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	@Override
	protected double calcularSalario() {
		return super.calcularSalario() + this.salarioBase;
	}

	@Override
	public String toString() {
		return super.toString() +", SalarioBase: " + salarioBase;
	}
	
	
	
}
