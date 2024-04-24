import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 
        int number = scanner.nextInt();
        System.out.println(Main.sumFirstNaturals(number));
        System.out.println(Main.isOdd(number));
        Main.showIfNumberIsOdd(number);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Max number: " + Main.maxNumber(a, b));
        */
        System.out.println("Ingrese el número del día de la semana");
        int day = scanner.nextInt();
        Main.showWeekDay(day);
        scanner.close();
    }

    /*
     * Ejercicio 1
     * Crear una función que retorne la suma de los primeros n números naturales
     * Considerar a n como parámetro
     */
    public static int sumFirstNaturals(int number) {
        return number * (number + 1) / 2;
    }

    /*
     * Ejercicio 2
     * Crear una funcion que reciba como parámetro un número entero, y retorne
     * verdadero si
     * el número es par o falso si el número es impar
     */
    public static boolean isOdd(int number) {
        return ((number % 2) == 0);
    }

    /*
     * Ejercicio 3
     * Crear una función que reciba como parámetro un número entero, e imprima en
     * consola si es un número par o si es un número impar
     */
    public static void showIfNumberIsOdd(int number) {
        if (isOdd(number)) {
            System.out.println("Es par");
            return;
        }
        System.out.println("Es impar");

    }

    public static void greeting() {
        System.out.println("Hi, ISIL");
        return;
    }

    /*
     * Ejercicio 4
     * Crear una función que reciba dos números enteros como parámetro y retorne el
     * mayor número
     */

    public static int maxNumber(int a, int b) {
        return (a > b) ? a : b;
    }

    /*
     * Ejercicio 5
     * Crear una función que reciba como parámetro el día de la semana en número y
     * imprima el día de la semana en letras
     */

    public static void showWeekDay(int number) {

        switch (number) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Por favor, ingrese un número entre 1 y 7");
                break;
        }
    }
}