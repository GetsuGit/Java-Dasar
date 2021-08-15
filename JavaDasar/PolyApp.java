package JavaDasar;

public class PolyApp {
    public static void main(String[] args){

        Polymorphism poly = new Polymorphism("Getsu");
        poly.sayHello("Code");

        poly = new PolyChild("Design");
        poly.sayHello("Code");

        // Polymorphism Method
        sayHello(new Polymorphism("Getsu"));
        sayHello(new PolyChild("Code"));
;
    }

    // Type Check & Casts
    static void sayHello(Polymorphism poly){
        if  (poly instanceof PolyChild){

            PolyChild poly1 = (PolyChild) poly;
            System.out.println("Hello PolyChild : " + poly1.name);

        } else {
            System.out.println("Hello " + poly.name);
        }
    }

}
