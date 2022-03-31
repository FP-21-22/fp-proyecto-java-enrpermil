package fp.clinico.test;

import java.time.LocalDate;

import fp.clinico.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = Persona.of("Pepe", "García Sánchez", 
				"3344556677X", LocalDate.of(1998, 3, 8));
		
		System.out.println("p1.nombre(): "+p1.nombre());
		System.out.println("p1.apellidos(): "+p1.apellidos());
		System.out.println("p1.edad(): "+p1.edad());
	}

}
