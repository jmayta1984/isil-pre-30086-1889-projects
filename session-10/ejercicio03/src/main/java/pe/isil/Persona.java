package pe.isil;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " - DNI: " + this.dni;
    }

    public void comer() {
        System.out.println(this.nombre + " está almorzando.");
    }

}
