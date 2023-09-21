package Seccion_9_ClassSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class AgregarPropiedadesDelSistema {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            InputStream archivo = new FileInputStream("/home/ivega/Documents/Cursos/Curso-Java/HolaMundo/resources/config.properties"); // ? Obtengo las properties

            Properties p = new Properties(System.getProperties()); // ? Asigno nuevas properties

            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "mi valor guardado en el archivo properties");

            System.setProperties(p); // ? Las cargo al System

            Properties ps = System.getProperties();
            ps.list(System.out);

            System.out.println("-----------------------------------------------------");

            System.getProperties().list(System.out); // ? Las vuelvo a obtener y en esta caso listar en consola

            String puerto = System.getProperty("config.puerto.servidor");
            System.out.println("puerto = " + puerto);
        } catch (Exception e) {
            System.err.println("No existe el archivo = " + e);
            System.exit(1);
        }

    }
}
