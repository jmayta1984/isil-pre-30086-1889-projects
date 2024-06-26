package pe.isil;

public class MantenimientoCorrectivo implements Mantenimiento {

    @Override
    public void realizarMantenimiento(Vehiculo vehiculo) {
        System.out.println("Realizando el mantenimiento correctivo");
        vehiculo.realizarMantenimiento();
    }

}
