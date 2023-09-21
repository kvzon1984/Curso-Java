package Seccion_10_ClassMath;

public class ClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);
        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);
        double techo = Math.ceil(3.2);
        System.out.println("techo = " + techo);
        double piso = Math.floor(3.2);
        System.out.println("piso = " + piso);
        int entero = Math.round(3.5f);
        System.out.println("entero = " + entero);
        entero = Math.round(3.4f);
        System.out.println("entero = " + entero);
        long pi = Math.round(Math.PI);
        System.out.println("pi = " + pi);
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);
        double log = Math.log(2);
        System.out.println("log = " + log);
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        double raiz = Math.sqrt(25);
        System.out.println("raiz = " + raiz);
        double grados = Math.toDegrees(1.57);
        System.out.println("Convertir a grados = " + grados);
        double radianes = Math.toRadians(90.0);
        System.out.println("Convertir a radianes = " + radianes);

        System.out.println("Math.sin(90) = " + Math.sin(radianes)); // Este metodo recibe radianes
        System.out.println("Math.cos(90) = " + Math.cos(radianes));
        radianes = Math.toRadians(180.0);
        System.out.println("Math.cos(90) = " + Math.cos(radianes));
        radianes = Math.toRadians(0.0);
        System.out.println("Math.cos(90) = " + Math.cos(radianes));

    }
}
