package main;

import java.util.*;
/**
 * Clsse che estende la superclasse per il dado
 * @author gianluca.baldelli
 *
 */


public class Dado extends OggettoLanciato {	
	
	/**
	 * Costruttore della classe Dado
	 * @param numeroFacce
	 */
	
	public Dado(int numeroFacce) {
		super(numeroFacce);
		}
	
    public String lancio() {
    	String res = String.valueOf(new Random().nextInt(this.numeroFacce - 1) + 1);
    	this.ultimoLancio = res;
    	return res;
    }

}
