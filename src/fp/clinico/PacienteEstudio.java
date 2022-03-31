package fp.clinico;

import fp.utiles.Checkers;

public record PacienteEstudio(String id, String genero, Double edad,
		Boolean hipertension, Boolean enfermedadCorazon, TipoResidencia tipoResidencia,
		Double nivelMedioGlucosa) implements Comparable<PacienteEstudio>{
	
	public PacienteEstudio{
		Checkers.check("Límites edad", this.edad()>=0  && this.edad()<= 130);
		Checkers.check("Nivel de glucosa", this.nivelMedioGlucosa()>=0);
	}
	
	public Boolean factorRiesgo(){
		Boolean res = null;
		if(this.hipertension()==true && this.edad()>40) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}
	
	public String toString() {
		return "PacienteEstudio [id=" + this.id() + ", edad=" + this.edad() + "]";
	}
	
	public int compareTo(PacienteEstudio p) {
		int res = this.edad().compareTo(p.edad());
		if(res == 0) {
			res = this.id().compareTo(p.id());
		}
		return res;
	}
	public static PacienteEstudio of(String id, String genero,
			Double edad, Boolean hipertension, Boolean enfermedadCorazon, TipoResidencia tipoResidencia, Double nivelMedioGlucosa) {
			PacienteEstudio res = new PacienteEstudio(id, genero, edad, hipertension, enfermedadCorazon, tipoResidencia, nivelMedioGlucosa);
			return res;
		}
	
	public String cadenaConFormato() {
		String res = this.id() + ";" + this.genero() + ";" + this.edad() + ";" + this.hipertension() + 
				";" + this.enfermedadCorazon() + ";" + this.tipoResidencia() + ";" + this.nivelMedioGlucosa();
		return res;
	}

}
