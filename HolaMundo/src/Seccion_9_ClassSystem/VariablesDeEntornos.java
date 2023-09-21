package Seccion_9_ClassSystem;

import java.util.Map;

public class VariablesDeEntornos {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println(" Variables de ambiente del sistema = " + varEnv);
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        String javaHome = System.getenv("HOME");
        System.out.println("javaHome = " + javaHome);
        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        String path = System.getenv("PATH");
        System.out.println("path = " + path);
        String home = System.getenv("SNAP_REAL_HOME");
        System.out.println("home = " + home);

        System.out.println("--------- Listando las variables de entornos ----------");

        for (String Key: varEnv.keySet()){
            System.out.println(Key + " => " + varEnv.get(Key));
        }

    }

}
