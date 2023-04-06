package Wrapper;
import java.lang.reflect.Method;

public class GetClassEjemplo {
    public static void main(String[] args) {

        String texto = "Hola Mundo";
        Class strClass = texto.getClass();
        System.out.println("strClass = " + strClass);
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());

        for (Method metodo :
                strClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        Integer num = 32;
        Class objClass = num.getClass();

        System.out.println("objClass = " + objClass);
        System.out.println("objClass.getName() = " + objClass.getName());
        System.out.println("objClass.getSimpleName() = " + objClass.getSimpleName());
        System.out.println("objClass.getPackage() = " + objClass.getPackage());
        System.out.println("objClass.descriptorString() = " + objClass.descriptorString());
        System.out.println("objClass.getSuperclass() = " + objClass.getSuperclass());
        System.out.println("objClass.getSuperclass().getSuperclass() = " + objClass.getSuperclass().getSuperclass());

        for (Method metodo :
                objClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
