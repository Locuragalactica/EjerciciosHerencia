/*




16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package herenciaextra2;

import java.util.ArrayList;
import utilidades.Edificio;
import utilidades.EdificioDeOficinas;
import utilidades.Polideportivo;

/**
 *
 * @author PAVILION
 */
public class HerenciaExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantAbierto=0, cantCerrados=0;
        ArrayList<Edificio> instalaciones = new ArrayList();
        Polideportivo p1 = new Polideportivo();
        Polideportivo p2 = new Polideportivo();
        EdificioDeOficinas e1 = new EdificioDeOficinas();
        EdificioDeOficinas e2 = new EdificioDeOficinas();
                instalaciones.add(p1);
        instalaciones.add(p2);
        instalaciones.add(e1);
        instalaciones.add(e2);
        for (Edificio aux : instalaciones) {
            aux.llenarDatos();
            System.out.println("La superficie es: " + aux.calcularSuperficie());
            System.out.println("El volumen es: " + aux.calcularVolumen());
            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).getTipoInstalacion().equals("abierto")) {
                    cantAbierto++;
                }else{
                    cantCerrados++;
                }
            }
              if (aux instanceof EdificioDeOficinas) {
             ((EdificioDeOficinas) aux).cantPersonas();
            }
        }
        System.out.println("La cantidad de polideportivos abiertos es de: "+cantAbierto);
        System.out.println("La cantidad de polideportivos cerrados es de: "+cantCerrados);
    }
    
}
