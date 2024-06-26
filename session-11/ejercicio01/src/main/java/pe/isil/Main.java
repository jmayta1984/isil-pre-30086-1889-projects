package pe.isil;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Rectangulo(100, 20);
        figura1.calcularArea();
        figura1.calcularPerimetro();
 
        Figura figura2 = new Triangulo(100, 20);
        figura2.calcularArea();
        figura2.calcularPerimetro();
    }
}