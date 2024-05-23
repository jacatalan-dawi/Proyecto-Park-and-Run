//EspacioEstacionamiento class en ruta ./Proyecto-Park-and-Run/src/model/EspacioEstacionamiento.java
package model;

public abstract class EspacioEstacionamiento {
    protected Vehiculo vehiculo;
    protected boolean disponible;

    public void estacionarVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.disponible = false;
    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public abstract boolean aceptaVehiculo(Vehiculo vehiculo);

    public void quitarVehiculo() {
        this.vehiculo = null;
        this.disponible = true;
    }
}
