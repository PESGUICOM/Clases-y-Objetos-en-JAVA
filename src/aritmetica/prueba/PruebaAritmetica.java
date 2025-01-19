package aritmetica.prueba;

import aritmetica.ClaseAritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Clase Aritm\u00E9tica ***");
        //Creando objeto
        var aritmetica1 = new ClaseAritmetica(15,3);
        System.out.println("Atributo operando 1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(10);
        aritmetica1.sumar();
        aritmetica1.restar();
        aritmetica1.multiplicacion();
        aritmetica1.division();
        System.out.println("Direcci\u00F3n en memoria objeto 1: " + aritmetica1);

        var aritmetica2 = new ClaseAritmetica(16, 2);
        System.out.println();
        aritmetica2.sumar();
        aritmetica2.restar();
        aritmetica2.multiplicacion();
        aritmetica2.division();
        System.out.println("Direcci\u00F3n en memoria objeto 2: "+ aritmetica2);
    }
}
