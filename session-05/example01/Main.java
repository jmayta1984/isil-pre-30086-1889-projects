package example01;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Static fields");
        System.out.println(MathOperations.PI); 


        Rectangle rectangle = new Rectangle(100, 30);
        MathOperations.printRectanglePerimeter(rectangle);;
    
    }
}