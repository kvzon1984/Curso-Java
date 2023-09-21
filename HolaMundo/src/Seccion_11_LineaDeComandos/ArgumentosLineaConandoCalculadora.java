package Seccion_11_LineaDeComandos;

public class ArgumentosLineaConandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3){
            System.err.println("debe ingresar una operacion y dos argumentos");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;
        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Los argumentos debes numericos");
            System.exit(-1);
        }


        switch (operacion){
            case "suma" :
            resultado = a+b;
                break;
            case "resta" :
                resultado = a-b;
                break;
            case "multi" :
                resultado = a*b;
                break;
            case "div" :
                if(b==0){
                    System.err.println("El divisor debe ser mayor a cero");
                    System.exit(-1);
                }
                resultado = (double)a/b;
                break;
            default:
                resultado = a+b;
        }
        System.out.println("El resultado de la operacion " + operacion + " es: " + resultado);
    }
}
