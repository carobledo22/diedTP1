package reparafix;
import java.util.Calendar;
public class Trabajo implements Contratable{
	
	protected Trabajador trabajador;
	protected Servicio servicio;
	protected Boolean es_urgente;
	protected Calendar fechaFin;
	
	public Double precio() {
		return null;
	}
	public Boolean finalizado() {
		return fechaFin != null;
	}
	public String getOficio(){
		return servicio.getOficio();
	}
	public Calendar getFechaFin() {
		return fechaFin;
	}
}
