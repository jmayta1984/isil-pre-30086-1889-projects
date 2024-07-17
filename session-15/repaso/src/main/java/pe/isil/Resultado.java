package pe.isil;

public abstract class Resultado {
    protected Carrera carrera;
    protected Piloto piloto;
    
    public Resultado(Carrera carrera, Piloto piloto) {
        this.carrera = carrera;
        this.piloto = piloto;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public abstract void mostrarResultado();
}
