package JavaDasar;

class MethodOverriding {

    String name;

    void sayHello(String name){
        System.out.println("Hello " + name + "My Name is " + this.name);
    }
}

class vicePresident extends MethodOverriding {

    void sayHello(String name){
        System.out.println("Hello " + name + "This is " + this.name);
    }

}