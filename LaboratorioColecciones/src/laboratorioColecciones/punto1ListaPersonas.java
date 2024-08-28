package laboratorioColecciones;

import java.util.ArrayList;

public class punto1ListaPersonas {
	
	 public static void main(String[] args) {
	        List<Persona> personas = new ArrayList<>();
	        personas.add(new Persona("Ana", 30, "Femenino"));
	        personas.add(new Persona("Juan", 25, "Masculino"));
	        personas.add(new Persona("Beatriz", 22, "Femenino"));
	        personas.add(new Persona("Carlos", 30, "Masculino"));

	        // Ordenar por nombre (usando compareTo de Comparable)
	        Collections.sort(personas);
	        System.out.println("Ordenado por nombre:");
	        for (Persona persona : personas) {
	            System.out.println(persona);
	        }

	        // Ordenar por edad (usando Comparator)
	        personas.sort(Comparator.comparingInt(Persona::getEdad));
	        System.out.println("\nOrdenado por edad:");
	        for (Persona persona : personas) {
	            System.out.println(persona);
	        }
	    }

}
