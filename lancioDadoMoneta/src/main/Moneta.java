package main;

import java.util.Random;

public class Moneta extends OggettoLanciato{
	
	public Moneta(int numeroFacce) {
		super(numeroFacce);
		}
    public String lancio (){
    	String res = new Random().nextInt(numeroFacce) == 0 ? "Testa":"Croce";
    	this.ultimoLancio = res;
    	return res;
    }
	
}
