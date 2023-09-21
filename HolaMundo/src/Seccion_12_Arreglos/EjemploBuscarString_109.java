package Seccion_12_Arreglos;

import java.util.Scanner;

public class EjemploBuscarString_109 {
    public static void main(String[] args) {
        String[] a = new String[5];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese una palabra: ");
            a[i] = s.next();
        }

        System.out.println("Ingrese la palabra a buscar");
        String palabraBuscar = s.next();

        int i = 0;

        while (i < a.length && !palabraBuscar.equalsIgnoreCase(a[i])){
            i++;
        }

        if(i == a.length){
            System.out.println("Palabra no encontrado");
        } else if (palabraBuscar.toLowerCase().compareTo(a[i].toLowerCase()) == 0) { // El compare tu me entrega un numero si es 0 son iguales
            System.out.println("Palabra encontrada en la posicion: " + i );
        }
    }
}
