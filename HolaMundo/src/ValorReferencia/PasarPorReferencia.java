package ValorReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {

        // ! TODA VARIABLE PRIMITIVA SIEMPRE SE PASA POR VALOR YA QUE NO ES UN OBJETO
        int[] edades = {10, 25, 32, 58, 21, 56, 65};
        System.out.println("Iniciamos el metodo main");
        for (int edad : edades) {
            System.out.println("edades = " + edad);
        }
        System.out.println("Antes de llamar al metodo test");
        test(edades);
        System.out.println("Después de llamar el metodo test");
        for (int edad : edades) {
            System.out.println("edades = " + edad);
        }
        System.out.println("Finalizamos con el main con los valores ya modificados");
    }

    public static void test(int[] edadesArray) {
        System.out.println("Iniciamos el metodo test");
        for (int i = 0; i < edadesArray.length; i++) {
            edadesArray[i] += 1;
        }
        System.out.println("Finalizamos con el metodo test");
    }
}
