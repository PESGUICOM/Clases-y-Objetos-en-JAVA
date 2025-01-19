package animales;

public class Animal {

    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal{
    protected void hacerSonido(){
        System.out.println("El perro hace woff...");
    }
}

class Gato extends Animal{
    protected void hacerSonido(){
        System.out.println("El gato hace miau...");
    }
}

class PruebaAnimal{

    //Método polimórfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        //Objeto de la clase Padre (Animal)
        //var animal = new Animal();
        //Apunta a la clase hija Perro
        //var animal = new Perro();
        //apunta a la clase Gato
        var animal = new Gato();
        imprimirSonido(animal);
    }
}
