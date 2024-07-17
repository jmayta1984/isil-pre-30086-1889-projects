package pe.isil;

public class Auto extends Vehiculo {
    private int cantidadPuertas;
    private int tarifaDiaria;

    public Auto(String placa, String marca, String modelo, int cantidadPuertas, int tarifaDiaria) {
        super(placa, marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
        this.tarifaDiaria = tarifaDiaria;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(int tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    @Override
    public double calcularTotalAlquiler(int dias) {
        return dias * tarifaDiaria;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println( "Auto [cantidadPuertas=" + cantidadPuertas + ", tarifaDiaria=" + tarifaDiaria + "]");
    }

    

    

}
