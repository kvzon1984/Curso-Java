package Seccion_12_Arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] = "Samsung galaxy";
        productos[1] = "Nokia";
        productos[2] = "Aphone 14";
        productos[3] = "Motorola";
        productos[4] = "Parlante";
        productos[5] = "Guitarra";
        productos[6] = "Notebook hp";

        Arrays.sort(productos);

        System.out.println("=== Usando For ===");

        int total = productos.length;
        for (int i = 0; i < total; i++) {
            System.out.println(productos[i]);
        }

        System.out.println("=== Usando Foreach ===");

        for ( String prod: productos ) {
            System.out.println(prod);
        }

        System.out.println("=== Usando While ===");

        int j = 0;
        while (j < total) {
            System.out.println(productos[j]);
            j++;
        }

        System.out.println("=== Usando Do While ===");

        int k = 0;

       do {
            System.out.println(productos[k]);
           k++;
        } while (k < total);

        int[] numeros = new int[10];


        System.out.println("=== Usando For ===");

        total = numeros.length;
        for (int i = 0; i < total; i++) {
            numeros[i] = i * 2;
        }
        for (int i = 0; i < total; i++) {
            System.out.println(numeros[i]);
        }
    }
}
