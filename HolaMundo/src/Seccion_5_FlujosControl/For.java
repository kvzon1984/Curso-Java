package Seccion_5_FlujosControl;

import javax.swing.*;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }

        String[] nombres = {"Lucas", "Isaac", "pepe", "Juan"};
        int count = nombres.length;

        for (int i = 0; i<count;i++){
            if (nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("PePe".toLowerCase())){
                continue;
            }
            System.out.println(i + " .- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre ejemplo: \"pepe\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado= true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, "El nombre fue encontrado " + buscar);
        } else {
            JOptionPane.showMessageDialog(null, "Nombre no fue encontrado");
        }
    }
}
