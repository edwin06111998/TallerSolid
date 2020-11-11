package Adicionales;

public abstract class Aderezo {
	private String nombre;
	
	public Aderezo() {}	// Constructor por defecto	
	
	public void setNombreAderezo(String nombre) {
		//se actualiza el nombre
		this.nombre = nombre;
	}
	
	public String toString() {
		//Devolvemos el nombre del aderezo en Mayusculas
		return nombre.toUpperCase();		
	}
	
}
