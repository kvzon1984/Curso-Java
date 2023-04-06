package Variables;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 0;

        // S I S T E M A      D E C I M A L

        String numeroStr = JOptionPane.showInputDialog(null ,  "Ingrese un numero entero");
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero");
            main(args);
            System.exit(2);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario); // El tipo de dato es un string
        int numeroBinario = 0b111110100; // Anteponiendo un 0b le decimos al compilador que el número es un número binario

        System.out.println("Numero entero = " + numeroBinario);

        // S I S T E M A      O C T A L

        String resultadoOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764; // Al anteponer un cero(0) antes del numero le decimos al compilador que el numero es octal

        System.out.println("numeroOctal = " + numeroOctal);

        // S I S T E M A      H E X A D E C I M A L

        String resultadoHex = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        int numeroHexadecimal = 0x1f4; // Al anteponer un 0x le decimos al compilador que es un numero hexadecimal puede ser la letra en mayuscula igual que el f

        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
