package pe.isil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        File salidaArchivo = new File("salida.txt");
        FileOutputStream flujoSalidaArchivo = null;

        try {
            flujoSalidaArchivo = new FileOutputStream(salidaArchivo);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        if (flujoSalidaArchivo != null ) {
            PrintStream salida = new PrintStream(flujoSalidaArchivo);
            System.setOut(salida);
    
            System.out.println("Hola ISIL");
            salida.close();
        }
        
    }
}