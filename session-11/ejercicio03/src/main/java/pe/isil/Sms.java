package pe.isil;

public class Sms implements Mensajeria {

    @Override
    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("SMS enviado a " + destinatario + " con el mensaje de: " + mensaje);
    }

}
