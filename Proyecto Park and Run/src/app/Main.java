package app;

import core.SistemaEstacionamiento;
import model.Coche;
import model.Moto;
import model.Vehiculo;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un sistema de estacionamiento con 2 espacios para motos y 3 para coches
        SistemaEstacionamiento sistema = new SistemaEstacionamiento(2, 6);
        Scanner scanner = new Scanner(System.in);

        // Leer el fichero "datos.txt" y añadir los vehículos al sistema
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String tipo = parts[0].trim();
                String id = parts[1].trim();
                if ("Coche".equals(tipo)) {
                    Coche coche = new Coche(id);
                    sistema.estacionarVehiculo(coche);
                } else if ("Moto".equals(tipo)) {
                    Moto moto = new Moto(id);
                    sistema.estacionarVehiculo(moto);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero 'datos.txt': " + e.getMessage());
        }

        while (true) {
            System.out.println("Por favor, elige una opción:");
            System.out.println("1. Ver vehículos");
            System.out.println("2. Añadir coche");
            System.out.println("3. Añadir moto");
            System.out.println("4. Quitar vehículo");
            System.out.println("5. Ver vehículos de un tipo");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (opcion) {
                case 1:
                    // Ver vehículos
                    sistema.informeOcupacion();
                    break;
                case 2:
                    // Añadir coche
                    System.out.println("Introduce el ID del coche a añadir:");
                    String idCoche = scanner.nextLine();
                    Coche coche = new Coche(idCoche);
                    sistema.estacionarVehiculo(coche);
                    System.out.println("Coche añadido.");
                    break;
                case 3:
                    // Añadir moto
                    System.out.println("Introduce el ID de la moto a añadir:");
                    String idMoto = scanner.nextLine();
                    Moto moto = new Moto(idMoto);
                    sistema.estacionarVehiculo(moto);
                    System.out.println("Moto añadida.");
                    break;
                case 4:
                    // Quitar vehículo
                    System.out.println("Introduce el ID del vehículo a quitar:");
                    String id = scanner.nextLine();
                    sistema.quitarVehiculo(id);
                    System.out.println("Vehículo quitado.");
                    break;
                case 5:
                    // Ver vehículos de un tipo
                    System.out.println("Introduce el tipo de vehículo a ver (Coche o Moto):");
                    String tipo = scanner.nextLine();
                    sistema.verVehiculosTipo(tipo);
                    break;
                case 6:
                    // Salir y guardar los cambios
                    System.out.println("Guardando los cambios y saliendo...");
                    try (PrintWriter writer = new PrintWriter(new FileWriter("datos.txt"))) {
                        for (Vehiculo vehiculo : sistema.getVehiculos()) {
                            writer.println(vehiculo.getTipo() + "," + vehiculo.getId());
                        }
                    } catch (IOException e) {
                        System.out.println("Error al escribir el fichero 'datos.txt': " + e.getMessage());
                    }
                    return;
                default:
                    System.out.println("Opción no reconocida. Por favor, intenta de nuevo.");
            }
        }
    }
}
