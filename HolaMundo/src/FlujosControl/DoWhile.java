package FlujosControl;

public class DoWhile {
    public static void main(String[] args) {

        // W H I L E
        int i = 0;

        while (i<5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;

        boolean prueba = true;
        while (prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        // D O     W H I L E

        prueba = false;
        do {
            System.out.println("Se ejectuta al menos una vez");

        } while(prueba);


    }
}
