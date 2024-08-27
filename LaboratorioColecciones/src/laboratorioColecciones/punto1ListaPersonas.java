package laboratorioColecciones;

import java.util.ArrayList;

public class punto1ListaPersonas {
	
	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersonas =  new ArrayList<>();
		Persona persona1 = new Persona ("Juan", "M", 30, 170);
		Persona persona2 = new Persona ("Maria", "F", 25, 155);
		Persona persona3 = new Persona ("Alberto", "M", 19, 180);
		Persona persona4 = new Persona ("Mariana", "F", 33, 160);
		
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		listaPersonas.add(persona4);
	}
	
}
