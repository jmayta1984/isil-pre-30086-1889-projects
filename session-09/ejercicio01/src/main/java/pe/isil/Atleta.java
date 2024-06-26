package pe.isil;

public class Atleta {
    private int numero;
    private String nombre;
    private double marcaPersonal;
    private double tiempoCompetencia;

    public Atleta(int numero, String nombre, double marcaPersonal) {
        this.numero = numero;
        this.nombre = nombre;
        this.marcaPersonal = marcaPersonal;
        this.tiempoCompetencia = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMarcaPersonal() {
        return marcaPersonal;
    }

    public void setMarcaPersonal(double marcaPersonal) {
        this.marcaPersonal = marcaPersonal;
    }

    public double getTiempoCompetencia() {
        return tiempoCompetencia;
    }

    public void setTiempoCompetencia(double tiempoCompetencia) {
        this.tiempoCompetencia = tiempoCompetencia;
    }

    @Override
    public String toString() {
        return numero + " - " + nombre + " - " + marcaPersonal + " - " + tiempoCompetencia;
    }

}
