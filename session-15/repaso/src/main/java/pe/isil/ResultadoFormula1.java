package pe.isil;

public class ResultadoFormula1 extends Resultado {
    private int puesto;
    private int puntos;

    public ResultadoFormula1(Carrera carrera, Piloto piloto, int puesto) {
        super(carrera, piloto);
        this.puesto = puesto;
        this.puntos = calcularPuntos();
    }

    private int calcularPuntos() {
        switch (puesto) {
            case 1:
                return 25;
            case 2:
                return 18;
            case 3:
                return 15;
            case 4:
                return 12;
            case 5:
                return 10;
            default:
                return 0;
        }
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public void mostrarResultado() {
        carrera.mostrarInfo();
        piloto.mostrarInfo();
        System.out.println("Puesto: " + puesto);
        System.out.println("Puntos: " + puntos);
    }

}
