package entidades;

public class Persona {

    protected String nombre, apellido, ID, estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String ID, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\n"
                + "ID: " + ID + "\n"
                + "Estado Civil: " + estadoCivil;
    }

}
