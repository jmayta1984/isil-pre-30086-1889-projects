package pe.isil;

public class EmpleadoTiempoParcial extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;
   
    public EmpleadoTiempoParcial(String nombre, int id, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas*tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
   
}
