package pe.isil;

public class Main {
    public static void main(String[] args) {
        Atleta atleta01 = new Atleta(116, "Pedro Fajardo", 44.75);
        Atleta atleta02 = new Atleta(101, "Jorge Matos", 49.30);

        Competencia competencia = new Competencia();
        competencia.inscribir(atleta01);
        competencia.inscribir(atleta02);

        competencia.mostrarAtletas();


    }
}