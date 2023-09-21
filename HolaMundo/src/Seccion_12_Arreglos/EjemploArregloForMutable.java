package Seccion_12_Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArregloForMutable {

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String invertido = arreglo[total - 1 - i];
            arreglo[i] = invertido;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {
        String[] productos = {
                "Samsung galaxy",
                "Nokia",
                "Aphone 14",
                "Motorola",
                "Parlante",
                "Guitarra",
                "Notebook hp",
        };

        int total = productos.length;

        Arrays.sort(productos);
        arregloInverso(productos);

        System.out.println("=== Usando For invertido ===");

        for (int i = 0; i < total; i++) {
            System.out.println(productos[i]);
        }

        Collections.reverse(Arrays.asList(productos));

        System.out.println("=== Usando For invertido Reverse ===");

        for (int i = 0; i < total; i++) {
            System.out.println(productos[i]);
        }

    }
}
