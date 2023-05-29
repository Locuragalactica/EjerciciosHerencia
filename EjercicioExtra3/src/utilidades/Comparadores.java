package utilidades;

import entidades.Hotel.Hotel;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Hotel> OrdenarPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t1.getPrecio().compareTo(t.getPrecio());
        }

    };

}
