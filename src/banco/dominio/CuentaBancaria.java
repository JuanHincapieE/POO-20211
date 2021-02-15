package banco.dominio;

import java.util.Date;

public class CuentaBancaria {
    public Banco banco;
    public String tipo; //Tipo de cuenta, ahorros o corriente
    public Persona titular;
    public String numero;
    public double saldo;
    public Date fechaApertura;
    public String contrasena;
    public String estado;

    public boolean retirar(double valorARetirar) {
        if (valorARetirar <= saldo && estado.equals("Activa")) {
            saldo = saldo - valorARetirar;
            return true;
        } else {
            return false;

        }
    }

    public boolean consignar(double valorAConsignar) {
        if (valorAConsignar > 0 && estado.equals("Activa")) {
            saldo += valorAConsignar;
            return true;
        } else {
            return false;

        }
    }

    public String consultarSaldo() {
        return "El saldo de la cuenta de " + titular.nombre + " es: " + saldo;


    }

    public boolean transferir(double valorATransferir, CuentaBancaria cuentaDestino) {
        return this.retirar(valorATransferir) && cuentaDestino.consignar(valorATransferir);



    }
}

