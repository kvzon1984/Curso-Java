package Seccion_12_Arreglos;

import java.util.Scanner;

public class EjemploArregloDesplazarPosicion_111 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, posicion;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }

        System.out.println("Ingresa el elemento a ingresar");
        elemento = s.nextInt();
        System.out.println("Ingresa la posicion en la que debe ser ingresado (de 0 a 9)");
        posicion = s.nextInt();

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i+1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("Arreglo Final: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }




    }
}
