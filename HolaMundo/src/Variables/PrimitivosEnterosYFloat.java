package Variables;

public class PrimitivosEnterosYFloat {
    // Esta es una variable de la clase y para poder ser usada en el metodo main es necesario ponerle static,
    // Ya que el metodo main es estatico
    static float flotante ;
    static int numero ;
    public static void main(String[]  args) {
        // P R I M I T I V O S
        // Son tipos de datos escalares que contienen  un solo valor
        // Se escriben con minusculas

        //B O O L E A N
        boolean a = false;
        System.out.println("a = " + a);
        boolean b = true;
        System.out.println("b = " + b);

        //C H A R
        char c = 'c';
        System.out.println("c = " + c);

        char d = 'd';
        System.out.println("d = " + d);
        char e = '\u0021';
        System.out.println("e = " + e);

        // E N T E R O S

        byte f = 127;
        System.out.println("f = " + f);
        short g = 32767;
        System.out.println("g = " + g);
        int h = 2147483647;
        System.out.println("h = " + h);
        long i = 9223372036854775807L;
        System.out.println("i = " + i);

        // F L O A T

        float j = 3.1416f;
        System.out.println("j = " + j);
        double k = 4.7029235E3;
        System.out.println("k = " + k);

        // P R I M I T I V O S      B Y T E
        
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("El byte corresponde en byte a = " + Byte.BYTES);
        System.out.println("El byte corresponde en bites a = " + Byte.SIZE);
        System.out.println("El valor maximo de un byte es = " + Byte.MAX_VALUE);
        System.out.println("El valor minimo de un byte es = " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("El short corresponde en byte a = " + Short.BYTES);
        System.out.println("El short corresponde en bites a = " + Short.SIZE);
        System.out.println("El valor maximo de un short es = " + Short.MAX_VALUE);
        System.out.println("El valor minimo de un short es = " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("El int corresponde en byte a = " + Integer.BYTES);
        System.out.println("El int corresponde en bites a = " + Integer.SIZE);
        System.out.println("El valor maximo de un int es = " + Integer.MAX_VALUE);
        System.out.println("El valor minimo de un int es = " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("El long corresponde en byte a = " + Long.BYTES);
        System.out.println("El long corresponde en bites a = " + Long.SIZE);
        System.out.println("El valor maximo de un long es = " + Long.MAX_VALUE);
        System.out.println("El valor minimo de un long es = " + Long.MIN_VALUE);

        var numeroVar = 2147483647;
        System.out.println("numeroVar = " + numeroVar);


        float numeroFloat = 922337;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("El float corresponde en byte a = " + Float.BYTES);
        System.out.println("El float corresponde en bites a = " + Float.SIZE);
        System.out.println("El valor maximo de un float es = " + Float.MAX_VALUE);
        System.out.println("El valor minimo de un float es = " + Float.MIN_VALUE);

        double numeroDouble = 9225d;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("El double corresponde en byte a = " + Double.BYTES);
        System.out.println("El double corresponde en bites a = " + Double.SIZE);
        System.out.println("El valor maximo de un double es = " + Double.MAX_VALUE);
        System.out.println("El valor minimo de un double es = " + Double.MIN_VALUE);

        // V A L O R E S     P O R     D E F E C T O
        
        // float varFlotante = 0.0f;

        System.out.println("flotante = " + flotante);
        System.out.println("numero = " + numero);
    }
}
