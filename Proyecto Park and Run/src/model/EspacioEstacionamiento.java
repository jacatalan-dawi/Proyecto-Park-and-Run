package model;

public abstract class EspacioEstacionamiento {
    public boolean disponible;

    public boolean estaDisponible() {
        return disponible;
    }

    public abstract boolean aceptaVehiculo(Vehiculo vehiculo);
}
