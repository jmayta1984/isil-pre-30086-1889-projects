package pe.isil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numerosAleatorios = generarNumerosAleatorio(5);
        System.out.println(numerosAleatorios);
        imprimirListado(numerosAleatorios);
        int max = valorMaximo(numerosAleatorios);
        System.out.println("El valor máximo es: " + max);
        ArrayList<Integer> numerosOrdenados = ordenarAscedentemente(numerosAleatorios);
        imprimirListado(numerosOrdenados);
    }

    private static int valorMaximo(ArrayList<Integer> numerosAleatorios) {

        int maximo = numerosAleatorios.get(0);

        if (numerosAleatorios.size() >= 2) {
            for (int i = 1; i <= numerosAleatorios.size() - 1; i++) {
                if (maximo < numerosAleatorios.get(i)) {
                    maximo = numerosAleatorios.get(i);
                }
            }
        }
        return maximo;
    }

    private static void imprimirListado(ArrayList<Integer> numerosAleatorios) {
        for (Integer numero : numerosAleatorios) {
            System.out.println(numero);
        }
    }

    public static ArrayList<Integer> generarNumerosAleatorio(int cantidad) {
        ArrayList<Integer> numeros = new ArrayList<>();

        int numeroAleatorio;
        for (int i = 1; i <= cantidad; i++) {
            numeroAleatorio = (int) (Math.random() * 20 + 1);
            numeros.add(numeroAleatorio);
        }
        return numeros;
    }

    public static ArrayList<Integer> ordenarAscedentemente(ArrayList<Integer> numerosAleatorios) {
        ArrayList<Integer> numeros = numerosAleatorios;

        for (int i = 0; i < numeros.size() - 1; i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                  if (numeros.get(i) > numeros.get(j)) {
                    int aux = numeros.get(i);
                    numeros.set(i, numeros.get(j));
                    numeros.set(j, aux);
                  }  
            }
        }

        return numeros;

    }

}