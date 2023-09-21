package Seccion_3_Strings;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = " "; // "Programacion Java"
        }



        boolean esVacio = curso.length() == 0; // Valida que no este vacio
        boolean esVacio2 = curso.isEmpty(); // Valida que no este vacio
        boolean esBlanco = curso.isBlank(); // Valida que no este en blanco
        System.out.println("esVacio = " + esVacio);

        if (!esBlanco) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curos ".concat(curso));
        }


    }
}
