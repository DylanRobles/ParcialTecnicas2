package co.edu.konradlorenz.model;

public class Premio {
	
	private int numOrejas;
	private int numRabos;
	private int fecha;
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
	public Premio(int numOrejas, int numRabos, int fecha) {
		super();
		this.numOrejas = numOrejas;
		this.numRabos = numRabos;
		this.fecha = fecha;
	}
	public Premio() {
		super();
	}
	@Override
	public String toString() {
		return "Premio [numOrejas=" + numOrejas + ", numRabos=" + numRabos + ", fecha=" + fecha + "]";
	}
	
	
	

}
