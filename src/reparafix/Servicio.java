package reparafix;


public abstract class Servicio {
	public static Oficio oficio;
	public static Trabajador trabajador;
	public static Boolean urgente;
	public abstract Double costo();
	
	public String getOficio() {
		return oficio.nombre;
	}
}
