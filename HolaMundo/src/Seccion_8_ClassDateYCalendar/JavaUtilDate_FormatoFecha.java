package Seccion_8_ClassDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate_FormatoFecha {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd-MMMM-yyy HH:mm:ss");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
    }
}
