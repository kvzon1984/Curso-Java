package Seccion_12_Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArregloEliminarElemento_113 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int posicion;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }

        System.out.println("Ingrese la posicion a eliminar (entre 0 y 9)");
        posicion = s.nextInt();


        for (int i = posicion; i < a.length - 1; i++) a[i] = a[i + 1];


        System.out.println("El nuevo arreglo a es: ");

        for (int j : a) System.out.println(j);

        int[] a2 = new int[a.length-1];
        //int[] a2 = Arrays.stream(a, 0, a.length - 1).toArray();

        /*for (int i = 0; i < a2.length; i++) {
            a2[i] = a[i];
        }*/

        System.arraycopy(a,0,a2,0, a2.length);
        System.out.println("El nuevo arreglo a2 es: ");
        for (int j : a2) System.out.println(j);
    }
}
