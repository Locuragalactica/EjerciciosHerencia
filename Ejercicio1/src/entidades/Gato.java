package entidades;

public final class Gato extends Animal {

    public Gato(String nombre, int edad, String raza, String alimento) {
        super(nombre, edad, raza, alimento);
    }

    @Override
    public void alimentarse() {
        System.out.println("Se alimenta de: " + alimento);
    }

}
