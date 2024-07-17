package pe.isil;

public class Reserva {
    private Vehiculo vehiculo;
    private int dias;

    public Reserva(Vehiculo vehiculo, int dias) {
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    private double calcularTotalReserva() {
        return vehiculo.calcularTotalAlquiler(dias);
    }

    public void mostrarInfoReserva() {
        System.out.println("Datos de reserva: ");
        vehiculo.mostrarInfo();
        System.out.println("Días: " + dias);
        System.out.println("Monto total: " + calcularTotalReserva());
    }

}
