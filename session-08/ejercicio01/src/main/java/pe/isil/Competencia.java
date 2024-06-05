package pe.isil;

import java.util.ArrayList;

public class Competencia {
    private ArrayList<Atleta> atletas;

    public Competencia(){
        this.atletas = new ArrayList<>();
    }

    public void inscribir(Atleta atleta){
        this.atletas.add(atleta);
    }

    public void mostrarAtletas() {
        for(Atleta atleta: this.atletas){
            System.out.println(atleta.toString());
        }
    }
}
