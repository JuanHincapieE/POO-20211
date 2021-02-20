package bicicleta.dominio;

public class Bicicleta {
    public long serial;
    public String marca;
    public String modelo;
    public String color;
    public long precio;
    public double velocidad;

    public void cambiarPrecio(long nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public void cambiarPrecioYColor(long nuevoPrecio, String nuevoColor) {
        this.cambiarPrecio(nuevoPrecio);
        this.color = nuevoColor;
    }

    public String obtenerInformacion() {
        String informacion = "\n Serial: " + this.serial + "\n Marca: " + this.marca
                + "\n Modelo: " + this.modelo + "\n Color: " + this.color + "\n Precio: " + this.precio
                + "\n Velocidad: " + this.velocidad;
        return informacion;
    }

    public void acelerar(double incremento) {
        this.velocidad += incremento;

    }

    public boolean frenar(double decremento) {
        if ((this.velocidad + decremento) > 0) {
            this.velocidad -= decremento;
            return true;
        }

        return false;
    }
}
