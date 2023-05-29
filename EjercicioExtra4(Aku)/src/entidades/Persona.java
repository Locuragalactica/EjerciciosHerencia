package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    protected String nombre, apellidos, eCivil;
    protected Integer numId;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String reset="\u001B[0m";

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String eCivil, Integer numId) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.eCivil = eCivil;
        this.numId = numId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String geteCivil() {
        return eCivil;
    }

    public Integer getNumId() {
        return numId;
    }

    public void seteCivil(String eCivil) {
        this.eCivil = eCivil;
    }
    
    
    //pide los datos de persona para pasar a los hijos y convertirlos en objetos del tipo correspondiente
    public Persona crearPersonaFacultad(ArrayList <Persona> lista, Persona per, Estudiante e, Profesor p, PersonalServicio ps, Empleado em){
        System.out.print("Nombre: ");
        nombre=leer.next();
        System.out.print("Apellido: ");
        apellidos=leer.next();
        System.out.print("Estado civil: ");
        eCivil=leer.next();
        numId=lista.size();
        System.out.println("ID: "+numId);
        return per;
    }
    //recibe el id y la lista, si está devuelve que pertenece
    public int buscarId(ArrayList <Persona> lista){
        System.out.print("ID: ");
        int id = leer.nextInt();
        int pos = lista.size();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNumId()==id){
                pos=i;
            }
        }
        if(pos==lista.size()){
            System.out.println("\u001B[41mEl ID no se encuentra registrado"+reset);
        }
        return pos;
    }
    //recibe la lista, cambia el estado civil segun el id
    public void cambioECivil(Persona p){
        System.out.println("Estado civil actual de "+p.getNombre()+" "+p.getApellidos()+": "+p.geteCivil());
        System.out.print("Nuevo estado civil: ");
        p.seteCivil(leer.next());
        System.out.println("\u001B[42m----Cambio exitoso----"+reset);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre 
                + "\nApellidos: " + apellidos 
                + "\nEstado civil: " + eCivil 
                + "\nID: " + numId;
    }
    
    
}
