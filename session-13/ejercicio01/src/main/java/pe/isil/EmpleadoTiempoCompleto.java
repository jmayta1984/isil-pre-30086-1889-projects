package pe.isil;

public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, int id, double salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }    
    
}
