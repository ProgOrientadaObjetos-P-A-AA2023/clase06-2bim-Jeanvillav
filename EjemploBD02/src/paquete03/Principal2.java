package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal2 {

    public static void main(String[] args) {
        String[][] autos = {{"LBC0001", "230.2"},
        {"LBC0002", "330.2"},
        {"LBC0003", "430.2"},
        {"LBC0004", "530.1"},
        {"LBC0005", "130.2"},};

        Enlace c = new Enlace();
        
        for (int i = 0; i < autos.length; i++) {
            Auto aa = new Auto();
            aa.establecerPlaca(autos[i][0]);
            double precio= Double.parseDouble(autos[i][1]);
            aa.establecerValorMatricula(precio);
            c.insertarAuto(aa);
        }

        // 1. guardar en la tabla autos de la base de datos
        // 2. presentar todos los registros de la tabla autos de la base de 
        // datos
        for (int i = 0;
                i < c.obtenerDataAuto()
                        .size(); i++) {
            System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        }
    }
}
