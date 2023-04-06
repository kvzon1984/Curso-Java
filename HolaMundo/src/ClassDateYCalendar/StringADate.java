package ClassDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringADate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingresa una fecha (YYYY-MM-dd)");
        try {
            Date fecha = sdf.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("Fecha formateada = " + sdf.format(fecha));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
