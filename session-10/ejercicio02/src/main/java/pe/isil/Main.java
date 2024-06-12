package pe.isil;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(15);
        notas.add(20);
        notas.add(17);
        notas.add(13);
        notas.add(18);

        Collections.sort(notas);
        System.out.println(notas);
        int indice = Collections.binarySearch(notas, 15);
        System.out.println("Indice:" + indice);

    }
}