package pe.isil;

public class Dispositivo {
    private Mensajeria mensajeria;

    public void setMensajeria(Mensajeria mensajeria) {
        this.mensajeria = mensajeria;
    }

    public void enviarMensaje(String mensaje, String destinatario) {
        mensajeria.enviarMensaje(mensaje, destinatario);
    }
}
