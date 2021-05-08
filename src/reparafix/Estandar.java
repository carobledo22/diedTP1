package reparafix;
import reparafix.Estandar;

public class Estandar extends Servicio {
	protected Double monto_fijo;
	
	public Double costo() {
		if(urgente == true) {
			return monto_fijo+trabajador.comision(monto_fijo)+0.5*(monto_fijo+trabajador.comision(monto_fijo));
			}
		return monto_fijo+trabajador.comision(monto_fijo);
	}
}
