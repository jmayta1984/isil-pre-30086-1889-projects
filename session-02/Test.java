public class Test {
    public static void main(String[] args) {
        // greeting("Carmen");
        System.out.println(validateNumbers(5, 5, 5, 5));
    }

    public static void myMethod() {
        System.out.println("Hello, ISIL");
    }

    // El método greeting debe imprimir: "Hi, " + nombre
    public static void greeting(String name) {
        System.out.println("Hi, " + name);
    }

    // Crear un método que retorne el área de un rectángulo
    // base y altura
    public static int area(int width, int height) {
        return width * height;
    }

    public static int perimeter(int width, int height) {
        return 2 * (width + height);
    }

    // Crear un método que imprima en pantalla el área y el perimétro de un
    // rectángulo

    public static void showArea(int width, int height) {
        System.out.println("The area is: " + area(width, height));
        System.out.println("The perimeter is: " + perimeter(width, height));
    }

    // Crear un método que reciba 4 enteros y que retorne si los 4 enteros son
    // iguales o no
    public static String validateNumbers(int a, int b, int c, int d) {
        if ((a == b) && (b == c) && (c == d)) {
            return "Son iguales";
        }
        return "Son diferentes";
    }

}
