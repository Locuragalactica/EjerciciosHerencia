package entidades;

import java.util.ArrayList;

public class Profesor extends Empleado {
    
    private String departamento;

    public Profesor() {
    }
    
    public Profesor(String departamento, String anioIncorporacion, String numDespacho, String nombre, String apellidos, String eCivil, Integer numId) {
        super(anioIncorporacion, numDespacho, nombre, apellidos, eCivil, numId);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void personasPreestablecidas(ArrayList <Persona> lista){
        ArrayList <Persona> profesores = new ArrayList();
        Profesor p1 = new Profesor("Matematíca", "2015", "4", "Agusto", "Lopez", "Casado", 4);
        Profesor p2 = new Profesor("Arquitectura", "2001", "89", "Pedro", "Perez", "Divorciado", 5);
        Profesor p3 = new Profesor("Leguaje", "2018", "25", "Javier", "Ocampo", "Soltera", 6);
        profesores.add(p1);
        profesores.add(p2);
        profesores.add(p3);
        lista.addAll(profesores);
    }
    
    @Override
    public Persona crearPersonaFacultad(ArrayList<Persona> lista, Persona per, Estudiante e, Profesor p, PersonalServicio ps, Empleado em) {
        super.crearPersonaFacultad(lista, per, e, p, ps, em);
        System.out.print("Departamento: ");
        departamento=leer.next();
        return p;
    }

    
    public void cambioDpto(Persona p) {
        Profesor object = (Profesor) p;
        System.out.println("Departamento actual del profesor " + object.getNombre() + " " + object.getApellidos() + ": " + object.getDepartamento());
        System.out.print("Nuevo departamento: ");
        object.departamento = leer.next();
        System.out.println("\u001B[42m----Cambio exitoso----"+reset);
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nProfesor del departamento de "+departamento
                +"\n"; 
    }

}
