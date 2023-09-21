package Seccion_5_FlujosControl;

import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int mes = 0 ;

        int numDias = 0;
        int anio = 0;

        System.out.println("Ingrese Año: ");
        anio = s.nextInt();

        System.out.println("Ingrese mes: ");
        mes = s.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numDias = 30;
        } else if (mes == 2) {
            if(anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                numDias = 29;
            } else {
                numDias = 28;
            }
        }

        if (numDias == 29){
            System.out.println("El año ingresado es: " + anio + " el mes es " + mes + " y el mes tiene: " + numDias + " dias y es año bisiesto");
        } else {
            System.out.println("El año ingresado es: " + anio + " el mes es " + mes + " y el mes tiene: " + numDias + " dias y no es año bisiesto");
        }

    }
}
