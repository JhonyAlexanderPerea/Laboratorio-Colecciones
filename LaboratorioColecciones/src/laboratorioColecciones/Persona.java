package laboratorioColecciones;

class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        return this.nombre.compareTo(otraPersona.getNombre());
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero;
    }
}

