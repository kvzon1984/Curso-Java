package Seccion_4_Operadores;

import java.util.Scanner;

public class EjemploLogin {
    public static void main(String[] args) {

        /*String [] usernames = new String[2];
        String [] passwords = new String[2];

        usernames[0] = "isaac";
        passwords[0] = "123456";

        usernames[1] = "admin";
        passwords[1] = "654321";*/

        String[] usernames = {"isaac", "admin"};
        String[] passwords = {"123456", "654321"};

        boolean esAutenticado = false;

        Scanner scarnner = new Scanner(System.in);

        System.out.println("Ingrese nombre de usuario");
        String usuario = scarnner.next();

        System.out.println("Ingrese un password");
        String pass = scarnner.next();

        //System.out.println(usuario + pass);

        for (int i = 0; i < usernames.length; i++) {
            //System.out.println(i);
            esAutenticado = usernames[i].equalsIgnoreCase(usuario.trim()) && passwords[i].equals(pass) ? true : esAutenticado;

        }

        String mensaje = esAutenticado ? "Bienvenido ".concat(usuario).concat("...!!") : "Error verifica tus credenciales";

        /*if (esAutenticado) {
            System.out.println("Bienvenido ".concat(usuario).concat("...!!"));
        }else {
            System.out.println("Error verifica tus credenciales");
        }*/

        System.out.println(mensaje);


    }
}
