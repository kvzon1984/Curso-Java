package Seccion_12_Arreglos;

import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] = "Samsung galaxy";
        productos[1] = "Nokia";
        productos[2] = "Aphone 14";
        productos[3] = "Motorola";
        productos[4] = "Parlante";
        productos[5] = "Guitarra";
        productos[6] = "Notebook hp";

        Arrays.sort(productos); // Sort lo que hace es lo oedena de forma ascendente

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        int[] numeros = new int[4];
        numeros[0] = 10;
        numeros[1] = Integer.parseInt("25");
        numeros[2] = 35;
        numeros[3] = -5;
        // numeros[4] = 5;

        Arrays.sort(numeros);

        int a = numeros[0];
        int b = numeros[1];
        int c = numeros[2];
        int d = numeros[3];
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);


    }
}
