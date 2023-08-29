package Variables;

public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr;
        numeroStr = "25";
        System.out.println("numeroStr = " + numeroStr);
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "9856.25e-3";

        double realDooble = Double.parseDouble(realStr);
        System.out.println("realDooble = " + realDooble);
        
        String logicoStr = "true";
        
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);

        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);

        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt);

        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 2.54128e2;

        String otroRealStr = Double.toString(otroRealDouble);

        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(2.56e1f);

        System.out.println("otroRealStr = " + otroRealStr);

        // P R I M I T I V O S     A     P R I M I T I V O S

        int i = 40000;
        System.out.println("i = " + i);
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        
        char c = (char) i;
        System.out.println("c = " + c);
        
        float f = (float) i;

        System.out.println("f = " + f);

        float a = 25.65f;

        int b = 140;

        System.out.println(a + b + 15);
    }
}
