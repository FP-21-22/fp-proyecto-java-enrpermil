package fp.clinico;

import java.time.LocalDateTime;
import fp.utiles.Checkers;

public record Paciente(Persona persona, String codIngreso, LocalDateTime fechahora) {
	
	public Paciente{
		Checkers.check("Fecha y hora de ingreso debe ser anterior a la actual", this.fechahora().isBefore(LocalDateTime.now()));
	}
	

	public static Paciente of(Persona persona, String codIngreso, LocalDateTime fechahora) {
		Paciente res = new Paciente(persona, codIngreso, fechahora);
		return res;
	}
	
	public static Paciente of1(Persona persona, String codIngreso, LocalDateTime fechahora) {
		Paciente res = new Paciente(persona, codIngreso, fechahora);
		return res;
	}
}
