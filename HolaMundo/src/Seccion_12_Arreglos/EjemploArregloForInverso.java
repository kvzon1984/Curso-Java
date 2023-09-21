package Seccion_12_Arreglos;

import java.util.Arrays;
public class EjemploArregloForInverso {

    public static void main(String[] args) {
        /*String[] productos = new String[7];
        productos[0] = "Samsung galaxy";
        productos[1] = "Nokia";
        productos[2] = "Aphone 14";
        productos[3] = "Motorola";
        productos[4] = "Parlante";
        productos[5] = "Guitarra";
        productos[6] = "Notebook hp";*/

        String[] productos = {
            "Samsung galaxy",
            "Nokia",
            "Aphone 14",
            "Motorola",
            "Parlante",
            "Guitarra",
            "Notebook hp",
        };

        Arrays.sort(productos);

        System.out.println("=== Usando For ===");

        int total = productos.length;
        for (int i = 0; i < total; i++) {
            System.out.println(productos[i]);
        }

        System.out.println("=== Usando Inversa ===");

        for (int i = 0; i < total; i++) {
            System.out.println(productos[total - 1 - i]);
        }

        System.out.println("=== Usando Inversa 2 ===");

        for (int i = total - 1; i >= 0; i--) {
            System.out.println(productos[i]);
        }
    }
}
