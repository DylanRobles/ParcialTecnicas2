package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Corrida;
import co.edu.konradlorenz.model.Ganaderia;
import co.edu.konradlorenz.model.Listas;
import co.edu.konradlorenz.model.Manager;
import co.edu.konradlorenz.model.PlazaToro;
import co.edu.konradlorenz.model.Torero;
import co.edu.konradlorenz.model.Toro;
import co.edu.konradlorenz.view.Vista;

public class Control {
	
	Vista objV = new Vista();
	
	public void run() {
		
		menuPrincipal();
		
		
		
	}
	
	public void menuPrincipal() {
		
		
			Vista.mostrarMensaje("Menu principal corridas de toros \n Ingrese el numero del menu al que quiere entrar"
					+ "\n 1:Menu de toreros"
					+ "\n 2:Menu de corridas"
					+ "\n 3: Mostrar informacion de las corridas"
					+ "\n 4: salir del programa");
			
		
		
		
		int seleccion = Vista.pedirInt();
		
		
		
		
		switch(seleccion) {
		
		case 1:
			
		menuToreros();
		
		run();
			
			
			break;
			
		case 2:
			
			menuCorridas();
			
			run();
			
			break;
			
		case 3:
			mostrarInformacion();
			run();
			break;
			
		case 4:
			
				Vista.mostrarMensaje("se ha salido del programa");
			
			System.exit(0);
		
			default:
				Vista.mostrarMensaje("este valor no es valido");
				run();
				break;
			
		
		}
		
		
	}
	
	
public void menuToreros() {
		
		Vista.mostrarMensaje("Menu de toreros"
				+ "\n 1: crear torero"
				+ "\n 2: crear manager"
				+ "\n 3: asignar manager");
	
		
		int seleccion1 = Vista.pedirInt();
		
		switch(seleccion1) {
		case 1:
			
			crearTorero();
			
			
			break;
			
		case 2:
			
			crearManager();
			
			
			break;
			
		case 3:
			
			asignarPadrino();
			
			
			
			break;
			
		case 4:
			
			asignarManager();
			
			
			
			break;
			default:
				Vista.mostrarMensaje("Ingrese un dato valido del menu");
				menuToreros();
				break;
		
		}
	}
	
public void menuCorridas() {
	
	Vista.mostrarMensaje("menu corridas"
			+ "\n 1: crear toro"
			+ "\n: 2 crear corrida"
			+ "\n 3: crear plaza toro");
		
		int seleccion2 = Vista.pedirInt();
		
		
		switch(seleccion2) {
		
		case 1:
			crearToro();
			
			
			break;
			
			
		case 2:
			crearCorrida();
			
			
		
			break;
			
			
		case 3:
			
			crearPlazaToro();
			
			break;
		case 4:
			crearGanaderia();
			break;
		
			
			default:
				Vista.mostrarMensaje("Ingrese un dato valido del menu");
				menuCorridas();
				break;
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

		
	
	
	public void crearTorero() {
		
		Listas lista = new Listas();
		Torero torero = new Torero();
		
		
		Vista.mostrarMensaje("ingrese el nombre");
		torero.setNombre(Vista.pedirString());
		Vista.mostrarMensaje("ingrese la cedula");
		torero.setCedula(Vista.pedirString());
		Vista.mostrarMensaje("ingrese el apodo");
		torero.setApodo(Vista.pedirString());
		Vista.mostrarMensaje("ingrese fecha de alternativa");
		torero.setFecha(Vista.pedirString());
		lista.setListaTorero(torero);
		
	}
	
	public void asignarPremios() {
		
		
	}
	
	public void crearManager() {
		
	
		Manager manager = new Manager();
		Listas lista = new Listas();
		
		Vista.mostrarMensaje("ingrese el nombre");
		manager.setNombre(Vista.pedirString());
		Vista.mostrarMensaje("ingrese la cedula");
		manager.setCedula(Vista.pedirString());
		Vista.mostrarMensaje("ingrese la direccion");
		manager.setDireccion(Vista.pedirString());
		Vista.mostrarMensaje("ingrese el telefono");
		manager.setTelefono(Vista.pedirString());
		lista.setListaManager(manager);
	
		
	}
	
	public void asignarPadrino() {
	
		Listas lista = new Listas();
		Torero torero = new Torero();
		int buscador = Vista.pedirInt();
		
		
		Vista.mostrarMensaje("Se mostrara la lista de toreros para asignar a uno como padrino");
		
		Vista.mostrarMensaje(lista.getListaTorero()+"");
		
		for(int i = 0; i< lista.getListaTorero1().size(); i++) {
			if(lista.getListaTorero1().get(i).equals(buscador)) {
				torero.asignarPadrino(lista.getListaTorero1().get(buscador));
				torero.setApoderado(null);
			}
			
		}
		
		
		
		
		
		
		
		
	
		
	}
	
	public void asignarManager() {
		Listas lista = new Listas();
		Torero torero = new Torero();
		
		int buscador = Vista.pedirInt();
		
		Vista.mostrarMensaje("Seleccione al manager que representara al torero");
		
Vista.mostrarMensaje(lista.getListaManager()+"");
		
		for(int i = 0; i< lista.getListaTorero1().size(); i++) {
			if(lista.getListaTorero1().get(i).equals(buscador)) {
				torero.asignarPadrino(lista.getListaTorero1().get(buscador));
				torero.setApoderado(null);
				
			}
			
		}
		
	}
	
	
	
	
	
	
	public void crearToro() {
		
		Toro toro = new Toro();
		
		Vista.mostrarMensaje("ingrese el nombre");
		toro.setNombre(Vista.pedirString());
		Vista.mostrarMensaje("ingrese el codigo");
		toro.setCodigo(Vista.pedirInt());
		Vista.mostrarMensaje("ingrese el año de nacimiento");
		toro.setAnnoNacimiento(Vista.pedirString());
		Vista.mostrarMensaje("ingrese el numero de orden");
		toro.setNumOrden(Vista.pedirInt());
		Vista.mostrarMensaje("ingrese el color");
		toro.setColor(Vista.pedirString());
		
		
		
		
	}
	
	
	
	
	
	
	public void crearCorrida() {
		
		Corrida corrida = new Corrida();
		PlazaToro plaza = new PlazaToro();
		
		Vista.mostrarMensaje("ingrese la orden de la corrida");
		corrida.setOrden(Vista.pedirByte());
		Vista.mostrarMensaje("ingrese la feria en la que se celebro la corrida");
		corrida.setFeria(Vista.pedirString());
		Vista.mostrarMensaje("ingrese el año que se celebro la feria");
		corrida.setAnno(Vista.pedirInt());
		
		plaza.setCorrida(corrida);
		
		
		
	}
	
	public void crearPlazaToro() {

		
		
		PlazaToro plaza = new PlazaToro();
		
		
		Vista.mostrarMensaje("ingrese el nombre de la plaza");
		plaza.setNombre(Vista.pedirString());
		Vista.mostrarMensaje("Ingrese la localidad en la que se ubica la plaza");
		plaza.setLocalidad(Vista.pedirString());
		Vista.mostrarMensaje("ingrese la direccion de la plaza");
		plaza.setDireccion(Vista.pedirString());
		
		
		
		
		
	}
	
	
	public void crearGanaderia() {
		
		Ganaderia ga = new Ganaderia();
		
		Vista.mostrarMensaje("ingrese el codigo");
		ga.setCodigo(Vista.pedirInt());
		
		Vista.mostrarMensaje("Ingrese la localidad");
		ga.setLocalidad(Vista.pedirString());
		Vista.mostrarMensaje("Ingrese la antiguedad");
		ga.setAntiguedad(Vista.pedirString());
		
		
	}
	
	public void mostrarInformacion() {
		
		Corrida co = new Corrida();
		Torero to = new Torero();
		PlazaToro pl = new PlazaToro();
		Toro tr = new Toro();
		Manager ma = new Manager();
		Ganaderia ga = new Ganaderia();
		
		Vista.mostrarMensaje(co.toString());
		Vista.mostrarMensaje(to.toString());
		Vista.mostrarMensaje(pl.toString());
		Vista.mostrarMensaje(tr.toString());
		Vista.mostrarMensaje(ma.toString());
		Vista.mostrarMensaje(ga.toString());
	}
	
	
	

}
