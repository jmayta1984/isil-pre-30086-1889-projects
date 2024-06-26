package pe.isil;

public class Auto extends VehiculoAbstracto {

    private int puertas;

    public Auto(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando el mantenido del auto: " + getMarca() + " " + getModelo());
    }

}
