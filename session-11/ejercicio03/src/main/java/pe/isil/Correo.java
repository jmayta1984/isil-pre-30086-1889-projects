package pe.isil;

public class Correo implements Mensajeria {

    @Override
    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("Correo enviado a " + destinatario + " con el mensaje: " + mensaje);
    }

}
