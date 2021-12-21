package main;

import java.util.*;

/**
 * Superclasse che si occupa del lancio oggetto
 * @author gianluca.baldelli
 *
 */

public abstract class OggettoLanciato {
	
	protected int numeroFacce;
	protected String ultimoLancio = "";
/**
 * Costruttore della classe
 * @param numeroFacce del dado o della moneta
 */
	
	public OggettoLanciato(int numeroFacce) 
	{
		this.numeroFacce = numeroFacce;
	}
	
	/**
	 * metodo che si occupa del lancio
	 * @return res numero del lancio
	 */
	public abstract String lancio();
	
	/**
	 * Ritorna il numero delle facce o del dado o della moneta
	 * @return numeroFacce
	 */
	public int getNumeroFacce() {
		return numeroFacce;
	}
	
	/**
	 * Ritorna l'ultimo lancio del dado o della moneta
	 * @return ultimoLancio
	 */
	public String getUltimoLancio() {
		return ultimoLancio;
	}
	

}

