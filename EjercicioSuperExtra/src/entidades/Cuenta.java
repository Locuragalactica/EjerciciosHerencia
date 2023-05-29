package entidades;

import java.util.Scanner;

public abstract class Cuenta {

    protected float saldo;
    protected int consignaciones = 0;
    protected int retiros = 0;
    protected float tasaAnual;
    protected float comMensual = 0;
    float intMensual;
    boolean condicion;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void setRetiros(int retiros) {
        this.retiros = retiros;
    }

    public void setComMensual(float comMensual) {
        this.comMensual = comMensual;
    }

    public abstract void consignarSaldo();

    public abstract void retirarDinero();

    public void calcularInteres() {
        intMensual = (saldo * tasaAnual) / 12;
        System.out.println("Su interes Mensual es de: " + intMensual);
        saldo += intMensual;

    }

    public void extractoMensual() {
        if (retiros > 4) {
            retiros -= 4;
            comMensual += (retiros * 1000);
        }
        saldo -= comMensual;
        condicion = false;
    }

    public void imprimir() {
        if (retiros > 4) {
            condicion = true;
        }
        String mensaje = condicion ? "" + ((retiros - 4) * 1000) : "" + comMensual;

        System.out.println("Su saldo es de: " + saldo + "\n"
                + "Su comisión mensual es de: " + mensaje + "\n"
                + "Numero de transacciones realizadas: " + (consignaciones + retiros));
    }
}
