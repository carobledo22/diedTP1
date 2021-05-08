package reparafix;

public class Personalizado extends Servicio {
	protected Double costo_presupuesto;
	protected Double costo_transporte;
	protected Double costo_materiales;
	
	public Double costo() {
		if (urgente = true) {
			return 1.5*(this.costo_materiales+this.costo_materiales+this.costo_transporte);
		}
		return this.costo_materiales+this.costo_materiales+this.costo_transporte;
	}
}
