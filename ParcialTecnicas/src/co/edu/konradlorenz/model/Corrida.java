package co.edu.konradlorenz.model;

public class Corrida {
	
	private byte orden;
	private String feria;
	private int anno;
	
	
	
	
	
	
	public byte getOrden() {
		return orden;
	}
	public void setOrden(byte orden) {
		this.orden = orden;
	}
	public String getFeria() {
		return feria;
	}
	public void setFeria(String feria) {
		this.feria = feria;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public Corrida(byte orden, String feria, int anno) {
		super();
		this.orden = orden;
		this.feria = feria;
		this.anno = anno;
	}
	public Corrida() {
		super();
	}
	@Override
	public String toString() {
		return "Corrida [orden=" + orden + ", feria=" + feria + ", anno=" + anno + "]";
	}
	
	
	

}
