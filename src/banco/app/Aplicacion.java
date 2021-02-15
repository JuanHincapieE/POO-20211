package banco.app;

import banco.dominio.CuentaBancaria;
import banco.dominio.Persona;

public class Aplicacion {
    public static void main(String[] args) {

        Persona sebastian = new Persona();
        Persona alejandro = new Persona();

        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria cuentaAlejandro = new CuentaBancaria();

        sebastian.nombre = "Sebastian";
        miCuenta.titular = sebastian;
        miCuenta.saldo = 500000;
        miCuenta.consultarSaldo();
        miCuenta.estado = "Activa";


        alejandro.nombre = "Alejandro";
        cuentaAlejandro.titular = alejandro;
        cuentaAlejandro.saldo = 0;
        cuentaAlejandro.consultarSaldo();
        cuentaAlejandro.estado = "Activa";


        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaAlejandro.consultarSaldo());

        boolean resultadoTransferencia = miCuenta.transferir(35000,cuentaAlejandro);

        System.out.println(resultadoTransferencia);
        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaAlejandro.consultarSaldo());





    }
}
