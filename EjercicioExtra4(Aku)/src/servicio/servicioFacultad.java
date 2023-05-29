package servicio;

import entidades.Empleado;
import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalServicio;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class servicioFacultad {
    List <Persona> listaFacultad = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    public ArrayList<Persona> crearEstudiantes(){
        ArrayList <Persona> estudiantes = new ArrayList();
        //Estudiante e = new Estudiante(curso, nombre, apellidos, eCivil, numId);
        Estudiante e1 = new Estudiante("1A", "Pepo", "Chiquito", "soltero", 1);
        Estudiante e2 = new Estudiante("1B", "Pepe", "Chiquite", "casado", 2);
        Estudiante e3 = new Estudiante("1C", "Pepa", "Chiquita", "viudo", 3);
        
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        
        return estudiantes;
    }    
    public ArrayList<Persona> crearProfesores(){
        ArrayList <Persona> profesores = new ArrayList();
        //Estudiante e = new Estudiante(curso, nombre, apellidos, eCivil, numId);
        Profesor p1 = new Profesor("Matematíca", "2015", "4", "Agusto", "Lopez", "Casado", 4);
        Profesor p2 = new Profesor("Arquitectura", "2001", "89", "Pedro", "Perez", "Divorciado", 5);
        Profesor p3 = new Profesor("Leguaje", "2018", "25", "Javier", "Ocampo", "Soltera", 6);
        
        profesores.add(p1);
        profesores.add(p2);
        profesores.add(p3);
        
        
        return profesores;
    }    
    public ArrayList<Persona> crearPersonalServicio(){
        ArrayList <Persona> pServicio = new ArrayList();
        //Estudiante e = new Estudiante(curso, nombre, apellidos, eCivil, numId);
        PersonalServicio ps1 = new PersonalServicio("Biblioteca", "2004", "69","Pascual", "Jota", "viudo", 7);
        PersonalServicio ps2 = new PersonalServicio("Secretaria", "2003", "51","Vilma", "Lira", "Casada", 8);
        PersonalServicio ps3 = new PersonalServicio("Decanato", "2020", "50","Camilo", "Ale", "Soltero", 9);
        
        pServicio.add(ps1);
        pServicio.add(ps2);
        pServicio.add(ps3);
        
        return pServicio;
    }
    
    public void llenarFacultad(){
       
       listaFacultad.addAll(crearEstudiantes());
       listaFacultad.addAll(crearProfesores());
       listaFacultad.addAll(crearPersonalServicio());
    }
    public void cambioECivil(){
        System.out.println("ID: ");
        int id = leer.nextInt();
        boolean esta = false;
        for (Persona persona : listaFacultad) {
            if(persona.getNumId()==id){
                System.out.println("Estado civil actual de "+persona.getNombre()+" "+persona.getApellidos()+": "+persona.geteCivil());
                System.out.print("Nuevo estado civil: ");
                persona.seteCivil(leer.next());
                esta=true;
                break;
            }
        }
        if(!esta){
            System.out.println("El ID no se encuentra registrado");
        }
    }
    public void reasignacionDespacho(){
        System.out.println("ID: ");
        int id = leer.nextInt();
        boolean esta = false;
        for (Persona persona : listaFacultad) {
            if(persona.getNumId()==id){
                esta=true;
                if (persona instanceof Empleado) {
                    Empleado object = (Empleado) persona;
                    System.out.println("Despacho actual de empleado "+object.getNombre()+" "+object.getApellidos()+": "+object.getNumDespacho());
                    System.out.print("Nuevo despacho civil: ");
                    object.setNumDespacho(leer.next());
                }else{
                     System.out.println("El ID no ");   
                }
            }   
        }
        if(!esta){
            System.out.println("El ID no se encuentra registrado");
        }
    }    
    public void matriculaciónAlumno(){
        System.out.println("ID: ");
        int id = leer.nextInt();
        boolean esta = false;
        for (Persona persona : listaFacultad) {
            if (persona instanceof Estudiante) {
                Estudiante object = (Estudiante) persona;
                if(object.getNumId()==id){
                    System.out.println("Curso actual del alumno "+object.getNombre()+" "+object.getApellidos()+": "+object.getCurso());
                    System.out.print("Nuevo curso: ");
                    object.setCurso(leer.next());
                    esta=true;
                break;
            }
            }
            
        }
        if(!esta){
            System.out.println("El ID no se encuentra registrado");
        }
    }    
    public void cambioDpto(){
        System.out.println("ID: ");
        int id = leer.nextInt();
        boolean esta = false;
        for (Persona persona : listaFacultad) {
            if (persona instanceof Profesor) {
                Profesor object = (Profesor) persona;
                if(object.getNumId()==id){
                    System.out.println("Departamento actual del profesor "+object.getNombre()+" "+object.getApellidos()+" : "+object.getDepartamento());
                    System.out.print("Nuevo departamento: ");
                    object.setDepartamento(leer.next());
                    esta=true;
                break;
            }
            }
            
        }
        if(!esta){
            System.out.println("El ID no se encuentra registrado");
        }
    }
    public void trasladoSeccion(){
        System.out.println("ID: ");
        int id = leer.nextInt();
        boolean esta = false;
        for (Persona persona : listaFacultad) {
            if (persona instanceof PersonalServicio) {
                PersonalServicio object = (PersonalServicio) persona;
                if(object.getNumId()==id){
                    System.out.println("Sección actual del personal de servicio "+object.getNombre()+" "+object.getApellidos()+": "+object.getSeccion());
                    System.out.print("Nueva sección: ");
                    object.setSeccion(leer.next());
                    esta=true;
                break;
            }
            }
            
        }
        if(!esta){
            System.out.println("El ID no se encuentra registrado");
        }
    }

    public void gestionFacultad(){
        int opc = 0;
        int id = 0;
        System.out.print("---------MENU-----------"
                + "\n1- AREA ESTUDIANTE"
                + "\n2- AREA EMPLEADO"
                + "\n3- SALIR"
                + "\nElija su opción: ");
        opc = leer.nextInt();
        switch (opc){
            case 1:
                int rta =0;
                System.out.print("---------ESTUDIANTE-----------"
                + "\n1- CREAR ESTUDIANTE"
                + "\n2- BUSCAR ESTUDIANTE"
                + "\nElija su opción: ");
                rta = leer.nextInt();
                switch(rta){
                    case 1:
                    case 2:
                        System.out.println("ID: ");
                        id = leer.nextInt();
                        
                }
        }
    }
    
}
