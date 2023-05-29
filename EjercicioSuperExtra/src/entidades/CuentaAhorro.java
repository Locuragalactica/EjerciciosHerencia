package entidades;

public class CuentaAhorro extends Cuenta {

    private boolean activa = false;
    float extraccion = 0;

    public CuentaAhorro(boolean activa, float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = activa;
    }

    @Override
    public void consignarSaldo() {
        if (activaCuenta()) {
            System.out.println("¿Cuanto dinero desea ingresar?");
            saldo += leer.nextFloat();
            consignaciones += 1;
            System.out.println("Su saldo actual es de: " + saldo);
        } else {
            System.out.println("Su cuenta no esta activada");
        }
    }

    @Override
    public void retirarDinero() {
        if (activaCuenta()) {
            System.out.println("¿Cuanto dinero desea retirar?");
            extraccion = leer.nextFloat();
            if (extraccion > saldo) {
                System.out.println("Usted no tiene el dinero que desea retirar");
            } else {
                saldo -= extraccion;
                retiros += 1;
                System.out.println("Usted ha retirado: " + extraccion + "$.\n"
                        + "Su saldo actual es de: " + saldo);
            }
        } else {
            System.out.println("Su cuenta no esta activada");
        }

    }

    @Override
    public void calcularInteres() {
        super.calcularInteres();
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }

    public boolean activaCuenta() {
        if (saldo > 10000) {
            activa = true;
        }
        return activa;
    }
}
