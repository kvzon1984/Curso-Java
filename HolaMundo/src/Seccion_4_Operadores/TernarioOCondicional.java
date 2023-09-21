package Seccion_4_Operadores;

import java.util.Scanner;

public class TernarioOCondicional {
    public static void main(String[] args) {
        //variable = condicion ? si es verdadero : devuelve otro valor
        
        String variable = 7 == 7 ? "son iguales" : "son distintos";

        System.out.println("variable = " + variable);

        double matematicas = 0.0;
        double lenguaje = 0.0;
        double ciencias = 0.0;


        String estado = "";
        double promedio = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas 2.0 - 7.0");
        matematicas = s.nextDouble();
        System.out.println("Ingrese la nota de lenguaje 2.0 - 7.0");
        lenguaje = s.nextDouble();
        System.out.println("Ingrese la nota de ciencias 2.0 - 7.0");
        ciencias = s.nextDouble();

        promedio = (matematicas + ciencias + lenguaje)/3;

        estado = promedio >= 5.49 ? "Aprobado" : "Reprobado";

        System.out.println("estado = " + estado + " " + promedio);
        
    }
}
