package Seccion_3_Strings;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Isaac";

        // Largo
        System.out.println("nombre.length() = " + nombre.length());
        // A mayusculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        // A minusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        // validar el contenido equials es case sencitive
        System.out.println("nombre.equals(\"Isaac\") = " + nombre.equals("Isaac"));
        System.out.println("nombre.equals(\"isaac\") = " + nombre.equals("isaac"));
        System.out.println("nombre.equals(\"isaac\") = " + nombre.equalsIgnoreCase("isaac"));

        // Comparar caracteres

        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Isaac"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("isaac"));
        
        // Obtener un char recibe un imt y retorna un char

        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(nombre.length()-1));


        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1,4)); // El primer numero es inclusivo, el segundo no se incluye
        
        String trabalengua = "trabalenguas";

        // Remplaza un caracter dentro de la cadena
        System.out.println("trabalengua.replace('a', '.') = " + trabalengua.replace('a', '.'));

        //Busca un caracter y devuelve la posicion de la primera coincidencia
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));

        //Busca un caracter y devuelve la posicion de la ultima coincidencia

        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('z')); // Si devuelve un -1 quiere decir que no encontro el caracter

        // Si contiene un caracter o cadena de texto devuelve un boolean
        System.out.println("trabalengua.contains(\"ba\") = " + trabalengua.contains("ba"));

        // si comiensa con una caracter o cadena de texto

        System.out.println("trabalengua.startsWith(\"lenguas\") = " + trabalengua.startsWith("lenguas"));
        System.out.println("trabalengua.startsWith(\"lenguas\") = " + trabalengua.startsWith("traba"));
        System.out.println("trabalengua.startsWith(\"lenguas\") = " + trabalengua.startsWith("Traba"));

        // Termina con

        System.out.println("trabalengua.startsWith(\"lenguas\") = " + trabalengua.endsWith("lenguas"));
        System.out.println("trabalengua.startsWith(\"lenguas\") = " + trabalengua.endsWith("traba"));

        // Eliminar espacios
        System.out.println("  trabalengua   ");
        System.out.println("  trabalengua   ".trim());


    }
}
