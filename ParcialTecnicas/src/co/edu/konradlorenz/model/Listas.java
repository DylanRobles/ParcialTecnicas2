package co.edu.konradlorenz.model;

import java.util.ArrayList;

public class Listas {
	
	private ArrayList<Torero> listaTorero = new ArrayList<>();
	private ArrayList<Manager> listaManager = new ArrayList<>();
	private ArrayList<Toro> listaToros = new ArrayList<>();
	private ArrayList<Corrida> listaCorrida = new ArrayList<>();
	
	public ArrayList<Torero> getListaTorero1(){
		ArrayList <Torero> listaTorero = new ArrayList<>();
		return listaTorero;
	}
	public ArrayList<Manager> getListaManager1(){
		ArrayList <Manager> listaManager = new ArrayList<>();
		return listaManager;
	}
	
	
	
	
	public Torero getListaTorero() {
		
		for(int i = 0; i<listaTorero.size(); i++) {
			
			return listaTorero.get(i);
		}
		return null;
	}
	
	
	public void setListaTorero(Torero torero) {
		listaTorero.add(torero);
	}
	
	public Manager getListaManager() {
		
		for(int i = 0; i < listaManager.size(); i++) {
			return listaManager.get(i);
			
		}
		return null;
	}
	
	public void setListaManager(Manager manager) {
		listaManager.add(manager);
		
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
