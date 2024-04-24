import java.util.Scanner;

public class WhileDeclaration {

    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        System.out.println("Ingrese un número");

        int number = scannner.nextInt();

        WhileDeclaration.printEvenNumbers(number);

        // WhileDeclaration.sayHello(number);

        scannner.close();
    }

    public static void sayHello(int number) {
        int count = 0;

        while (count < number) {
            count++;
            System.out.println("Hello, " + count);
        }
    }

    /*
     * Ejercicio 6
     * Crear una función que imprima los números pares entre 1 yn
     */

    public static void printOddNumbers(int number) {
        int count = 0;
        while (count < number) {
            count++;
            if (Main.isOdd(count)) {
                System.out.println(count);
            }
        }
    }

    /*
     * Ejercicio 7
     * Crear una función que imprima los números impares entre 1 y n
     * Debe imprimr de mayor a menor 
     */
    public static void printEvenNumbers(int number) {
        int count = number;
        do {
            if (!Main.isOdd(count)) {
                System.out.println(count);
            }
            count--;
        } while (count > 0);
    }
}
