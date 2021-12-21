
/**
 * Package principale
 */
package main;

/**
 * 
 * @author gianluca.baldelli
 * Classe Main che si occupa di inizializzare i vari oggetti
 */

public class main {

	/**
	 * 
	 * @param args main
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		Dado dado = new Dado(6);
		Moneta moneta = new Moneta(2);
		
		System.out.println("Lancio del dado e della moneta: ");
		System.out.println("Lancio del dado: " + dado.lancio());
		System.out.println("Lancio della moneta: " + moneta.lancio());
	}

}
