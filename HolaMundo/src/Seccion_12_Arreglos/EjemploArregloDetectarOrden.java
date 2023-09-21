package Seccion_12_Arreglos;

import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 7 numeros enteros");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        boolean descendente = false;
        boolean ascendente = false;
        for (int i = 1; i < a.length - 1; i++) {

            if(a[i] > a[i + 1]){
                descendente = true;
            }
            if(a[i] < a[i + 1]){
                ascendente = true;
            }

        }
        if (descendente && ascendente){
            System.out.println("Arerglo desordenado");
        }
        if (!descendente && !ascendente){
            System.out.println("Son todos los numeros iguales");
        }
        if (descendente && !ascendente){
            System.out.println("Arreglo = Ordenado de forma descendente");
        }
        if (!descendente && ascendente){
            System.out.println("Arreglo = Ordenado de forma ascendente");
        }
    }
}
