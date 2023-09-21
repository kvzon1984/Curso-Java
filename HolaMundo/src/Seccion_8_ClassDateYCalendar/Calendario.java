package Seccion_8_ClassDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
    public static void main(String[] args) {
        // ! Este metodo calendar es abstacto por ende no se puede instanciar con new Calendar para crear
        // ! el objeto calendar se debe crear Calendar.getInstance()

        Calendar calendario = Calendar.getInstance();
        // ! .set() nos permite asignar una fecha en particular
        // * calendario.set(2023, Calendar.APRIL, 6, 19, 35, 22);
        // ! Otra forma es a traves de las constantes
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.AUGUST);
        calendario.set(Calendar.DAY_OF_MONTH, 21);
        //calendario.set(Calendar.HOUR_OF_DAY, 23);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.AM);
        calendario.set(Calendar.MINUTE, 59);
        calendario.set(Calendar.SECOND, 15);
        Date fecha = calendario.getTime();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss:SSS a");

        String fechaFormateada = sd.format(fecha);
        System.out.println("fechaFormateada = " + fechaFormateada);
    }
}
