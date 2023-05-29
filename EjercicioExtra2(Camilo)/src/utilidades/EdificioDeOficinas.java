/*
 • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package utilidades;

/**
 *
 * @author PAVILION
 */
public class EdificioDeOficinas extends Edificio {
    
    private int nOficinas;
    private int cantPersonasxOficina;
    private int numPisos;

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
     @Override
        public void llenarDatos() {
        super.llenarDatos();
    }
    
    public void cantPersonas(){
        System.out.println("Digite el numero de oficinas que hay en un piso");
        nOficinas = leer.nextInt();
         System.out.println("Digite el numero de pisos del edificio");
        numPisos = leer.nextInt();
        System.out.println("Digite el numero de personas que caben en una oficina");
        cantPersonasxOficina = leer.nextInt();
        int cantPersonasxPiso=nOficinas*cantPersonasxOficina;
        int cantPersonasEdificio=nOficinas*numPisos*cantPersonasxOficina;
        System.out.println("La cantidad de personas que caben en un piso es de: "+cantPersonasxPiso
                +"\nMientras que la cantidad de personas que caben en el edificio es de: "+cantPersonasEdificio);
    }
}
