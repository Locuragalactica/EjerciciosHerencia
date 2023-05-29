package entidades;

import java.util.ArrayList;

public class PersonalServicio extends Empleado{
    private String seccion;

    public PersonalServicio(String seccion, String anioIncorporacion, String numDespacho, String nombre, String apellidos, String eCivil, Integer numId) {
        super(anioIncorporacion, numDespacho, nombre, apellidos, eCivil, numId);
        this.seccion = seccion;
    }

    public PersonalServicio() {
        
    }

    public String getSeccion() {
        return seccion;
    }

    
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void personasPreestablecidas(ArrayList <Persona> lista){
        ArrayList <Persona> personalServicio = new ArrayList();
        
        PersonalServicio ps1 = new PersonalServicio("Biblioteca", "2004", "69", "Pascual", "Jota", "viudo", 7);
        PersonalServicio ps2 = new PersonalServicio("Secretaria", "2003", "51", "Vilma", "Lira", "Casada", 8);
        PersonalServicio ps3 = new PersonalServicio("Decanato", "2020", "50", "Camilo", "Ale", "Soltero", 9);

        personalServicio.add(ps1);
        personalServicio.add(ps2);
        personalServicio.add(ps3);
        
        lista.addAll(personalServicio);
    }
    
    @Override
    public Persona crearPersonaFacultad(ArrayList<Persona> lista, Persona per, Estudiante e, Profesor p, PersonalServicio ps, Empleado em) {
        super.crearPersonaFacultad(lista, per, e, p, ps, em);
        System.out.print("Sección: ");
        seccion=leer.next();
        return ps;
    }
    
    public void cambioSeccion(Persona p) {
        PersonalServicio object = (PersonalServicio) p;
        System.out.println("Sección actual del personal de servicio " + object.getNombre() + " " + object.getApellidos() + ": " + object.getSeccion());
        System.out.print("Nueva sección: ");
        object.seccion = leer.next();
        System.out.println("\u001B[42m----Cambio exitoso----"+reset);
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nPersonal de Servicio de la sección de "+seccion
                +"\n";  
    }
    
    
}
