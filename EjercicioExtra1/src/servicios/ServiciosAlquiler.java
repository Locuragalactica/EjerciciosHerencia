package servicios;

import entidades.Alquiler;
import entidades.Barco;
import entidades.Motor;
import entidades.Velero;
import entidades.Yate;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosAlquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alquiler cliente;
    long diasAlquiler;
    double totalAlquiler;
    ArrayList<Alquiler> alquileres = new ArrayList<>();

    public void ingresoBarco() {
        ingresoCliente();
        int rta;
        String rta2 = "";

        System.out.println("Ingrese los datos del barco que desea ingresar: ");
        do {
            System.out.println("1- Velero.");
            System.out.println("2- A Motor.");
            System.out.println("3- Yate de Lujo.");
            rta = leer.nextInt();

            switch (rta) {
                case 1:
                    //No estoy logrando crear un barco que sea velero.
                    System.out.println("-------------------------------------");
                    Velero v = new Velero();
                    v.crearVelero(v);
                    cliente.setBarco(v);
                    alquileres.add(cliente);
                    calculoAlquilerVelero(v);
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    Motor m = new Motor();
                    m.crearMotor(m);
                    cliente.setBarco(m);
                    alquileres.add(cliente);
                    calculoAlquilerMotor(m);
                    System.out.println("-------------------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    Yate y = new Yate();
                    y.crearYate(y);
                    cliente.setBarco(y);
                    alquileres.add(cliente);
                    calculoAlquilerYate(y);
                    System.out.println("-------------------------------------");
                    break;
            }

        } while (rta > 3 || rta < 1);

    }

    public Alquiler ingresoCliente() {
        cliente = new Alquiler();
        System.out.println("Ingrese su nombre completo");
        cliente.setNombre(leer.next());
        System.out.println("Ingrese su DNI");
        cliente.setDNI(leer.next());
        System.out.println("Ingrese la fecha de Alquiler (aaaa-mm-dd)");
        cliente.setFechaAlquiler(LocalDate.parse(leer.next()));
        System.out.println("Ingrese la fecha de Devolución (aaaa-mm-dd)");
        cliente.setFechaDevolucion(LocalDate.parse(leer.next()));
        diasAlquiler = ChronoUnit.DAYS.between(cliente.getFechaAlquiler(), cliente.getFechaDevolucion());
        System.out.println("Ingrese posición del amarre");
        cliente.setPosicionAmarre(leer.nextInt());

        return cliente;
    }

    public void calculoAlquilerVelero(Velero v) {
        totalAlquiler = diasAlquiler * (10 * v.getEslora()) + (v.getNumMastiles() * 250);
        System.out.println("El precio de su alquiler es de: " + totalAlquiler);
    }

    public void calculoAlquilerMotor(Motor m) {
        totalAlquiler = diasAlquiler * (10 * m.getEslora()) + (m.getPotenciaCV() * 5);
        System.out.println("El precio de su alquiler es de: " + totalAlquiler);
    }

    public void calculoAlquilerYate(Yate y) {
        totalAlquiler = diasAlquiler * (10 * y.getEslora()) + (y.getPotenciaCV() * 5) + (y.getNumCamarote() * 500);
        System.out.println("El precio de su alquiler es de: " + totalAlquiler);

    }

    public void consultarAlquileres() {
        for (Alquiler aux : alquileres) {
            System.out.println(aux);
        }
    }

    public void menu() {
        int rta;
        String rta2 = "";
        do {
            System.out.println("\u001B[41m ----------MENU----------");
            System.out.println("\u001B[41m");
            System.out.println("\u001B[41m1- Ingreso Alquiler");
            System.out.println("\u001B[41m2- Consulta Alquileres");
            System.out.println("\u001B[41m3- Salir");

            rta = leer.nextInt();
            if (rta == 3) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:
                    System.out.println("-------------------------------------");
                    ingresoBarco();
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    consultarAlquileres();
                    System.out.println("-------------------------------------");

                    break;
            }

        } while (!rta2.equals("s"));

    }

}
