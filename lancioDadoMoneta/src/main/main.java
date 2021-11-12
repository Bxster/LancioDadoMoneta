package main;

public class main {

	public static void main(String[] args) {
		
		Dado dado = new Dado(6);
		Moneta moneta = new Moneta(2);
		
		System.out.println("Lancio del dado e della moneta: ");
		System.out.println("Lancio del dado: " + dado.lancio());
		System.out.println("Lancio della moneta: " + moneta.lancio());
	}

}
