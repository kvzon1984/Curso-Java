package ValorReferencia;

class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public String getNombre () {
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        System.out.println("Iniciamos el metodo main");
        Persona persona= new Persona();
        persona.modificarNombre("Isaac");
        System.out.println("Persona.nombre = " + persona.getNombre());

        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Después de llamar el metodo test");
        System.out.println("Persona.nombre = " + persona.getNombre());
        System.out.println("Finalizamos con el main con el valor de persona ya modificados");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Luis");
        System.out.println("Finalizamos con el metodo test");
    }
}
