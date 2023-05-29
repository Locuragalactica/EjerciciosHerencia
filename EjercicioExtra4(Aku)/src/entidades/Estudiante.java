package entidades;

import java.util.ArrayList;

public class Estudiante extends Persona{

    private String curso;

    public Estudiante(String curso, String nombre, String apellidos, String eCivil, Integer numId) {
        super(nombre, apellidos, eCivil, numId);
        this.curso = curso;
    }

    public Estudiante() {
        
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void personasPreestablecidas(ArrayList <Persona> lista){
        ArrayList <Persona> estudiantes = new ArrayList();
        
        Estudiante e1 = new Estudiante("1A", "Pepo", "Chiquito", "soltero", 1);
        Estudiante e2 = new Estudiante("1B", "Pepe", "Chiquite", "casado", 2);
        Estudiante e3 = new Estudiante("1C", "Pepa", "Chiquita", "viudo", 3);

        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        
        lista.addAll(estudiantes);
    }
    
    @Override
    public Persona crearPersonaFacultad(ArrayList <Persona> lista,Persona per, Estudiante e, Profesor p, PersonalServicio ps, Empleado em) {
        super.crearPersonaFacultad(lista,per, e, p, ps,em); 
        System.out.print("Curso: ");
        curso= leer.next();
        return e;
    }

    public void matriculaciónAlumno(Persona p){
        Estudiante object = (Estudiante) p;
        System.out.println("Curso actual del alumno " + p.getNombre() + " " + p.getApellidos() + ": " + object.getCurso());
        System.out.print("Nuevo curso: ");
        object.curso=leer.next();
        System.out.println("\u001B[42m----Cambio exitoso----"+reset);
    }    

    @Override
    public String toString() { 
        return "\n\u001B[44m Estudiante \n"
                +super.toString()
                +"\nCurso: "+curso
                +"\n"; 
    }
    
}
