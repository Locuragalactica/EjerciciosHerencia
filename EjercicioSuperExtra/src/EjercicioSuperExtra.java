
import entidades.CuentaAhorro;
import java.util.Scanner;

public class EjercicioSuperExtra {

    public static void main(String[] args) {
        /*
        Desarrollar un programa que modele una cuenta bancaria que tiene los siguientes atributos, que deben ser de acceso protegido:

* Saldo, de tipo float.
* Número de consignaciones con valor inicial cero, de tipo int.
* Número de retiros con valor inicial cero, de tipo int.
* Tasa anual (porcentaje), de tipo float.
* Comisión mensual con valor inicial cero, de tipo float.

La clase Cuenta tiene un constructor que inicializa los atributos saldo y tasa anual con valores pasados como parámetros. 

La clase Cuenta tiene los siguientes métodos:
* Consignar una cantidad de dinero en la cuenta actualizando su saldo.
* Retirar una cantidad de dinero en la cuenta actualizando su saldo (el valor a retirar no debe superar el saldo).
* Calcular el interés mensual de la cuenta y actualiza el saldo correspondiente.
* Extracto mensual: actualiza el saldo restándole la comisión mensual y calculando el interés mensual correspondiente (invoca el método anterior).
* Imprimir: muestra en pantalla los valores de los atributos.

La clase Cuenta tiene dos clases hijas:

Cuenta de ahorros: posee un atributo para determinar si la cuenta de ahorros está activa (tipo boolean). Si el saldo es menor a $10000, la cuenta está inactiva, en caso contrario se considera activa.

Los siguientes métodos se redefinen:
* Consignar: se puede consignar dinero si la cuenta está activa.Debe invocar al método heredado.
* Retirar: es posible retirar dinero si la cuenta está activa. Debeinvocar al método heredado.
* Extracto mensual: si el número de retiros es mayor que 4, por cada retiro adicional, se cobra $1000 como comisión mensual. Al generar el extracto, se determina si la cuenta está activa o no con el saldo.
* Un nuevo método imprimir que muestra en pantalla el saldo de la cuenta, la comisión mensual y el número de transacciones realizadas (suma de cantidad de consignaciones y retiros).

Cuenta corriente: posee un atributo de sobregiro, el cual se inicializa en cero.

Se redefinen los siguientes métodos:
* Retirar: se retira dinero de la cuenta actualizando su saldo. Se puede retirar dinero superior al saldo. El dinero que se debe queda como sobregiro.
* Consignar: invoca al método heredado. Si hay sobregiro, la cantidad consignada reduce el sobregiro.
* Extracto mensual: invoca al método heredado.
* Un nuevo método imprimir que muestra en pantalla el saldo de la cuenta, la comisión mensual, el número de transacciones realizadas (suma de cantidad de consignaciones y retiros) y el valor de sobregiro.

Realizar un método main que implemente un objeto Cuenta de ahorros y llame a los métodos correspondientes
         */
        Scanner leer = new Scanner(System.in);

        CuentaAhorro c1 = new CuentaAhorro(false, 35000f, 0.1f);
        c1.activaCuenta();

        int rta;
        String rta2 = "";
        do {
            System.out.println("\u001B[41m ----------MENU----------");
            System.out.println("\u001B[41m");
            System.out.println("\u001B[41m1- Consignar Saldo ");
            System.out.println("\u001B[41m2- Retirar Saldo");
            System.out.println("\u001B[41m3- Mostrar inforación de Cuenta");
            System.out.println("\u001B[41m4- Extracto Mensual.");
            System.out.println("\u001B[41m5- Salir");

            rta = leer.nextInt();
            if (rta == 5) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:
                    System.out.println("-------------------------------------");
                    c1.consignarSaldo();
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    c1.retirarDinero();
                    System.out.println("-------------------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    c1.imprimir();
                    System.out.println("-------------------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------------------");
                    c1.extractoMensual();
                    c1.setComMensual(0f);
                    c1.setRetiros(0);
                    c1.calcularInteres();
                    System.out.println("-------------------------------------");

                    break;
            }

        } while (!rta2.equals("s"));

    }

}
