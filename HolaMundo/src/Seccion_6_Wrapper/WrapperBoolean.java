package Seccion_6_Wrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; // false
        Boolean objetoBoolean = Boolean.valueOf(primBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        // ! Aqui al comparar con el == compara por valor al igual que con equals
        System.out.println("Comparando dos objetos Boolean " + (objetoBoolean == objetoBoolean2));
        System.out.println("Comparando dos objetos Boolean " + (objetoBoolean.equals(objetoBoolean2)));
        System.out.println("Comparando dos objetos Boolean " + (objetoBoolean2 == objetoBoolean3));
        System.out.println("Comparando dos objetos Boolean " + (objetoBoolean == objetoBoolean3));

        boolean primitivoBoolean2 = objetoBoolean2.booleanValue();
        System.out.println("primitivoBoolean2 = " + primitivoBoolean2);

    }
}
