package co.edu.konradlorenz.model;

import java.util.ArrayList;

public class Listas {
	
	private ArrayList<Persona> listaPersonas = new ArrayList<>();
	private ArrayList<Toro> listaToros = new ArrayList<>();
	private ArrayList<Corrida> listaCorrida = new ArrayList<>();
	
	
	public Persona getListaToreros() {
		
		for(int i = 0; i<listaPersonas.size(); i++) {
			
			return listaPersonas.get(i);
		}
		return null;
	}
	public void setListaToreros(Torero torero) {
		listaPersonas.add(torero);
	}
	
	
	public Toro getListaToros() {
		for(int i = 0; i<listaToros.size();i++) {
			
			return listaToros.get(i);
		}
		return null;
		
	}
	public void setListaToros(Toro toro) {
		listaToros.add(toro);
	}
	public Corrida getListaCorrida() {
		
		for(int i = 0; i<listaCorrida.size(); i++) {
			return listaCorrida.get(i);
			
		}
		return null;
		
		
	}
	public void setListaCorrida(Corrida corrida) {
		listaCorrida.add(corrida);
	}
	
	

}
