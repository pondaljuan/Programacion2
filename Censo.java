package dominio

import java.util.Arraylist;
import java.util.List;

public class Censo{
	private List<Persona> listaPersonas = new Arraylist<>();

	public void annadirPersona(Persona persona){
		listaPersonas.add(persona);
	}

	public double mediaEdades(){
		return listaPersonas.stream().map(persona -> persona.calcularEdad()).
			reduce(0, (a, b) -> a + b)/listaPersonas.size();
	}
}
