package Seccion_4_Operadores;

public class Aricmeticos {
    public static void main(String[] args) {


        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        int resta = i - j;

        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        int multi = i * j;
        System.out.println("multi = " + multi);

        int div = i / j;
        float div2 = (float)i / j;

        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);
    }
}
