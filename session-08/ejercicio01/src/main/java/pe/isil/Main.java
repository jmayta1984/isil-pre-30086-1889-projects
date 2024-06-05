package pe.isil;

public class Main {
    public static void main(String[] args) {
        Atleta atleta01 = new Atleta(116, "Pedro Fajardo", 44.75);
        Atleta atleta02 = new Atleta(101, "Jorge Matos", 49.30);
        Atleta atleta03 = new Atleta(112, "Ricardo Arias", 47.30);
        Atleta atleta04 = new Atleta(106, "Carlos Campos", 42.10);
        Atleta atleta05 = new Atleta(120, "Alonso Medina", 43.60);

        Competencia competencia = new Competencia();
        competencia.inscribir(atleta01);
        competencia.inscribir(atleta02);
        competencia.inscribir(atleta03);
        competencia.inscribir(atleta04);
        competencia.inscribir(atleta05);

        competencia.mostrarAtletas();

        competencia.ordernarParticipacion();

        competencia.mostrarAtletas();

        competencia.registrarTiemposCompetencia();

        competencia.mostrarAtletas();

        competencia.mostrarAtletasFinalistas(3);

        competencia.mostrarAtletasMejorMarca();
    }
}