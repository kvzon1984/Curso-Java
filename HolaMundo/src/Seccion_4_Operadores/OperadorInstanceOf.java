package Seccion_4_Operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        // Para ocupar el instanceOf se usa solo para objetos de referencia no para primitivos
        String texto = "Creando un objeto de la clase string";

        Integer num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        // TIPOS GENERICOS O ABSTRACTOS

        Object texto2 = "Creando un objeto de la clase string";

        Number num2 = 7;

        b1 = texto2 instanceof Integer;
        System.out.println("texto2 es del tipo Integer = " + b1);

        b1 = num2 instanceof Integer;
        System.out.println("num2 es del tipo Integer = " + b1);

        b1 = num2 instanceof Long;
        System.out.println("texto2 es del tipo Long = " + b1);


    }
}
