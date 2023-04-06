package Variables;

public class HolaMundo {
    /*
    PUBLIC: es un modificador de acceso que nos indica que esta clase o metodo
     llamar o ejecutar desde cualquier parte del programa o app

     VOID: quiere decir que este metodo no retorna nada solo ejecuta una instruccion
     */
    public static void main(String[] arg){
        // V A R I A B L E S
        String saludar = "Hola mundo desde java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        /* int no tiene metodos, ya que es primitivo */
        int numero = 10;
        System.out.println("numero = " + numero);
        /* Integer es una clase asi que este si tiene metodos */
        Integer otroNumero = 20;
        otroNumero.doubleValue();
        
        System.out.println("otroNumero = " + otroNumero);
        
        boolean valor = true;
        int numero2 = 30;
        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 50;
        }
        System.out.println("numero2 = " + numero2);

    }
}
