package entidades;

public final class Caballo extends Animal {

    public Caballo(String nombre, int edad, String raza, String alimento) {
        super(nombre, edad, raza, alimento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void alimentarse() {
        System.out.println("Se alimenta de: " + alimento);
    }




}
