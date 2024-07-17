package pe.isil;

public class Camioneta extends Vehiculo {
    private double capacidadCarga;
    private double tarifaDiaria;

    public Camioneta(String placa, String marca, String modelo, double capacidadCarga, double tarifaDiaria) {
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
        this.tarifaDiaria = tarifaDiaria;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(double tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    @Override
    public double calcularTotalAlquiler(int dias) {
        return dias * tarifaDiaria;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(
                "Camioneta [capacidadCarga=" + capacidadCarga + ", tarifaDiaria=" + tarifaDiaria + "]");
    }

}
