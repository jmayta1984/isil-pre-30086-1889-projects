package pe.isil;

public class Main {
    public static void main(String[] args) {

        String saludo = "Hello World!";
        System.out.println(saludo.charAt(0));

        System.out.println(saludo.compareToIgnoreCase("Hello world!"));

        System.out.println(saludo.concat(": Móviles"));

        System.out.println(saludo.equals("Hello World!")); 

        System.out.println(saludo.indexOf("hola"));
        System.out.println(saludo.length());
        System.out.println(saludo.replace("o", "e"));
        System.out.println(saludo.substring(6));
        System.out.println(saludo.toLowerCase());
        System.out.println(saludo.toUpperCase());
    }
}