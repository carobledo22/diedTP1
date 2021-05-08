package reparafix;
import java.util.ArrayList;

public class Trabajador {
	ArrayList <Trabajo> trabajosAsignados = new ArrayList<>();
	protected String nombre;
	protected String eMail;
	protected Oficio oficio;
	protected Float costo_hora;
	protected Float porcentaje_com;
	
	Double comision(Double montoFijo) {
		return montoFijo*porcentaje_com;
	}
	public Boolean agregarTrabajo(Trabajo t) throws Exception{
		if(t.getOficio() != oficio.getNombre())
			throw new  NoCoincideOficioException();
		Int i = 0;
		while(i < trabajosAsignados.size()) {
			if(t.getFechaFin().compareTo(trabajosAsignados.get(i).getFechaFin())>=0) 
				throw new AgendaOcupadaException();
			i++;
		}
		return trabajosAsignados.add(t);
		
	}
}
