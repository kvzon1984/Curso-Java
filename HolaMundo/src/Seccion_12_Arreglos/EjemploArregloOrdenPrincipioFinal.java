package Seccion_12_Arreglos;

public class EjemploArregloOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] nuevoArreglo = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }

        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++) {
            System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i]);
            nuevoArreglo[aux++] = numeros[i];
            nuevoArreglo[aux++] = numeros[numeros.length - 1 - i];
        }

        for (int i = 0; i < nuevoArreglo.length ; i++) {
            System.out.print(nuevoArreglo[i] + ", ");
        }

    }
}
