package fp.vacunas;

import java.time.LocalDate;

import fp.utiles.Checkers;

public record Vacunacion(LocalDate fecha, String comunidad, Integer pfizer, 
		Integer moderna, Integer astrazeneca, Integer janssen, Integer numPersonas) implements Comparable<Vacunacion> {
	
	public Integer numTotal() {
		Integer res = this.pfizer()+this.moderna()+this.astrazeneca()+this.janssen();
		return res;
		}
		
	
	public Vacunacion{
		Checkers.check("Fecha debe ser posterior a 01/02/2021", fecha.isAfter(LocalDate.of(01, 02, 2021)));
	}
	
	public int compareTo(Vacunacion v) {
		int res = this.comunidad().compareTo(v.comunidad());
		if (res == 0) {
			res = this.fecha().compareTo(v.fecha());
		}
		return res;
	}
	
	public static Vacunacion of(LocalDate fecha, String comunidad, Integer pfizer, 
		Integer moderna, Integer astrazeneca, Integer janssen, Integer numPersonas) {
		Vacunacion v = new Vacunacion(fecha, comunidad, pfizer, moderna, astrazeneca, janssen, numPersonas);
		return v;
	}
	
	public String cadenaConFormato() {
		String res = this.fecha() + ";" + this.comunidad() + ";" + this.numPersonas() + ";" + 
	this.pfizer() + ";" + this.moderna() + ";" + this.astrazeneca() + ";" + this.janssen();
		return res;
	}

	public String toString() {
		return "Vacunacion [fecha=" + this.fecha() + ", comunidad=" + this.comunidad() + ",pfizer=" + this.pfizer() + ",moderna="+this.moderna()+",astrazeneca="+this.astrazeneca()+",janssen="+this.janssen()+
				",numPersonas="+this.numPersonas()+"]";
	}
}
