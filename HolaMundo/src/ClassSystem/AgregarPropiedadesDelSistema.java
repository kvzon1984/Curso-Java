package ClassSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AgregarPropiedadesDelSistema {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileInputStream archivo = new FileInputStream("src/config.properties");
            // ? Obtengo las properties
            Properties p = new Properties(System.getProperties());
            // ? Asigno nuevas properties
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "mi valor guardado en el archivo properties");
            // ? Las cargo al System
            System.setProperties(p);
            // ? Las vuelvo a obtener y en esta caso listar en consola
            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.out.println("No existe el archivo = " + e);
        }

    }
}
