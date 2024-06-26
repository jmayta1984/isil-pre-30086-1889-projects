package pe.isil;

public class Main {
    public static void main(String[] args) {
        Almacenamiento almacenamiento = new AlmacenamientoArchivos("data.txt");
        almacenamiento.almacenarDatos("ISIL");
        almacenamiento.almacenarDatos("NRC1889");
        almacenamiento.recuperarDatos();
    }
}