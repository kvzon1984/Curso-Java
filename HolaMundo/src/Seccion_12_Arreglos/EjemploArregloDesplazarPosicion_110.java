package Seccion_12_Arreglos;

import java.util.Scanner;

public class EjemploArregloDesplazarPosicion_110 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int ultimo;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        
        ultimo = a[a.length-1];
        for (int i = a.length-2; i >= 0; i--) {
            a[i+1] = a[i];
        }
        a[0] = ultimo;

        System.out.println("Arreglo Final: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }




    }
}
