package entidades;

public class CuentaCorriente extends Cuenta {

    private float sobreGiro = 0;
    float extraccion = 0;
    float ingreso = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public void consignarSaldo() {
        System.out.println("Digite cuanto dinero desea ingresar: ");
        ingreso = leer.nextFloat();

        if (sobreGiro < 0) {
            float aux = ingreso;
            System.out.println("Su saldo actual es de: " + saldo);
            System.out.println("Usted tiene un sobregiro de: " + sobreGiro + "$.\n"
                    + "Se le descontara del ingreso.");
            ingreso += sobreGiro;
            sobreGiro += aux;
            System.out.println("Su sobregiro acutal es de: " + sobreGiro + "$\n"
                    + "Su ingreso sera de: " + ingreso);
            saldo += ingreso;
            System.out.println("Su saldo actual es de: " + saldo);
        } else {
            System.out.println("Su saldo actual es de: " + saldo);
            saldo += ingreso;
            System.out.println("Su saldo actualizado es de: " + saldo);
        }
        consignaciones += 1;
    }

    @Override
    public void retirarDinero() {
        System.out.println("Ingrese cuanto dinero desea retirar: ");
        extraccion = leer.nextFloat();

        if (extraccion > saldo) {
            sobreGiro = saldo - extraccion;
            saldo = 0;
            System.out.println("Usted ha retirado mas dinero del que posee en la cuenta"
                    + "su saldo de sobregiro es de: " + sobreGiro);
        } else {
            System.out.println("Usted ha retirado: " + extraccion + "$.\n"
                    + "Su saldo es de: " + saldo);
        }
        retiros += 1;

    }

    @Override
    public void calcularInteres() {
        super.calcularInteres();
    }

    @Override
    public void extractoMensual() {
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de sobregiro: " + sobreGiro);

    }

}
