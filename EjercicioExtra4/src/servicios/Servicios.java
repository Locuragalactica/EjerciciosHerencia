package servicios;

import entidades.Estudiante;
import entidades.PdServicio;
import entidades.Persona;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;
import entidades.Empleado;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Persona> facultad = new ArrayList<>();

    public ArrayList<Persona> crearEstudiante() {
        ArrayList<Persona> listaEstudiantes = new ArrayList<>();
        Estudiante e1 = new Estudiante("1A", "Pepe", "Chiquito", "01", "Soltero");
        Estudiante e2 = new Estudiante("1B", "Pepa", "Lola", "02", "Divorciada");
        Estudiante e3 = new Estudiante("1C", "Naran", "Joso", "03", "Soltero");

        listaEstudiantes.add(e1);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(e3);

        return listaEstudiantes;
    }

    public ArrayList<Persona> crearProfesor() {
        ArrayList<Persona> listaProfesores = new ArrayList<>();

        Profesor p1 = new Profesor("Arquitectura", "2005", "4", "Felipe", "Fama", "04", "Divorciado");
        Profesor p2 = new Profesor("Lenguaje", "2010", "3", "Agustina", "Galluci", "05", "Soltera");
        Profesor p3 = new Profesor("Matematica", "2020", "1", "Washintong", "Alfaro", "06", "Viudo");

        listaProfesores.add(p1);
        listaProfesores.add(p2);
        listaProfesores.add(p3);

        return listaProfesores;
    }

    public ArrayList<Persona> crearPersonalServicio() {
        ArrayList<Persona> listaPdServicio = new ArrayList<>();

        PdServicio pd1 = new PdServicio("Biblioteca", "1995", "7", "Federico", "Forero", "07", "Soltero");
        PdServicio pd2 = new PdServicio("Decanato", "2023", "10", "Brian", "Panchana", "08", "Viudo");
        PdServicio pd3 = new PdServicio("Secretaría", "2000", "11", "Agus", "Peterseim", "09", "Casado");

        listaPdServicio.add(pd1);
        listaPdServicio.add(pd2);
        listaPdServicio.add(pd3);

        return listaPdServicio;
    }

    public void crearFacultad() {

        facultad.addAll(crearEstudiante());
        facultad.addAll(crearPersonalServicio());
        facultad.addAll(crearProfesor());

    }

    public void cambioEstadoCivil() {
        boolean presente = false;
        System.out.println("Ingrese el ID de la persona a editar: ");
        String id = leer.next();

        for (Persona aux : facultad) {
            if (aux.getID().equals(id)) {
                System.out.println("El ID pertenece a: " + aux.getNombre() + " " + aux.getApellido());
                System.out.println("Su estado civil es: " + aux.getEstadoCivil());
                System.out.println("Ingrese el nuevo estado civil");
                aux.setEstadoCivil(leer.next());
                System.out.println("Estado civil cambiado");
                presente = true;
                break;
            }
        }
        if (!presente) {
            System.out.println("El ID no esta registrado");
        }
    }

    public void cambioDespacho() {
        boolean presente = false;
        System.out.println("Ingrese el ID del Empleado: ");
        String id = leer.next();

        for (Persona aux : facultad) {

            if (aux instanceof Empleado) {
                Empleado object = (Empleado) aux;

                if (aux.getID().equals(id)) {
                    System.out.println("El ID pertenece a: " + aux.getNombre() + " " + aux.getApellido());
                    System.out.println("Su despacho es: " + object.getNumDespacho());
                    System.out.println("Ingrese el nuevo despacho");
                    object.setNumDespacho(leer.next());
                    System.out.println("Despacho cambiado");
                    presente = true;
                    break;
                }
            }
        }
        if (!presente) {
            System.out.println("El ID no esta registrado o no es de un Empleado");
        }
    }

    public void cambioCurso() {
        boolean presente = false;
        System.out.println("Ingrese el ID del Alumno: ");
        String id = leer.next();

        for (Persona aux : facultad) {

            if (aux instanceof Estudiante) {
                Estudiante object = (Estudiante) aux;

                if (aux.getID().equals(id)) {
                    System.out.println("El ID pertenece a: " + aux.getNombre() + " " + aux.getApellido());
                    System.out.println("Su Curso es: " + object.getCurso());
                    System.out.println("Ingrese el nuevo curso");
                    object.setCurso(leer.next());
                    System.out.println("Curso cambiado");
                    presente = true;
                    break;
                }
            }
        }
        if (!presente) {
            System.out.println("El ID no esta registrado o no es de un alumno");
        }
    }

    public void cambioDepProfesor() {
        boolean presente = false;
        System.out.println("Ingrese el ID del Profesor: ");
        String id = leer.next();

        for (Persona aux : facultad) {

            if (aux instanceof Profesor) {
                Profesor object = (Profesor) aux;

                if (aux.getID().equals(id)) {
                    System.out.println("El ID pertenece a: " + aux.getNombre() + " " + aux.getApellido());
                    System.out.println("Su departamento es: " + object.getDepartamento());
                    System.out.println("Ingrese el nuevo departamento");
                    object.setDepartamento(leer.next());
                    System.out.println("Departamento cambiado");
                    presente = true;
                    break;
                }
            }
        }
        if (!presente) {
            System.out.println("El ID no esta registrado o no es de un Profesor");
        }
    }

    public void cambioDeSeccion() {
        boolean presente = false;
        System.out.println("Ingrese el ID del Empleado: ");
        String id = leer.next();

        for (Persona aux : facultad) {

            if (aux instanceof PdServicio) {
                PdServicio object = (PdServicio) aux;

                if (aux.getID().equals(id)) {
                    System.out.println("El ID pertenece a: " + aux.getNombre() + " " + aux.getApellido());
                    System.out.println("Su sección es: " + object.getSeccion());
                    System.out.println("Ingrese la nueva seccion");
                    object.setSeccion(leer.next());
                    System.out.println("Sección cambiada");
                    presente = true;
                    break;
                }
            }
        }
        if (!presente) {
            System.out.println("El ID no esta registrado o no es de un Empleado");
        }
    }

    public void imprimir() {
        for (Persona aux : facultad) {
            System.out.println(aux);
        }
    }

    public void menu() {
        int rta;
        String rta2 = "";
        do {
            System.out.println("\u001B[41m ----------MENU----------");
            System.out.println("\u001B[41m");
            System.out.println("\u001B[41m1- Cambiar estado civil");
            System.out.println("\u001B[41m2- Reasignación de despacho");
            System.out.println("\u001B[41m3- Cambio de curso");
            System.out.println("\u001B[41m4- Cambio de departamento");
            System.out.println("\u001B[41m5- Cambio de Sección");
            System.out.println("\u001B[41m6- Mostrar todo");
            System.out.println("\u001B[41m7- Salir");

            rta = leer.nextInt();
            if (rta == 7) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:
                    System.out.println("-------------------------------------");
                    cambioEstadoCivil();
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    cambioDespacho();
                    System.out.println("-------------------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    cambioCurso();
                    System.out.println("-------------------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------------------");
                    cambioDepProfesor();
                    System.out.println("-------------------------------------");
                    break;
                case 5:
                    System.out.println("-------------------------------------");
                    cambioDeSeccion();
                    System.out.println("-------------------------------------");
                    break;
                case 6:
                    System.out.println("-------------------------------------");
                    imprimir();
                    System.out.println("-------------------------------------");
                    break;
            }

        } while (!rta2.equals("s"));

    }

}
