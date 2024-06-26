package pe.isil;

import java.util.ArrayList;
import java.util.Scanner;

public class Competencia {
    private ArrayList<Atleta> atletas;

    public Competencia() {
        this.atletas = new ArrayList<>();
    }

    public void inscribir(Atleta atleta) {
        this.atletas.add(atleta);
    }

    public void mostrarAtletas() {
        System.out.println("Lista de participantes");
        for (Atleta atleta : this.atletas) {
            System.out.println(atleta.toString());
        }
        System.out.println();
    }

    public void ordernarParticipacion() {
        for (int i = 0; i < atletas.size() - 1; i++) {
            for (int j = i + 1; j < atletas.size(); j++) {

                double marcaI = atletas.get(i).getMarcaPersonal(); // marcaPersonal del Atleta de la izquierda
                double marcaD = atletas.get(j).getMarcaPersonal(); // marcaPersonal del Atlera de la derecha

                if (marcaI < marcaD) {
                    Atleta aux = atletas.get(i);
                    atletas.set(i, atletas.get(j));
                    atletas.set(j, aux);
                }
            }
        }
    }

    public void registrarTiemposCompetencia() {
        Scanner scanner = new Scanner(System.in);
        for (Atleta atleta : this.atletas) {
            System.out.println("Ingrese el tiempo de competencia de: " + atleta.getNombre());
            double tiempo = scanner.nextDouble();
            atleta.setTiempoCompetencia(tiempo);
        }
        scanner.close();
    }

    public void ordernarCompetencia() {
        for (int i = 0; i < atletas.size() - 1; i++) {
            for (int j = i + 1; j < atletas.size(); j++) {

                double marcaI = atletas.get(i).getTiempoCompetencia(); // tiempoCompetencia del Atleta de la izquierda
                double marcaD = atletas.get(j).getTiempoCompetencia(); // tiempoCompetencia del Atlera de la derecha

                if (marcaI > marcaD) {
                    Atleta aux = atletas.get(i);
                    atletas.set(i, atletas.get(j));
                    atletas.set(j, aux);
                }
            }
        }
    }

    public void mostrarAtletasFinalistas(int cantidad) {
        this.ordernarCompetencia();
        System.out.println("Finalistas");
        for (int position = 0; (position < cantidad) && (position < atletas.size()); position++) {
            System.out.println(atletas.get(position).toString());
        }
    }

    public void mostrarAtletasMejorMarca() {
        System.out.println("Atletas que mejoraron su marca personal");
        for (Atleta atleta : this.atletas) {
            if (atleta.getTiempoCompetencia() < atleta.getMarcaPersonal()) {
                System.out.println(atleta.toString());
            }
        }
    }
}
