package her_extra4;

import entidades.Empleado;
import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalServicio;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class HER_Extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String reset="\u001B[0m";

        //Variables aux para llamar a cada método
        Persona per = new Persona();
        Estudiante e = new Estudiante();
        Profesor p = new Profesor();
        PersonalServicio ps = new PersonalServicio();
        Empleado em = new Empleado();

        ArrayList<Persona> listaFacultad = new ArrayList();
        
        //Creamos personas ya establecidas
        e.personasPreestablecidas(listaFacultad);
        p.personasPreestablecidas(listaFacultad);
        ps.personasPreestablecidas(listaFacultad);

        int opc = 0, idBuscar = 0, respuesta = 0;
        do {

            System.out.print("---------MENU-----------"
                    +"\n\u001B[44m1- AREA ESTUDIANTE"+reset
                    +"\n\u001B[45m2- AREA EMPLEADO"+reset
                    +"\n3- SALIR"
                    +"\nElija su opción: ");
            opc = leer.nextInt();
            int rta = 0;
            switch (opc) {
                case 1:
                    do {
                        System.out.print("\u001B[44m---------ESTUDIANTE-----------"+reset
                                + "\n1- CREAR ESTUDIANTE"
                                + "\n2- BUSCAR ESTUDIANTE"
                                + "\n3- MOSTRAR ESTUDIANTES"
                                + "\n4- SALIR"
                                + "\nElija su opción: ");
                        rta = leer.nextInt();
                        System.out.println("---------------------------------------------");
                        switch (rta) {
                            case 1:
                                listaFacultad.add(e.crearPersonaFacultad(listaFacultad, per, e, p, ps, em));
                                System.out.println("---------------------------------------------");
                                break;
                            case 2:
                                idBuscar = per.buscarId(listaFacultad);
                                if (idBuscar < listaFacultad.size() && listaFacultad.get(idBuscar) instanceof Estudiante){         
                                    System.out.println(listaFacultad.get(idBuscar));
                                    System.out.println("---------------------------------------------");
                                    do {
                                        System.out.print("1- CAMBIAR ESTADO CIVIL"
                                                + "\n2- CAMBIAR CURSO"
                                                + "\n3- SALIR"
                                                + "\nElija su opción: ");
                                        respuesta = leer.nextInt();
                                        System.out.println("---------------------------------------------");
                                        switch (respuesta) {
                                            case 1:
                                                per.cambioECivil(listaFacultad.get(idBuscar));
                                                System.out.println("---------------------------------------------");
                                                break;
                                            case 2:
                                                e.matriculaciónAlumno(listaFacultad.get(idBuscar));
                                                System.out.println("---------------------------------------------");
                                                break;
                                        }
                                    } while (respuesta != 3);
                                } else if(idBuscar < listaFacultad.size()) {
                                  System.out.println("\u001B[41mEl id ingresado no pertenece a un estudiante"+reset);  
                                }
                                break;
                            case 3:
                                for (Persona persona : listaFacultad) {
                                    if (persona instanceof Estudiante) {
                                        Estudiante object = (Estudiante) persona;
                                        System.out.println(object);
                                    }
                                }
                                System.out.println("---------------------------------------------");
                        }
                    } while (rta != 4);
                    break;
                case 2:
                    System.out.print("\u001B[45m---------EMPLEADO-----------"+reset
                            + "\n1- PROFESOR"
                            + "\n2- PERSONAL DE SERVICIO"
                            + "\n3- REASIGNACIÓN DE DESPACHO"
                            + "\n4- SALIR"
                            + "\nElija su opción: ");
                    rta = leer.nextInt();
                    int rtaE = 0;
                    switch (rta) {
                        case 1:
                            do {
                                System.out.print("\u001B[45m---------PROFESOR-----------"+reset
                                        + "\n1- CREAR PROFESOR"
                                        + "\n2- BUSCAR PROFESOR"
                                        + "\n3- MOSTRAR PROFESORES"
                                        + "\n4- SALIR"
                                        + "\nElija su opción: ");
                                rtaE = leer.nextInt();
                                System.out.println("---------------------------------------------");
                                switch (rtaE) {
                                    case 1:
                                        listaFacultad.add(p.crearPersonaFacultad(listaFacultad, per, e, p, ps, em));
                                        System.out.println("---------------------------------------------");
                                        break;
                                    case 2:
                                        idBuscar = per.buscarId(listaFacultad);
                                        if (idBuscar < listaFacultad.size() && listaFacultad.get(idBuscar) instanceof Profesor) {
                                            System.out.println(listaFacultad.get(idBuscar));
                                            System.out.println("---------------------------------------------");
                                            do {
                                                System.out.print("1- CAMBIAR ESTADO CIVIL"
                                                        + "\n2- CAMBIAR DEPARTAMENTO"
                                                        + "\n3- SALIR"
                                                        + "\nElija su opción: ");
                                                System.out.println("---------------------------------------------");
                                                respuesta = leer.nextInt();
                                                switch (respuesta) {
                                                    case 1:
                                                        per.cambioECivil(listaFacultad.get(idBuscar));
                                                        System.out.println("---------------------------------------------");
                                                        break;
                                                    case 2:
                                                        p.cambioDpto(listaFacultad.get(idBuscar));
                                                        System.out.println("---------------------------------------------");
                                                }
                                            } while (respuesta != 3);
                                        } else if(idBuscar < listaFacultad.size()) {
                                            System.out.println("\u001B[41mEl ID no pertenece a un profesor"+reset);
                                            System.out.println("---------------------------------------------");
                                        }
                                        
                                        break;
                                    case 3:
                                        for (Persona persona : listaFacultad) {
                                            if (persona instanceof Profesor) {
                                                Profesor object = (Profesor) persona;
                                                System.out.println(object);

                                            }
                                        }
                                        System.out.println("---------------------------------------------");
                                }
                            } while (rtaE != 4);
                            break;
                        case 2:
                            do {
                                System.out.print("\u001B[45m---------PERSONAL DE SERVICIO-----------"+reset
                                        + "\n1- CREAR PERSONAL DE SERVICIO"
                                        + "\n2- BUSCAR PERSONAL DE SERVICIO"
                                        + "\n3- MOSTRAR PERSONAL DE SERVICIO"
                                        + "\n4- SALIR"
                                        + "\nElija su opción: ");
                                rtaE = leer.nextInt();
                                System.out.println("---------------------------------------------");
                                switch (rtaE) {
                                    case 1:
                                        listaFacultad.add(p.crearPersonaFacultad(listaFacultad, per, e, p, ps, em));
                                        System.out.println("---------------------------------------------");
                                        break;
                                    case 2:
                                        idBuscar = per.buscarId(listaFacultad);
                                        if (idBuscar < listaFacultad.size() && listaFacultad.get(idBuscar) instanceof PersonalServicio) {
                                            System.out.println(listaFacultad.get(idBuscar));
                                            System.out.println("---------------------------------------------");
                                            do {
                                                System.out.print("1- CAMBIAR ESTADO CIVIL"
                                                        + "\n2- CAMBIAR SECCION"
                                                        + "\n3- SALIR"
                                                        + "\nElija su opción: ");
                                                respuesta = leer.nextInt();
                                                System.out.println("---------------------------------------------");
                                                switch (respuesta) {
                                                    case 1:
                                                        per.cambioECivil(listaFacultad.get(idBuscar));
                                                        System.out.println("---------------------------------------------");
                                                        break;
                                                    case 2:
                                                        ps.cambioSeccion(listaFacultad.get(idBuscar));
                                                        System.out.println("---------------------------------------------");
                                                }
                                            } while (respuesta != 3);
                                       } else if(idBuscar < listaFacultad.size()) {
                                            System.out.println("\u001B[41mEl ID no pertenece a un personal de servicio"+reset);
                                            System.out.println("---------------------------------------------");
                                        }
                                        break;
                                    case 3:
                                        for (Persona persona : listaFacultad) {
                                            if (persona instanceof PersonalServicio) {
                                                PersonalServicio object = (PersonalServicio) persona;
                                                System.out.println(object);
                                            }
                                        }
                                        System.out.println("---------------------------------------------");
                                }
                            } while (rtaE != 4);
                            break;
                        case 3:
                            idBuscar = per.buscarId(listaFacultad);
                            if (idBuscar < listaFacultad.size() && listaFacultad.get(idBuscar) instanceof Empleado) {
                                System.out.println(listaFacultad.get(idBuscar));
                                System.out.println("---------------------------------------------");
                                em.cambioDespacho(listaFacultad.get(idBuscar));
                            } else if(idBuscar < listaFacultad.size()) {
                                System.out.println("\u001B[41mEl id no pertenece a un empleado"+reset);
                            }
                            System.out.println("---------------------------------------------");
                    }
                case 3:
                    System.out.println("----------sistema finalizado-----------");
            }
            
        } while (opc != 3);
    }

}
