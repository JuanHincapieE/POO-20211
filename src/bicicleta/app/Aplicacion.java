package bicicleta.app;

import bicicleta.dominio.Bicicleta;

public class Aplicacion {

    public static void main(String [] args){
        Bicicleta bicicleta = new Bicicleta();

        bicicleta.serial= 8456123;
        bicicleta.marca = "Mountan";
        bicicleta.modelo = "ARK-783.AJ";
        bicicleta.color = "Negro";
        bicicleta.precio = 4000000;

        bicicleta.acelerar(21.25);
        bicicleta.frenar(12.8);

        System.out.println(bicicleta.obtenerInformacion());

        bicicleta.cambiarPrecioYColor(350000,"Blanco");

        System.out.println(bicicleta.obtenerInformacion());


    }
}
