package model;

public class EspacioCoche extends EspacioEstacionamiento {
    public EspacioCoche() {
        disponible = true;
    }

    @Override
    public boolean aceptaVehiculo(Vehiculo vehiculo) {
        return vehiculo instanceof Coche && disponible;
    }
}
