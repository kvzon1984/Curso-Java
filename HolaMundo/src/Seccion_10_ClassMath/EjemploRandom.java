package Seccion_10_ClassMath;

import java.util.Random;

public class EjemploRandom {
    public static void main(String[] args) {
        String[] colores = {"azul", "verde", "rojo", "amarillo", "rosado", "lila",};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;
        random = Math.floor(random);
        System.out.println("random = " + random);
        System.out.println("Color = " + colores[(int) random]);

        Random randomObj = new Random();

        int randomInt = randomObj.nextInt(15,25);
        System.out.println("randomInt = " + randomInt);
        System.out.println("Colores Random = " + colores[randomObj.nextInt(colores.length)]);


    }
}
