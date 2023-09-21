package Seccion_12_Arreglos;

public class EjemploArregloForOrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String invertido = arreglo[total - 1 - i];
            arreglo[i] = invertido;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }
    public static void sortBurbuja(Object[] arreglo){
        for( int i =0; i < arreglo.length - 1; i++ ) {

            for (int j = 0; j < arreglo.length - 1 - i; j++){
                if( ((Comparable)arreglo[j + 1]).compareTo(arreglo[j]) > 0 ){ //  //if( Integer.compare(numeros[j + 1], numeros[j]) < 0 ){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] productos = {
                "Samsung galaxy",
                "Nokia",
                "Aphone 14",
                "Motorola",
                "Parlante",
                "Guitarra",
                "Notebook hp",
        };

        /* ejemplo 1 ordenamiento sort
        for(int i =0; i< total; i++) {

            for (int j = 0; j<total; j++){
                if(productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }


        for( int i =0; i < total - 1; i++ ) {

            for ( int j = 0; j <total - 1 - i; j++ ){
                if(productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
            }
        }

        System.out.println("contador = " + contador);

         */

        //Arrays.sort(productos);
        //arregloInverso(productos);

        System.out.println("=== Usando For Ordenamiento Burbuja ===");

        sortBurbuja(productos);

        for ( int i = 0; i < productos.length; i++ ) {
            System.out.println(productos[i]);
        }

        System.out.println("=== Usando ordenado int ===");

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = Integer.parseInt("25");
        numeros[2] = 35;
        numeros[3] = -5;

        sortBurbuja(numeros);


        for ( int i = 0; i < numeros.length; i++ ) {
            System.out.println(numeros[i]);
        }

    }
}
