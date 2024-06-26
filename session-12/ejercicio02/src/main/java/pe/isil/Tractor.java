package pe.isil;

public class Tractor extends VehiculoAbstracto {
    private int capacidadCarga;

    public Tractor(String marca, String modelo, int capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando el mantenimiento del tractor: " + getMarca() + " " + getModelo());
    }

}
