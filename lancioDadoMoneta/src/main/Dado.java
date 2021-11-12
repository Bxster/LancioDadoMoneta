package main;

import java.util.*;

public class Dado extends OggettoLanciato {	
	
	public Dado(int numeroFacce) {
		super(numeroFacce);
		}
	
    public String lancio() {
    	String res = String.valueOf(new Random().nextInt(this.numeroFacce - 1) + 1);
    	this.ultimoLancio = res;
    	return res;
    }

}
