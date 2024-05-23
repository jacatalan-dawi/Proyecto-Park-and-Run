//Moto class en ruta ./Proyecto-Park-and-Run/src/core/Moto.java
package model;

public class EspacioMoto extends EspacioEstacionamiento {
    public EspacioMoto() {
        disponible = true;
    }

    @Override
    public boolean aceptaVehiculo(Vehiculo vehiculo) {
        return vehiculo instanceof Moto && disponible;
    }
}
