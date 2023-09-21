package Seccion_5_FlujosControl;

public class ForEach {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9};

        for (int num : numeros) {
            System.out.println("num = " + num);
        }

        String[] animales = {"Perro", "Gato", "Conejo", "Hamster", "Caballo", "Pajaro" };

        for (String animal:
             animales) {
            System.out.println("animal = " + animal);
        }
    }
}
