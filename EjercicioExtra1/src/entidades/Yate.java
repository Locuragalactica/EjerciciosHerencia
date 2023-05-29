package entidades;

public class Yate extends Barco {

    private double potenciaCV;
    private int numCamarote;

    public Yate() {
    }

    public Yate(double potenciaCV, int numCamarote) {
        this.potenciaCV = potenciaCV;
        this.numCamarote = numCamarote;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamarote() {
        return numCamarote;
    }

    public void setNumCamarote(int numCamarote) {
        this.numCamarote = numCamarote;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Potencia CV: " + potenciaCV + "\n"
                + "Numero de Camarotes: " + numCamarote;
    }

    public void crearYate(Yate y) {
        super.crearBarco(y);
        System.out.println("Ingrese la potencia en CV:");
        y.setPotenciaCV(leer.nextDouble());
        System.out.println("Ingrese la cantidad de camarotes");
        y.setNumCamarote(leer.nextInt());
        System.out.println("--------------Barco Ingresado--------------");
    }
}
