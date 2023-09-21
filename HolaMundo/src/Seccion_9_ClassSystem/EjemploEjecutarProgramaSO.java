package Seccion_9_ClassSystem;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {
            if( System.getProperty("os.name").toLowerCase().startsWith("Windows") ){
                System.out.println("Windows");
                proceso = rt.exec("note");
            } else if( System.getProperty("os.name").toLowerCase().startsWith("mac") ){
                System.out.println("Mac");
                proceso = rt.exec("textedit");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix") ) {
                System.out.println("Linux");
                proceso = rt.exec("gedit");
            } else {
                System.out.println("Else");
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        } catch (Exception e) {
            System.err.println("El comando es desconocido" + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se a cerrado el editor...");
        System.exit(0);
    }
}
