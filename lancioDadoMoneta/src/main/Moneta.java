package main;

import java.util.Random;

/**
 * Classe che si occupa del lancio della Moneta 
 * @author gianluca.baldelli
 * 
 */

public class Moneta extends OggettoLanciato{
	
	/**
	 * Costruttore della classe Moneta
	 * @param numeroFacce
	 */
	
	public Moneta(int numeroFacce) {
		
		super(numeroFacce);
		}
	
    public String lancio (){
    	String res = new Random().nextInt(numeroFacce) == 0 ? "Testa":"Croce";
    	this.ultimoLancio = res;
    	return res;
    }
	
}
