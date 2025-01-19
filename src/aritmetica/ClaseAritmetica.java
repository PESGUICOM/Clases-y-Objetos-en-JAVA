package aritmetica;

public class ClaseAritmetica {
    private int operando1;
    private int operando2;

    //Creando constructor vacío y sin parámetros
    public ClaseAritmetica(){
    }

    //Creando constructor con parámetros
    public ClaseAritmetica(int operando1, int operando2){
        System.out.println("Ejecutando constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Operador this: " + this);
    }

    //Creando métodos
    public void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado Suma: " + resultado);
    }

    public void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado Resta: " + resultado);
    }

    public void multiplicacion(){
        var resultado = operando1 * operando2;
        System.out.println("Resultado Multiplicaci\u00F3n: " + resultado);
    }

    public void division(){
        var resultado = operando1 / operando2;
        System.out.println("Resultado Divisi\u00F3n: " + resultado);
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
