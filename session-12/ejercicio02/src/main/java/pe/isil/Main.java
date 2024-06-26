package pe.isil;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Auto("Toyota", "Corolla", 4);
        Vehiculo tractor = new Tractor("Volvo", "FH16", 30000);

        Mantenimiento preventivo = new MantenimientoPreventivo();
        Mantenimiento correctivo = new MantenimientoCorrectivo();

        System.out.println("--- Mantenimiento preventivo ---");
        preventivo.realizarMantenimiento(auto);
        preventivo.realizarMantenimiento(tractor);
        System.out.println();

        System.out.println("--- Mantenimiento correctivo ---");
        correctivo.realizarMantenimiento(auto);
        correctivo.realizarMantenimiento(tractor);

    }

}