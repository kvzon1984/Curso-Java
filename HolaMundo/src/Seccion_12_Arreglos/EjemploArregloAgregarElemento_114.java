package Seccion_12_Arreglos;

import java.util.Scanner;

public class EjemploArregloAgregarElemento_114 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, posicion, ultimo;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }

        System.out.println("Ingresa el elemento a ingresar");
        elemento = s.nextInt();
        System.out.println("Ingresa la posicion en la que debe ser ingresado (de 0 a 9)");
        posicion = s.nextInt();

        ultimo = a[a.length-1];

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i+1] = a[i];
        }
        int[] b = new int[a.length + 1];
        System.arraycopy(a,0,b,0,a.length);

        b[posicion] = elemento;
        b[b.length - 1] = ultimo;

        System.out.println("Arreglo Final: ");
        for (int i = 0; i < b.length; i++) System.out.println( i + " => " +b[i]);
    }
}
