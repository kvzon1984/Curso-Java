package Variables;

public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean verdadero = true;
        System.out.println("verdadero = " + verdadero);

        boolean falso = false;
        System.out.println("falso = " + falso);

        boolean constanteBooleanFalse = Boolean.FALSE;
        System.out.println("constanteBooleanFalse = " + constanteBooleanFalse);

        boolean constanteBooleanTrue = Boolean.FALSE;
        System.out.println("constanteBooleanTrue = " + constanteBooleanTrue);

        double valorLogico = 254.5e-2; // 2.545
        System.out.println("valorLogico = " + valorLogico);

        float valorLogico2 = 3.21456e3f; // 3214.56
        System.out.println("valorLogico2 = " + valorLogico2);

        boolean validacion = valorLogico > valorLogico2;
        System.out.println("validacion = " + validacion);
        
        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
