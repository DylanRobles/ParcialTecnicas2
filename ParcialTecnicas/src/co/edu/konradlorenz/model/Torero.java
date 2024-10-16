package co.edu.konradlorenz.model;

public class Torero extends Persona implements Alternativa{
	
	
	private String apodo;
	private String fecha;
	private Torero padrino;
	
	
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Torero(String apodo, String fecha) {
		super();
		this.apodo = apodo;
		this.fecha = fecha;
	}
	public Torero() {
		super();
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}
	@Override
	public String getCedula() {
		// TODO Auto-generated method stub
		return super.getCedula();
	}
	@Override
	public void setCedula(String cedula) {
		// TODO Auto-generated method stub
		super.setCedula(cedula);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Torero(String nombre, String cedula, String apodo, String fecha) {
		super(nombre, cedula);
		this.apodo = apodo;
		this.fecha = fecha;
	}
	@Override
	public Torero obtenerPadrino() {
		
		return padrino;
	}
	@Override
	public void asignarPadrino(Torero padrino) {
		
		this.padrino = padrino;
		
		
	}
	
	
	
	
	

}
