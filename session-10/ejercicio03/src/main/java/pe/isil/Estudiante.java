package pe.isil;

public class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String nombre, int edad, String dni, String carrera) {
        super(nombre, edad, dni);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + " - Carrera: " + carrera;
    }

    public void estudiar() {
        System.out.println(getNombre() + " estudia la carrera de " + carrera);
    }

}
