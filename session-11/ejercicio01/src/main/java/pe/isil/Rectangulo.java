package pe.isil;

public class Rectangulo extends Figura {
    private double altura;

    public Rectangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area;
        area = altura * getLado();
        System.out.println("El área es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro;
        perimetro = (altura + getLado()) * 2;
        System.out.println("El perímetro es: " + perimetro);
    }

}
