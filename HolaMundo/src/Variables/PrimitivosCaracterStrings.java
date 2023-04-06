package Variables;

public class PrimitivosCaracterStrings {
    public static void main(String[] args) {
        char caracter = 'm';
        char unicode = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("unicode = " + unicode);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == unicode));

        char espacio = '\u0020'; // ' '
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("El char corresponde en\t byte a =" + tabulador + Character.BYTES);
        System.out.println("El char corresponde \nen bites a = " + Character.SIZE);
        System.out.println("El valor \rmaximo de un char es = " + Character.MAX_VALUE);
        System.out.println("El valor minimo de un char es = " + System.lineSeparator() + Character.MIN_VALUE);



    }
}
