package JavaDasar;

class SuperConstructor {
    String name;

    SuperConstructor(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("Hi" + name + "May Name is " + this.name);
    }
}

class Construc extends SuperConstructor{

    Construc(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hi" + name + "May Name is " + this.name);
    }

}