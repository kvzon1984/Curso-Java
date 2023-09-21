package Seccion_6_Wrapper;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        // ! AL OCUPAR UN == EN UNA CLASE WRAPPER VALIDA SI SON LA MISMA INSTANCIA
        // ! PERO SI OCUPAMOS EL == EN INA CLASE PRIMITIVA VALIDA EL VALOR
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo OBJETO? " + (num1 == num2));
        // ! PARA COMPARAR VALORES ENTRE PRIMITIVOS SE USA DOS OPCIONES EL .EQUALS O PASARLOS A PRIMITIVOS
        System.out.println("Son el mismo VALOR? " + (num1.equals(num2)));
        System.out.println("Son el mismo VALOR? " + (num1.intValue() == num2.intValue()));
    }
}
