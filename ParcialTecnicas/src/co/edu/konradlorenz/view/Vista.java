package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Vista {
	
	static public Scanner sc = new Scanner(System.in);
	
	 public void mostrarMensaje(String mensaje) {
		
		System.out.println(mensaje);
		
	}
	 
	public static String pedirString() {
		
		return sc.nextLine();
	}
	public static int pedirInt() {
		return sc.nextInt();
	}
	public static byte pedirByte() {
		return sc.nextByte();
		
	}
	
	public static boolean pedirBoolean() {
		
		return sc.nextBoolean();
	}

}
