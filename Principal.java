package aplicacion

import dominio.*;
import java.time.LocalDate;

public class Principal{
	public static void main(String[] args){
		Persona juan m= new Persona("Juan Andres Pondal", LocalDate.of(1998,2,7));
		System.out.println(juan);
	}
}
