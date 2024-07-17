package pe.isil;

public class Main {
    public static void main(String[] args) {

        Carrera carreraMotoGP = new Carrera("GP-001", "Gran Premio de Catar", 2024, "Lusail International Circuit",
                "Doha", "Catar");

        Escuderia escuderia = new Escuderia(1, "Ducati Lenovo", "Italia");

        Piloto piloto = new Piloto(1, "Francesco", "Bagnaia", "Italia", escuderia);

        Resultado resultadoMotoGP = new ResultadoMotoGP(carreraMotoGP, piloto, 3, 1);

        resultadoMotoGP.mostrarResultado();

    }
}