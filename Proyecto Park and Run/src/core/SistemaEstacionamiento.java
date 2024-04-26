package core;

import model.EspacioCoche;
import model.EspacioEstacionamiento;
import model.EspacioMoto;
import model.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class SistemaEstacionamiento {
    private List<EspacioEstacionamiento> espacios;

    public SistemaEstacionamiento(int numEspaciosMoto, int numEspaciosCoche) {
        espacios = new ArrayList<>();
        for (int i = 0; i < numEspaciosMoto; i++) {
            espacios.add(new EspacioMoto());
        }
        for (int i = 0; i < numEspaciosCoche; i++) {
            espacios.add(new EspacioCoche());
        }
    }

    public boolean estacionarVehiculo(Vehiculo vehiculo) {
        for (EspacioEstacionamiento espacio : espacios) {
            if (espacio.aceptaVehiculo(vehiculo)) {
                espacio.disponible = false;
                return true;
            }
        }
        return false;
    }

    public int obtenerIngresos() {
        int ingresos = 0;
        for (EspacioEstacionamiento espacio : espacios) {
            if (!espacio.estaDisponible()) {
                ingresos += espacio instanceof EspacioMoto ? 2 : 4;
            }
        }
        return ingresos;
    }

    public void informeOcupacion() {
        int motos = 0, coches = 0;
        for (EspacioEstacionamiento espacio : espacios) {
            if (!espacio.estaDisponible()) {
                if (espacio instanceof EspacioMoto) {
                    motos++;
                } else {
                    coches++;
                }
            }
        }
        System.out.println("Ocupación actual:");
        System.out.println("Motos: " + motos);
        System.out.println("Coches: " + coches);
        System.out.println("Ingresos totales: " + obtenerIngresos() + " euros");
    }
}
