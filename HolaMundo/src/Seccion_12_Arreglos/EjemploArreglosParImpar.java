package Seccion_12_Arreglos;

import java.util.Scanner;

public class EjemploArreglosParImpar {
    public static void main(String[] args) {

        int[] a, pares, impares;
        int par = 0, impar = 0;
        a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros enteros");

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        pares = new int[par];
        impares = new int[impar];

        int j = 0;
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0) {
                pares[j++]=a[i];
            } else {
                impares[k++] = a[i];
            }
        }


        System.out.print("Pares = ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print( pares[i] + " ");
        }
        System.out.println();
        System.out.print("Impares = ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print( impares[i] + " ");
        }
    }
}
