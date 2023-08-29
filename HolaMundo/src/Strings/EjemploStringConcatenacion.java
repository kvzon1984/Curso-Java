package Strings;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = " Programacion con Java";
        String profesor = "Andres Guzman ";
        
        String detalle = curso + " con el intructor " +profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 5;
        int numeroB = 10;

        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);
        System.out.println(detalle + numeroA + numeroB);

        String detalle2 = curso.concat(" ".concat(profesor));

        System.out.println("detalle2 = " + detalle2);
        profesor = "Isaac Ferreira";

        System.out.println("ejemplo = " + detalle2);
        System.out.println("profesor = " + profesor);
    }
}
