package FlujosControl;

public class SwitchCase {
    public static void main(String[] args) {
        int num = 65;

        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                // debe ir con el break ya que si no va continuaria con los demas casos
                break;
            case 2:
                System.out.println("El numero es Dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("Caso por defecto");
        }
    }
}
