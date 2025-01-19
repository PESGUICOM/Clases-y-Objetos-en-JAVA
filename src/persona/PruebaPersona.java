package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creaci\u00F3n de Clase y Objetos persona.Persona ***");

        System.out.println("Variable est\u00E1tica: " + Persona.getContadorPersona());
        var objeto1 = new Persona("C\u00E9sar", "Walker");
        System.out.println();

        var objeto2 = new Persona("Leandro", "Walker");

        System.out.println("Variable est\u00E1tica: " + Persona.getContadorPersona());
        var objeto3 = new Persona("Dana", "Walker");

        var objeto4 = new Persona("Cristina", "Bovier");

        System.out.println(objeto1); //automáticamente se llama el método toString
        System.out.println(objeto2);
        System.out.println(objeto3);
        System.out.println(objeto4);
        System.out.println("Variable est\u00E1tica: " + Persona.getContadorPersona());

        var objeto5 = new Persona("Giuliana", "Sol\u00E1");
        System.out.println(objeto5);
        System.out.println("Variable est\u00E1tica: " + Persona.getContadorPersona());

        var objeto6 = new Persona("Camila", "Cabral");
        System.out.println(objeto6);
    }
}
