package reparafix;
import java.util.ArrayList;
import reparafix.Contratable;

public class Usuario {
	protected String eMail;
	protected ArrayList <Contratable> itemsContratados;
	
	public Boolean contratar (Contratable c) throws AlquilerNoEntregadoException{
		Int i =0;
		Int j = 0;
		while(j<itemsContratados.size()) {
			if(itemsContratados.get(i) instanceof Alquiler && !c.finalizado()) i++;
			j++;
		}
		if(i > 2) {
			throw new AlquilerNoEntregadoException();
			return false;
		}
		itemsContratados.add(c);
		return true;
		
		
		
	}
}
