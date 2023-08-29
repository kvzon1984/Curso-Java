package Strings;

import java.util.Arrays;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
                
        String trabalengua = "trabalenguas";

        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray()); // Esto imprime el identificador 
        
        char [] array = trabalengua.toCharArray();
        
        int largo = array.length;

        for (int i = 0; i < largo; i++){

            System.out.println("Arreglo[i]: " + array[i]);
            
        }

        // Divide un elemento en arreglos
        System.out.println("trabalengua.split(\"a\") = " + trabalengua.split("a"));

        String [] array2 = trabalengua.split("a");
        int l = array2.length;

        for (int i = 0; i < l; i++){

            System.out.println(array2[i]);

        }

        String archivo = "alguna.imagen.java";

        // El punto no funciona ya que es una exprecion regular por ende hay que escaparla con un \\ o con corchetes [.]
        String [] archivoSplit = archivo.split("\\.");

        System.out.println(Arrays.toString(archivoSplit)); // Arrays.toString() me imprime el arreglo en una sola linea

        for (int i = 0; i < archivoSplit.length; i++){

            System.out.println(archivoSplit[i]);

        }

        System.out.println("Extension = " + archivoSplit[archivoSplit.length - 1]);

    }
}
