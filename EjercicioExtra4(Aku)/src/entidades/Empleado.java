package entidades;

import java.util.ArrayList;

public class Empleado extends Persona {
    protected String anioIncorporacion,numDespacho;

    public Empleado() {
    }

    public void setNumDespacho(String numDespacho) {
        this.numDespacho = numDespacho;
    }

    public String getNumDespacho() {
        return numDespacho;
    }

    public Empleado(String anioIncorporacion, String numDespacho, String nombre, String apellidos, String eCivil, Integer numId) {
        super(nombre, apellidos, eCivil, numId);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    
    @Override
    public Persona crearPersonaFacultad(ArrayList<Persona> lista, Persona per, Estudiante e, Profesor p, PersonalServicio ps, Empleado em) {
        super.crearPersonaFacultad(lista, per, e, p, ps, em);
        System.out.print("Año de incorporacón: ");
        anioIncorporacion=leer.next();
        System.out.print("Número despacho: ");
        numDespacho=leer.next();
        return em;          
    }
    
    
    
    public void cambioDespacho(Persona p) {
        Empleado object = (Empleado) p;
        System.out.println("Despacho actual del empleado " + p.getNombre() + " " + p.getApellidos() + ": " + object.getNumDespacho());
        System.out.print("Nuevo despacho: ");
        object.numDespacho = leer.next();
        System.out.println("\u001B[42m----Cambio exitoso----"+reset);
    }   

    @Override
    public String toString() {
        return  "\n\u001B[45mEmpleado\n\u001B[0m"
                +super.toString()
                +"\nAño de incorporación: "+ anioIncorporacion
                +"\nNúmero despacho: "+ numDespacho;
    }
    
    
    
}
