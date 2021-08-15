package JavaDasar;

public class Polymorphism {

    String name;

    Polymorphism(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("Hi " + name + "it from SuperPoly " + this.name );
    }
}

class PolyChild extends Polymorphism{

    String company;

    PolyChild(String name){
        super(name);
    }

    PolyChild(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hi " + name + "My Name is Manager " + this.name );
    }

}
