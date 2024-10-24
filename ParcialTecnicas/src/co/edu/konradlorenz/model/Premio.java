package co.edu.konradlorenz.model;

public class Premio {
	
	private int numOrejas;
	private int numRabos;
	private int fecha;
	private boolean puertaGrande;
	
	
	
	public int getNumOrejas() {
		return numOrejas;
	}
	public void setNumOrejas(int numOrejas) {
		this.numOrejas = numOrejas;
	}
	public int getNumRabos() {
		return numRabos;
	}
	public void setNumRabos(int numRabos) {
		this.numRabos = numRabos;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public boolean isPuertaGrande() {
		return puertaGrande;
	}
	public void setPuertaGrande(boolean puertaGrande) {
		this.puertaGrande = puertaGrande;
	}
	public Premio(int numOrejas, int numRabos, int fecha, boolean puertaGrande) {
		super();
		this.numOrejas = numOrejas;
		this.numRabos = numRabos;
		this.fecha = fecha;
		this.puertaGrande = puertaGrande;
	}
	public Premio() {
		super();
	}
	@Override
	public String toString() {
		return "Premio [numOrejas=" + numOrejas + ", numRabos=" + numRabos + ", fecha=" + fecha + ", puertaGrande="
				+ puertaGrande + "]";
	}
	
	
	
	
	
	
	

}
