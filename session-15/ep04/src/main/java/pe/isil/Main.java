package pe.isil;

public class Main {
    public static void main(String[] args) {
        // Reserva 1
        Vehiculo auto = new Auto("CJJ789", "Kia", "Cerato", 4, 100);

        Reserva reservaAuto = new Reserva(auto, 10);
        reservaAuto.mostrarInfoReserva();

        // Reserva 2
        Vehiculo camioneta = new Auto("MTY123", "Toyota", "Yaris", 4, 80);

        Reserva reservaCamioneta = new Reserva(camioneta, 5);
        reservaCamioneta.mostrarInfoReserva();

    }
}