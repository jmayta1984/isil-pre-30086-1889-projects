package pe.isil;

public class ProcesadorPago {

    private Pago pago;

    public ProcesadorPago(Pago pago) {
        this.pago = pago;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public void procesarPago(double monto) {
        pago.procesarPago(monto);
    }

}

