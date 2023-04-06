package ClassSystem;

import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        String lineSeparator = System.getProperty("line.separator"); // * Salto de linea
        String lineSeparator2 = System.lineSeparator(); // * Es lo mismo pero mas corto
        System.out.println("lineSeparator:" + lineSeparator + "una linea nueva");

        // ! Para listar las propiedades de la clase System
        Properties p = System.getProperties();
        p.list(System.out);

    }
}
