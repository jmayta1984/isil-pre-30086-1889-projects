package pe.isil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AlmacenamientoArchivos implements Almacenamiento {

    private String ruta;

    public AlmacenamientoArchivos(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public void almacenarDatos(String datos) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true));
            writer.write(datos);
            writer.newLine();
            writer.close();
            System.out.println("Dato almacenado en archivo: " + datos);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String recuperarDatos() {

        try{
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String dato = reader.readLine();
            reader.close();
            if (dato == null) {
                return "No hay datos en el archivo";
            }
            System.out.println("Dato recuperado de archivo: " + dato);
            return dato;

        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }

}
