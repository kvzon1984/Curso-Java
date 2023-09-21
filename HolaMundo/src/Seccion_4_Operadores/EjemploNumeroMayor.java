package Seccion_4_Operadores;

import java.util.Scanner;

public class EjemploNumeroMayor {
    public static void main(String[] args) {

        // ---------------------- NUMERO MAYOR

        Scanner s = new Scanner(System.in);

        long numMayor = 0;

        int numero1 = 0;
        int numero2 = 0;
        long numero3 = 0;

        System.out.println("Ingrese un numero 1");
        numero1 = s.nextInt();
        System.out.println("Ingrese un numero 2");
        numero2 = s.nextInt();
        System.out.println("Ingrese un numero 3");
        numero3 = s.nextLong();

        numMayor = numero1 > numero2 ? numero1 : numero2;
        numMayor = numMayor > numero3 ? numMayor : numero3;

        System.out.println("El numero mayor es: " + numMayor);

    }
}
