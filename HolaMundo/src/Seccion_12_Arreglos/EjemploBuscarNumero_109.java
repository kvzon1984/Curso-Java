package Seccion_12_Arreglos;

import java.util.Scanner;

public class EjemploBuscarNumero_109 {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un Numero: ");
            a[i] = s.nextInt();
        }

        System.out.println("Ingrese el numero a buscar");
        int numBuscar = s.nextInt();
        int i = 0;

        while (i < a.length && numBuscar != a[i]){
            i++;
        }

        if(i == a.length){
            System.out.println("Numero no encontrado");
        } else if (numBuscar == a[i]) {
            System.out.println("Numero encontrado en la posicion: " + i );
        }
    }
}
