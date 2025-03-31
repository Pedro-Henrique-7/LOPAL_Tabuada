package br.dev.pedro.tabuada.model;


public class Tabuada {
	private double multiplicando;
	private double multiplicadorMaior;
	private double multiplicadorMenor;

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMultiplicadorMaior() {
		return multiplicadorMaior;
	}

	public void setMultiplicadorMaior(double multiplicadorMaior) {
		this.multiplicadorMaior = multiplicadorMaior;
	}

	public double getMultiplicadorMenor() {
		return multiplicadorMenor;
	}

	public void setMultiplicadorMenor(double multiplicadorMenor) {
		this.multiplicadorMenor = multiplicadorMenor;
	}
	
	public void exibirTabuada() {
		if (multiplicadorMenor > multiplicadorMaior) {
			double temp = multiplicadorMenor;
			multiplicadorMenor = multiplicadorMaior;
			multiplicadorMaior = temp;
		}
		while (multiplicadorMenor <= multiplicadorMaior ) {
			double produto = multiplicando * multiplicadorMenor;
			System.out.printf("%s X %s = %s\n", multiplicando, multiplicadorMenor, produto);
			multiplicadorMenor++;
		}
		
	
		
	}
}