package pe.isil;

public abstract class Figura {
    private double lado;

    public Figura(double lado) {
        this.lado = lado;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void mostrarFigura(){
        System.out.print("Figura: ");
    }

}
