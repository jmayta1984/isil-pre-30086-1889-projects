package pe.isil;

public class Main {
    public static void main(String[] args) {
        Pago pagoConTarjeta = new PagoTarjeta("6895 - 1245 - 4763 - 4657", "Marco Rivas");
        Pago pagoConPayPal = new PagoPayPal("lfuentes@gmail.com");

        ProcesadorPago procesador = new ProcesadorPago(pagoConTarjeta);
        procesador.procesarPago(70);

        procesador.setPago(pagoConPayPal);
        procesador.procesarPago(100);

    }

}