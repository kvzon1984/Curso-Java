package ValorReferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        // ! TODA VARIABLE PRIMITIVA SIEMPRE SE PASA POR VALOR YA QUE NO ES UN OBJETO
        int i = 10;
        System.out.println("Iniciamos el metodo main con el valor de i = " + i);

        test(i);

        System.out.println("Finalizamos con el main con i = " + i);
    }

    public static void test (int i){
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("Finalizamos con el metodo test con i = " + i);
    }
}
