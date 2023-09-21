package Seccion_3_Strings;

public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.java";

        System.out.println("archivo.length() = " + archivo.length());

        System.out.println("archivo = " + archivo.substring(archivo.lastIndexOf('.') + 1));
    }
}
