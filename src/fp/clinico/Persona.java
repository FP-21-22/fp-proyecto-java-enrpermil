package fp.clinico;

import java.time.LocalDate;
import java.time.Period;

import fp.utiles.Checkers;

public record Persona(String nombre, String apellidos,
		String dni, LocalDate fechanacimiento) implements Comparable<Persona> {

	public Integer edad() {
		LocalDate hoy = LocalDate.now();
		Integer res = Period.between(this.fechanacimiento, hoy).getYears();
		
		return res;
	}
	
	public Persona{
		Checkers.check("Fecha de nacimiento no puede ser anterior a la fecha actual", this.fechanacimiento().isBefore(LocalDate.now()));
	}
	
	public static Persona of(String nombre, String apellidos,
		String dni, LocalDate fechanacimiento) {
		Persona res = new Persona(nombre, apellidos, dni, fechanacimiento);
		return res;
	}
	
	public String cadenaConFormato() {
		String res = this.nombre() + "," + this.apellidos() + "," + this.dni() + this.fechanacimiento();
		return res;
	}
	
	public int compareTo(Persona p) {
		int res = this.dni().compareTo(p.dni());
		return res;
	}
}