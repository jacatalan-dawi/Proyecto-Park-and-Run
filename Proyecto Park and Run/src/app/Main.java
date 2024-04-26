package app;

import core.SistemaEstacionamiento;
import model.Coche;
import model.Moto;
import model.Vehiculo;

public class Main {
    public static void main(String[] args) {
        // Crear un sistema de estacionamiento con 5 espacios para motos y 3 para coches
        SistemaEstacionamiento sistema = new SistemaEstacionamiento(5, 4);

        // Simular estacionamiento de vehículos
        Vehiculo moto1 = new Moto();
        Vehiculo moto2 = new Moto();
        Vehiculo coche1 = new Coche();
        Vehiculo coche2 = new Coche();
        Vehiculo coche3 = new Coche();
        Vehiculo coche4 = new Coche();
        Vehiculo coche5 = new Coche();
        Vehiculo coche6 = new Coche();

        // Estacionar vehículos
        boolean estacionadoMoto = sistema.estacionarVehiculo(moto1);
        boolean estacionadoMoto2 = sistema.estacionarVehiculo(moto2);
        boolean estacionadoCoche1 = sistema.estacionarVehiculo(coche1);
        boolean estacionadoCoche2 = sistema.estacionarVehiculo(coche2);
        boolean estacionadoCoche3 = sistema.estacionarVehiculo(coche3);
        boolean estacionadoCoche4 = sistema.estacionarVehiculo(coche4);
        boolean estacionadoCoche5 = sistema.estacionarVehiculo(coche5);
        boolean estacionadoCoche6 = sistema.estacionarVehiculo(coche6);

        // Verificar si los vehículos fueron estacionados correctamente
        if (estacionadoMoto) {
            System.out.println("Moto 1 estacionada correctamente.");
        } else {
            System.out.println("No hay espacio disponible para estacionar la moto 1.");
        }

        if (estacionadoMoto2) {
            System.out.println("Moto 2 estacionada correctamente.");
        } else {
            System.out.println("No hay espacio disponible para estacionar la moto 2.");
        }

        if (estacionadoCoche1) {
            System.out.println("Coche 1 estacionado correctamente.");
        } else {
            System.out.println("No hay espacio disponible para estacionar el coche 1.");
        }
        if (estacionadoCoche2) {
            System.out.println("Coche 2 estacionado correctamente.");
        } else {
            System.out.println("No hay espacio disponible para estacionar el coche 2.");
        }

        if (estacionadoCoche3) {
            System.out.println("Coche 3 estacionado correctamente.");
        } else {
            System.out.println("No hay espacio disponible para estacionar el coche 3.");
        }

        if (estacionadoCoche4) {
            System.out.println("Coche 4 estacionado correctamente.");
        } else {
            System.out.println("No hay espacio disponible para estacionar el coche 4.");
        }

        if (estacionadoCoche5) {
            System.out.println("Coche 5 estacionado correctamente.");
        } else {
            System.out.println("No hay espacio disponible para estacionar el coche 5.");
        }

        if (estacionadoCoche6) {
            System.out.println("Coche 6 estacionado correctamente.");
        } else {
            System.out.println("No hay espacio disponible para estacionar el coche 6.");
        }

        // Generar informe de ocupación
        sistema.informeOcupacion();
    }
}
