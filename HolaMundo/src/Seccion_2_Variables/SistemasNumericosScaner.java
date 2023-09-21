package Seccion_2_Variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScaner {
    public static void main(String[] args) {

        int numeroDecimal = 0;

        // Creamos la instancia de la clase scanera
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        // String numeroStr = scaner.nextLine();
        try {
            numeroDecimal = scaner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero");
            main(args);
            System.exit(2);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);

    }
}
