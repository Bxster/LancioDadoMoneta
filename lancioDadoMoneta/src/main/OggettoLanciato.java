package main;

import java.util.*;

public abstract class OggettoLanciato {
	
	protected int numeroFacce;
	protected String ultimoLancio = "";

	public OggettoLanciato(int numeroFacce) 
	{
		this.numeroFacce = numeroFacce;
	}
	
	
	public abstract String lancio();
	
	
	public int getNumeroFacce() {
		return numeroFacce;
	}
	
	public String getUltimoLancio() {
		return ultimoLancio;
	}
	

}

