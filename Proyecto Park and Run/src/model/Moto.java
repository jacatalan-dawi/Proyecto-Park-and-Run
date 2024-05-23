package model;

public class Moto implements Vehiculo {
    private String id;
    private String tipo;

    // Constructor que acepta un argumento de tipo String para el id
    public Moto(String id) {
        this.id = id;
        this.tipo = "Moto";
    }

    @Override
    public int obtenerPrecio() {
        return 2; // Precio para moto: 2 euros
    }
    public String getId() {
        return this.id;
    }

    public String getTipo() {
        return this.tipo;
    }
}
