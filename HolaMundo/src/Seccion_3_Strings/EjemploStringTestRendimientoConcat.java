package Seccion_3_Strings;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            //c = c.concat(a).concat(b).concat("\n");
            //c += a + b + "\n";
            sb.append(a).append(b).append("\n");
        }

        System.gc(); // este metodo es opcional ya que java lo hace de forma automatica pero puede ser opcional

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);

        System.out.println("c " + c);
        System.out.println("sb = " + sb.toString());
    }
}
