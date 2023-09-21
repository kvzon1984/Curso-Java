package Seccion_12_Arreglos;

import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 5 numeros enteros");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int max = 0;
        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i]) ? max : i;
        }

        System.out.println("El numero mayor es: " + a[max]);

        int min = 0;
        for (int i = 1; i < a.length; i++) {
            min = (a[min] < a[i]) ? min : i;
        }

        System.out.println("El numero mayor es: " + a[min]);
    }
}
