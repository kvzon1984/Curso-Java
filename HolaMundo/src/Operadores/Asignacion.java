package Operadores;

public class Asignacion {
    public static void main(String[] args) {
        int i = 5, j = i +4;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        i += 2;

        System.out.println("i = " + i);

        j -= 4;
        System.out.println("j = " + j);

        j *= 3;
        System.out.println("j = " + j);

        j /= 3;

        System.out.println("j = " + j);

        String sqlString = "select * from cliente as c";
        sqlString += " where c.nombre='Isaac'";
        sqlString += " and c.activo=1";
        sqlString += " order by c.nombre";

        System.out.println("sqlString = " + sqlString);


    }
}
