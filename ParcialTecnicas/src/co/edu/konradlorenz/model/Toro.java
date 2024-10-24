package co.edu.konradlorenz.model;

public class Toro {
	
	private String nombre;
	private int codigo;
	private String annoNacimiento;
	private int numOrden;
	private String color;
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumOrden() {
		return numOrden;
	}
	public void setNumOrden(int numOrden) {
		this.numOrden = numOrden;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Toro() {
		super();
	}
	public String getAnnoNacimiento() {
		return annoNacimiento;
	}
	public void setAnnoNacimiento(String annoNacimiento) {
		this.annoNacimiento = annoNacimiento;
	}
	public Toro(String nombre, int codigo, String annoNacimiento, int numOrden, String color) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.annoNacimiento = annoNacimiento;
		this.numOrden = numOrden;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Toro [nombre=" + nombre + ", codigo=" + codigo + ", annoNacimiento=" + annoNacimiento + ", numOrden="
				+ numOrden + ", color=" + color + "]";
	}
	
	
	
	

}
