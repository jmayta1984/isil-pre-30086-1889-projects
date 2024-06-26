package pe.isil;

public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo();
        dispositivo.setMensajeria(new Sms());
        dispositivo.enviarMensaje("Se acabó la clases", "Enrique Palacios");


    }
}