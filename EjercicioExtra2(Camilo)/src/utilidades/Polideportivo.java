/*
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

 */
package utilidades;

/**
 *
 * @author PAVILION
 */
public class Polideportivo extends Edificio {
    
    private String nombre;
    private String tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        double superficie = ancho*largo;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = ancho*alto*largo;
        return volumen;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public void llenarDatos() {
        super.llenarDatos();
        System.out.println("¿Cual es el nombre del polideportivo?");
        nombre = leer.next();
             System.out.println("¿Es el polideportivo techado o abierto?");
        tipoInstalacion = leer.next().toLowerCase(); 
    }
    
}
