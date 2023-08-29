package Wrapper;

public class IntegerWrapper {
    public static void main(String[] args) {
        //? Integer intObjeto = 32768
        int intPrimitivo   = 327696;
        Integer intObjeto  = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;

        System.out.println("intObjeto = " + intObjeto);

        //! Convertir de wrapper a primitivo
        int num  = intObjeto2;
        System.out.println("num = " + num);
        int num2 = intObjeto2.intValue();
        System.out.println("num2 = " + num2);
        
        String valorTvLed = "67000";
        // ! Convertir de String a valor entero
        Integer valor = Integer.valueOf(valorTvLed);
        System.out.println("valor = " + valor);

        // ! HAY QUE TENER MUCHO CUIDADO AL CONVERTIR UN VALOR INT A SHORT O BYTE
        // ! YA QUE COMO SON VALORES MENORES LOS QUE SOPORTAN ESTO PUEDE PROVOCAR PERDIDA DE VALOR O AMBIGÜEDAD

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObject = intObjeto.longValue();
        System.out.println("longObject = " + longObject);


    }
}
