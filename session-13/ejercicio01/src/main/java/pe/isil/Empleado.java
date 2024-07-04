package pe.isil;

public abstract class Empleado {

    private String nombre;
    private int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double calcularSalario();

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " - ID: " + id);
    }
}
