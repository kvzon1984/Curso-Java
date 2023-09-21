package Seccion_5_FlujosControl;

public class EtiquetasBuscarEjemplo {
    public static void main(String[] args) {

        String frase = "El niño salió corriendo después de su travesura.";
        String palabra = "travesura";
        char caracter = 'ó';
        int cantidad = 0;

        padre:
        for (int i = 0; i < frase.length(); i++){
            int k = i;
            for (int j = 0; j < palabra.length(); j++) {
                if (frase.toLowerCase().charAt(k++) != palabra.toLowerCase().charAt(j)) {
                    continue padre;
                }
            }
            cantidad++;
        }

        System.out.println("cantidad = " + cantidad);
    }
}
