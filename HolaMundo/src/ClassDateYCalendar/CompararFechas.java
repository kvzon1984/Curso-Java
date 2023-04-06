package ClassDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompararFechas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingresa una fecha (YYYY-MM-dd)");
        try {
            Date fecha = sdf.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("Fecha formateada = " + sdf.format(fecha));
            Date fechaActual = new Date();
            System.out.println("fechaActual = " + fechaActual);
            if (fecha.after(fechaActual)){
                System.out.println("Fecha es despues o mayor de la fecha actual");
            } else if (fecha.before(fechaActual)) {
                System.out.println("Fecha es anterior a la fecha actual");
            } else if (fecha.equals(fechaActual)){
                System.out.println("Fecha es igual a la fecha actual");
            }

            if (fecha.compareTo(fechaActual) > 0){
                System.out.println("Fecha es mayor despues que fecha actual");
            } else if (fecha.compareTo(fechaActual) < 0) {
                System.out.println("Fecha es menor o anterior que fecha actual");
            } else if (fecha.compareTo(fechaActual) == 0 ) {
                System.out.println("Las fecha son iguales");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
