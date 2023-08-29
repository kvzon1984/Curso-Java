package Strings;

public class EjemploString {
    public static void main(String[] args) {
        // Los de tipo string son objetos
        String curso = "Porgramación en Java";
        String curso2 = new String("Porgramacion en java");
        String curso3 = "Porgramacio en Java";
        System.out.println("curso = " + curso);
        System.out.println("curso2 = " + curso2);

        // El doble igual compara si son de la misma instancia o referencia SON OBJETOS DISTINTOS
        boolean esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);
        
        esIgual = curso.equalsIgnoreCase(curso2);

        System.out.println("esIgual = " + esIgual);
    }
}
