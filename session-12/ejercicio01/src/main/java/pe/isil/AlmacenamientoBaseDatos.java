package pe.isil;

import java.util.ArrayList;

public class AlmacenamientoBaseDatos implements Almacenamiento {
    private ArrayList<String> base;

    public AlmacenamientoBaseDatos() {
        base = new ArrayList<>();
    }

    @Override
    public void almacenarDatos(String datos) {
        base.add(datos);
    }

    @Override
    public String recuperarDatos() {
        if (base.isEmpty()) {
            return "No hay datos almacenados";
        }
        String dato = base.get(base.size() - 1);
        System.out.println("Dato recuperado de base de datos: " + dato);
        return dato;
    }

}
