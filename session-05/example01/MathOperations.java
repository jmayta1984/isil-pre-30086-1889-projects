package example01;
public class MathOperations {

    /*
     * Class fields
     */

    public static final double PI = 3.14;
    
    /*
     * Class methods
     */
    public static int sum(int a, int b) {
        return a + b;
    };

    public static int factorial(int number) {
        if (number <= 0) {
            System.out.println("No se puede calcular el factorial de un número negativo");
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
             result = result * i;   
        }
        return result;
    }

    /*
     * Dependencia
     */
    public static void printRectanglePerimeter(Rectangle rectangle){
        System.out.println(rectangle.calculatePerimeter());
    }

}
