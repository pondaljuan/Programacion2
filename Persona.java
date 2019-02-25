package dominio

import java.time.LocalDate;
import java.time.Period;

public class Persona{
	private String nombre;
	private LocalDate fechaNacimiento;

	public Persona(String nombre, LocalDate fechaNacimiento){
		this.nombre = nombre;
		this.fechaNacimiento;

	}

	public int calcularEdad(){
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}

	@Override
	public String toString(){
		return nombre + " tiene " + calcularEdad() + "anos ";
	}
}
