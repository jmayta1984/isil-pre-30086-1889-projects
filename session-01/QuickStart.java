// Upper camel case: utilizado para nombrar las clases
// Lower camel case: utilizado para nombras los atributos y métodos de las clases
public class QuickStart {

    private static void greeting(String name) {
        System.out.println("Hello, " + name);
        System.out.println("");

    }

    private static void arithmeticOperations(int a, int b) {

        System.out.println("Arithmetic operations");

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modular operator
        System.out.println("a % b = " + (a % b));

        System.out.println("");
    }

    public static void main(String[] args) {

        // greeting
        greeting("Miraflores");

        // arithmeticOperations
        arithmeticOperations(15, 2);

        // logicalOperations
        logicalOperations();

        // ternaryOperation
        ternaryOperation();

        // relationalOperations
        relationalOperations();

        //instanceofOperation
        instanceofOperation();
    }

    private static void instanceofOperation() {
        String str = "ISIL";
        boolean result;

        System.out.println("instanceof Operation");
        result = str instanceof String;

        System.out.println("Is str and instance of String? " + result);
    }

    private static void relationalOperations() {

        int a = 7, b = 11;

        System.out.println("Relational Operations");
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println("");
    }

    private static void ternaryOperation() {
        int februaryDays = 29;
        String result;

        System.out.println("Ternary operation");
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);

        System.out.println("");

    }

    private static void logicalOperations() {
        // declare variables

        int a = 5, b = 3, c = 8;

        System.out.println("Logical Operations");

        // && operator
        System.out.println((a > b) && (c > b));
        System.out.println((a > b) && (c < b));

        // || operator
        System.out.println((a > b) || (c > b));
        System.out.println((a < b) || (c < b));

        // ! operator
        System.out.println(!(a == b));

        System.out.println("");
    }
}
