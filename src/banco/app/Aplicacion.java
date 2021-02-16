package banco.app;

import banco.dominio.CuentaBancaria;
import banco.dominio.Persona;

public class Aplicacion {
    public static void main(String[] args) {

        Persona sebastian = new Persona();
        Persona alejandro = new Persona();

        CuentaBancaria cuentaSebastian = new CuentaBancaria();
        CuentaBancaria cuentaAlejandro = new CuentaBancaria();

        sebastian.nombre = "Sebastian";
        cuentaSebastian.titular = sebastian;
        cuentaSebastian.saldo = 500000;
        cuentaSebastian.consultarSaldo();
        cuentaSebastian.estado = "Activa";


        alejandro.nombre = "Alejandro";
        cuentaAlejandro.titular = alejandro;
        cuentaAlejandro.saldo = 0;
        cuentaAlejandro.consultarSaldo();
        cuentaAlejandro.estado = "Activa";


        System.out.println(cuentaSebastian.consultarSaldo());
        System.out.println(cuentaAlejandro.consultarSaldo());

        boolean resultadoTransferencia = cuentaSebastian.transferir(35000,cuentaAlejandro);

        System.out.println(resultadoTransferencia);
        System.out.println(cuentaSebastian.consultarSaldo());
        System.out.println(cuentaAlejandro.consultarSaldo());





    }
}
