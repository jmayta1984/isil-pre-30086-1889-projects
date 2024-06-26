package pe.isil;

public class Profesor extends Persona {
    private String especializacion;

    public Profesor(String nombre, int edad, String dni, String especializacion) {
        super(nombre, edad, dni);
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public String toString() {
        return super.toString() + " - Especialización: " + especializacion;
    }
}
