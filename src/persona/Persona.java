package persona;

public class Persona {
    private static int contadorPersona = 0;
    private int idPersona = 0;
    private String nombre;
    private String apellido;

    public Persona(){
    }

    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        //Incrementar el atributo static
        // Persona.contadorPersona++;
        //Asignamos el id único con ayuda de la variable estática contadorPersona
        this.idPersona = ++Persona.contadorPersona;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString(){
        return "ID: " + this.idPersona + ",Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Dir. Mem. " + super.toString();
    }

    public static int getContadorPersona(){
        return Persona.contadorPersona;
    }

}
