package co.edu.konradlorenz.model;

public class Manager extends Persona {
	
	
	
	
	private String direccion;
	private String telefono;
	
	
	
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Manager(String direccion, String telefono) {
		super();
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public Manager() {
		super();
	}
	public Manager(String nombre, String cedula, String direccion, String telefono) {
		super(nombre, cedula);
		this.direccion = direccion;
		this.telefono = telefono;
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
		return "Manager [Nombre: " + getNombre() + ", Cedula: " + getCedula() + ", Direccion: " + getDireccion() + ", Telefono: " + getTelefono()+"]";
	}
	
	
	
	
	
	

}
