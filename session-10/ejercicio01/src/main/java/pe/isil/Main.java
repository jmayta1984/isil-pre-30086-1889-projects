package pe.isil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        System.out.println(personas.isEmpty());

        Persona persona01 = new Persona("Juan", 25);
        Persona persona02 = new Persona("Carlos", 20);
        Persona persona03 = new Persona("Pedro", 26);
        Persona persona04 = new Persona("Ana", 18);
        Persona persona05 = new Persona("Carmen", 27);

        personas.add(persona01);
        personas.add(persona02);
        personas.add(persona03);
        personas.add(persona04);
        personas.add(persona05);

        /*
         * for (Persona persona: personas){
         * System.out.println(persona.toString());
         * }
         * 
         * for (int i = 0; i <personas.size(); i++){
         * System.out.println(personas.get(i).toString());
         * }
         */
        Comparator<Persona> comparator = new Comparator<>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                int edad1 = p1.getEdad();
                int edad2 = p2.getEdad();
                return edad2 - edad1;
            }
        };

        Collections.sort(personas, comparator);

        personas.forEach((persona) -> System.out.println(persona.toString()));

        int indice = Collections.binarySearch(personas, persona05, comparator);
        System.out.println("Índice: " + indice);

    }
}