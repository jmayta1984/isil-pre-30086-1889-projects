package pe.isil;

public class MantenimientoPreventivo implements Mantenimiento {

    @Override
    public void realizarMantenimiento(Vehiculo vehiculo) {
        System.out.println("Realizando mantenimiento preventido.");
        vehiculo.realizarMantenimiento();
    }

}
