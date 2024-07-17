package pe.isil;

public class ResultadoMotoGP extends Resultado {
    private int puestoSprint;
    private int puestoPrincipal;
    private int puntos;

    public ResultadoMotoGP(Carrera carrera, Piloto piloto, int puestoSprint, int puestoPrincipal, int puntos) {
        super(carrera, piloto);
        this.puestoSprint = puestoSprint;
        this.puestoPrincipal = puestoPrincipal;
        this.puntos = calcularPuntos();
    }

    private int calcularPuntos() {
        int puntosSprint = 0;
        int puntosPrincipal = 0;

        switch (puestoSprint) {
            case 1:
                puntosSprint = 12;
                break;
            case 2:
                puntosSprint = 9;
                break;
            case 3:
                puntosSprint = 7;
                break;
            case 4:
                puntosSprint = 6;
                break;
            case 5:
                puntosSprint = 5;
                break;
        }

        switch (puestoPrincipal) {
            case 1:
                puntosPrincipal = 25;
                break;
            case 2:
                puntosPrincipal = 20;
                break;
            case 3:
                puntosPrincipal = 16;
                break;
            case 4:
                puntosPrincipal = 13;
                break;
            case 5:
                puntosPrincipal = 11;
                break;
        }

        return puntosSprint + puntosPrincipal;
    }

    public int getPuestoSprint() {
        return puestoSprint;
    }

    public void setPuestoSprint(int puestoSprint) {
        this.puestoSprint = puestoSprint;
    }

    public int getPuestoPrincipal() {
        return puestoPrincipal;
    }

    public void setPuestoPrincipal(int puestoPrincipal) {
        this.puestoPrincipal = puestoPrincipal;
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
        System.out.println("Puesto Sprint: " + puestoSprint);
        System.out.println("Puesto Sprint: " + puestoPrincipal);
        System.out.println("Puntos: " + puntos);
    }

}
