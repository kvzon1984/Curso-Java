package Seccion_4_Operadores;

public class Incrementales {
    public static void main(String[] args) {

        // Pre-incremento
        int i = 1, j = ++i;

        System.out.println("Pre-incremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post-incremento

        i = 2;
        j = i++;

        System.out.println("Post-incremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre-decremento
        i = 3;
        j = --i;

        System.out.println("Pre-decremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post-decremento

        i = 2;
        j = i--;

        System.out.println("Post-decremento");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("----------");
        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + (j));
    }
}
