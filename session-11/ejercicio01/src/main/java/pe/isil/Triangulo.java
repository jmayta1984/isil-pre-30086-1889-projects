package pe.isil;

public class Triangulo extends Figura {
    private double altura;

    public Triangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area;
        area = getLado() * altura / 2;
        System.out.println("El área es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro;
        perimetro = getLado() * 3;
        System.out.println("El perímetro es: " + perimetro);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
