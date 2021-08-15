package JavaDasar;

public class AnpnymousApp {
   public static void main(String[] args){

       // Anonymous Class
       AnonymousInterface anom = new AnonymousInterface() {

           public void sayHello() {
               System.out.println("Getsu");
           }

           public void sayHello(String name) {
               System.out.println("Getsu : " + name);
           }
       };

       anom.sayHello();
       anom.sayHello("Design");

   }

}
