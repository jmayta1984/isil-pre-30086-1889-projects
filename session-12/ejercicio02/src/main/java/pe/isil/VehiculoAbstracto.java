package pe.isil;

public abstract class VehiculoAbstracto implements Vehiculo {
    private String marca;
    private String modelo;

    public VehiculoAbstracto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void encenderMotor() {
        System.out.println("Encendiendo el motor de " + marca + " " + modelo);
    }

    @Override
    public void apagarMotor() {
        System.out.println("Apagando el motor de " + marca + " " + modelo);        
    }

    

}
