package ClassDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate_FormatoFecha {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
    }
}
