package reparafix;

public class NoCoincideOficioException extends Exception {
	public NoCoincideOficioException() {
		super("El oficio del trabajador no coincide con el de la tarea a asignar");
	}
}
