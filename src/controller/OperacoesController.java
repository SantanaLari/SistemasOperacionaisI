package controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	
	public void Buffer1000() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		
		for(int i = 0; i < 1000; i++) {
			buffer.append("x");
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal/Math.pow(10, 9);
		
		System.out.println("Buffer de 1.000: " + tempoTotal + "s. ");
	}
	
	public void Buffer10000() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		
		for(int i = 0; i < 10000; i++) {
			buffer.append("x");
		}
	
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("Buffer de 10.000: " + tempoTotal + "s. ");
	}
	
	public void Buffer100000() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			buffer.append("x");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("Buffer de 100.000: " + tempoTotal + "s. ");
	}
}