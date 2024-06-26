package pe.isil;

public class PagoTarjeta implements Pago {
    private String numeroTarjeta;
    private String cliente;

    public PagoTarjeta(String numeroTarjeta, String cliente) {
        this.numeroTarjeta = numeroTarjeta;
        this.cliente = cliente;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando el pago con la tarjeta " + numeroTarjeta + " para el monto de: " + monto);
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    

}
