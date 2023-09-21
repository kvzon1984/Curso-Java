package Seccion_12_Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArregloDesplazarPosicion_112 {
    public static void main(String[] args) {
        int[] a = new int[7];
        int numero, posicion;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }

        System.out.println("Ingresa el elemento a ingresar");
        numero = s.nextInt();

        posicion = 0;

        while (posicion < a.length && numero > a[posicion]){
            posicion++;
        }

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i+1] = a[i];
        }
        a[posicion] = numero;

        System.out.println("El nuevo arreglo es: ");

        /*for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/

        //for (int i = 0; i < a.length; i++) System.out.println(a[i]);

        for (int j : a) System.out.println(j);

        //Arrays.stream(a).forEach(System.out::println);
    }
}
