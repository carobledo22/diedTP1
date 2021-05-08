package reparafix;
import java.util.Calendar;

public class Alquiler implements Contratable{
	protected Herramienta herramienta;
	protected Calendar fechaInicio;
	protected Calendar fechaFin;
	
	public Double precio() {
		if(fechaFin!=null)
			return herramienta.getCostoxDia()*(fechaFin.compareTo(fechaFin)/(24*60*60*1000));
	}
	public Boolean enMora() {
		return fechaFin.compareTo(Calendar.getInstance()) < 0;		
	}
	public Boolean enMora(Calendar fecha_dev) {
		return fechaFin.compareTo(fecha_dev) < 0;
	}
	public Boolean finalizado() {
		return fechaFin.compareTo(Calendar.getInstance()) < 0;
	}
	public Alquiler(Calendar fechaI, Herramienta h) {
		herramienta = h;
		fechaInicio = fechaI;
		fechaFin = null;
	};
	public Alquiler(Calendar fechaI,Calendar fechaF,Herramienta h) {
		herramienta = h;
		fechaInicio = fechaI;
		fechaFin = fechaF;
	};
	
}
