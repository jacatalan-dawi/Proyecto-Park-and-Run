package model;

public class Coche implements Vehiculo {
    private String id;
    private String tipo;

    // Constructor que acepta un argumento de tipo String para el id
    public Coche(String id) {
        this.id = id;
        this.tipo = "Coche";
    }

    @Override
    public int obtenerPrecio() {
        return 4; // Precio para coche: 4 euros
    }
    public String getId() {
        return this.id;
    }

    public String getTipo() {
        return this.tipo;
    }
}
