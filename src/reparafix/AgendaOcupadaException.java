package reparafix;

public class AgendaOcupadaException extends Exception {
	public AgendaOcupadaException(){
		super("El trabajador tiene la agenda ocupada para agregarle m�s tareas");
	}
}
