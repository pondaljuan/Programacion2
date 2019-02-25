package dominio;

import java.util.List;
import java.util.ArrayList;

public class Jubilados{

	public static List <Persona> jubiladosBucle (List<Persona> personas, List<Persona> jubilados){
		for (Persona p : listaPersonas){
			int edad=p.calcularEdad();
			if (edad>=65){
				jubilados.add(p);
			}
			return jubilados;
		}
	}

	public static List<Persona> jubiladosRecursivo(List<Persona> personas, List<Persona>jubilados){
		if (personas.isEmpty()) return jubilados;
		else if (personas.get(0).calcularEdad()>=65){
			jubilados.add(personas.get(0));
			return jubiladosRecursivo(personas.sublist(1,persona.size()), jubilados);
		}
		else return jubiladosRecursivo(personas.sublist(1,persona.size()),jubilados);
	}

	public static List<Persona> jubiladosLambda(List<personas> personas){
		return personas.stream().filter(personas.calcularEdad()>=65).collect(Collectors.toList());
	}
  
  
