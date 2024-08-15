package br.com.desafios.empregados;

public class Main {

	public static void main(String[] args) {
		empregadosComissionados empC = new empregadosComissionados(0.7, 8356, "Cristiano Ronaldo", "456.876.971-31", "Portugal");
		empregadosComissionadosMaisBase empB =  new empregadosComissionadosMaisBase(0.7, 5443, 1230.2, "Vini.Jr", "794.544.235-97", "Brasil");

		System.out.println(empC);
		System.out.println("Salário do empregado " + empC.getNome() +": "+ empC.calcularSalario());
		
		System.out.println();
		
		
		System.out.println(empB);
		System.out.println("Salário do empregado " + empB.getNome() +": "+ empB.calcularSalario());
		
	}

}
