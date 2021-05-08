package reparafix;

public class AlquilerNoEntregadoException extends Exception {
	public AlquilerNoEntregadoException() {
		super("No puede contratar porque posee dos alquileres sin devolver");
	}
}
